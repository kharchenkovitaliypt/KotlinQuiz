package com.test.kotlinquiz.viewmodel

import com.test.kotlinquiz.data.OptAnswer
import com.test.kotlinquiz.data.Points
import com.test.kotlinquiz.data.Question
import com.test.kotlinquiz.service.QuizService
import kotlinx.coroutines.launch

class QuizViewModel(
    private val quizService: QuizService
) : CoroutineViewModel() {

    init {
        launch {
            questionState.value(quizService.startQuiz().toState())
        }
    }

    val totalPoints = MutableLiveData<Points>().apply { value(0) }
    val questionState = MutableLiveData<QuestionState>()

    fun processAnswer(answer: String) = processAnswer(answer as Any)

    fun processAnswer(answer: OptAnswer) = processAnswer(answer as Any)

    private fun processAnswer(answer: Any) {
        launch {
            val question = (questionState.getValue() as QuestionState.Value?)?.value ?: return@launch
            val result = quizService.processAnswer(question, answer)

            totalPoints.value(result.totalPoints)

            if (result.nextQuestion != null) {
                questionState.value(result.nextQuestion.toState())
            } else {
                questionState.value(QuestionState.Done(result.totalPoints))
            }
        }
    }
}

sealed class QuestionState {
    class Value(val value: Question): QuestionState()
    class Done(val totalPoints: Long): QuestionState()
}
fun Question.toState() = QuestionState.Value(this)
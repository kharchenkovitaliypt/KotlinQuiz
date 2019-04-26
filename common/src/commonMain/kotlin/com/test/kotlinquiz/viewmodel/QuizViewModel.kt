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
            questionState.data = quizService.startQuiz().toState()
        }
    }

    val totalPoints = PointsLiveData()
    val questionState = QuestionStateLiveData()

    fun processAnswer(answer: String) = processAnswer(answer as Any)

    fun processAnswer(answer: OptAnswer) = processAnswer(answer as Any)

    private fun processAnswer(answer: Any) = launch {
        val question = (questionState.data as QuestionState.Value).value
        val result = quizService.processAnswer(question, answer)

        totalPoints.data = result.totalPoints

        if (result.nextQuestion != null) {
            questionState.data = result.nextQuestion.toState()
        } else {
            questionState.data = QuestionState.Done(result.totalPoints)
        }
    }
}

sealed class QuestionState {
    class Value(val value: Question): QuestionState()
    class Done(val totalPoints: Long): QuestionState()
}
fun Question.toState() = QuestionState.Value(this)

class PointsLiveData : MutableLiveData<Points>(0)
class QuestionStateLiveData : MutableLiveData<QuestionState>()
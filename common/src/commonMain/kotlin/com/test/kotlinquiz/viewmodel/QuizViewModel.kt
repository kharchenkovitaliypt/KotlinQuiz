package com.test.kotlinquiz.viewmodel

import com.test.kotlinquiz.data.OptAnswer
import com.test.kotlinquiz.data.Points
import com.test.kotlinquiz.data.Question
import com.test.kotlinquiz.service.QuizService
import kotlinx.coroutines.launch

sealed class QuestionState {
    class Value(val value: Question): QuestionState()
    class Done(val totalPoints: Long): QuestionState()
}
fun Question.toState() = QuestionState.Value(this)

class PointsLiveData : MutableLiveData<Points>(0)
class QuestionStateLiveData : MutableLiveData<QuestionState>()

class QuizViewModel(
    private val quizService: QuizService
) : CoroutineViewModel() {

    init {
        launch {
            questionStateLiveData.data = quizService.startQuiz().toState()
        }
    }

    val totalPointsLiveData = PointsLiveData()
    val questionStateLiveData = QuestionStateLiveData()

    fun processAnswer(answer: String) = processAnswer(answer as Any)

    fun processAnswer(answer: OptAnswer) = processAnswer(answer as Any)

    private fun processAnswer(answer: Any) = launch {
        val question = (questionStateLiveData.data as QuestionState.Value).value
        val result = quizService.processAnswer(question, answer)

        totalPointsLiveData.data = result.totalPoints

        if (result.nextQuestion != null) {
            questionStateLiveData.data = result.nextQuestion.toState()
        } else {
            questionStateLiveData.data = QuestionState.Done(result.totalPoints)
        }
    }
}
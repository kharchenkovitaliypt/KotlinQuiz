package com.test.kotlinquiz.viewmodel

import com.test.kotlinquiz.data.OptAnswer
import com.test.kotlinquiz.data.Points
import com.test.kotlinquiz.data.Question
import com.test.kotlinquiz.service.QuizService
import kotlinx.coroutines.launch

class QuizViewModel(
    private val quizService: QuizService
) : CoroutineViewModel() {

    val totalPointsLD = MutableLiveData<Points>(0)
    val questionLD = MutableLiveData<Question?>()
    val doneLD = MutableLiveData<Points>()

    init {
        launch {
            questionLD.value = quizService.startQuiz()
        }
    }

    fun processAnswer(answer: String) = processAnswer(answer as Any)

    fun processAnswer(answer: OptAnswer) = processAnswer(answer as Any)

    private fun processAnswer(answer: Any) = launch {
        val question = questionLD.value!!
        val result = quizService.processAnswer(question, answer)

        totalPointsLD.value = result.totalPoints

        if (result.nextQuestion != null) {
            questionLD.value = result.nextQuestion
        } else {
            questionLD.value = null
            doneLD.value = totalPointsLD.value
        }
    }
}
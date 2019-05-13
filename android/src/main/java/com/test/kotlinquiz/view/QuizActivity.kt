package com.test.kotlinquiz.view

import android.content.res.AssetManager
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.test.kotlinquiz.R
import com.test.kotlinquiz.data.InputQuestion
import com.test.kotlinquiz.data.OptQuestion
import com.test.kotlinquiz.data.Question
import com.test.kotlinquiz.service.AssetServiceImpl
import com.test.kotlinquiz.service.QuizService
import com.test.kotlinquiz.viewmodel.QuestionState
import com.test.kotlinquiz.viewmodel.QuizViewModel
import com.test.kotlinquiz.viewmodel.observe
import kotlinx.android.synthetic.main.activity_quiz.view.*

class QuizActivity : AppCompatActivity() {

    lateinit var viewModel: QuizViewModel

    private val view: View get() = findViewById(android.R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        viewModel = ViewModelProviders.of(this, QuizViewModelFactory(assets))
            .get(QuizViewModel::class.java)

        viewModel.totalPoints.observe(this) { totalPoints ->
            view.totalPoints.text = "Total points: $totalPoints"
        }
        viewModel.questionState.observe(this) {
            when (it) {
                is QuestionState.Value -> showQuestion(it.value)
                is QuestionState.Done -> showDone(it.totalPoints)
            }
        }

        view.next.setOnClickListener {
            when (val fragment = supportFragmentManager.findFragmentById(R.id.container)) {
                is OptQuestionFragment -> {
                    fragment.validateAndGetAnswer()?.let {
                        viewModel.processAnswer(it)
                    }
                }
                is InputQuestionFragment -> {
                    fragment.validateAndGetAnswer()?.let {
                        viewModel.processAnswer(it)
                    }
                }
            }
        }
    }

    private fun showDone(totalPoints: Long) {
        view.question.text = ""
        view.next.isVisible = false
        supportFragmentManager.removeById(R.id.container)
        showMessage("Quiz is done. Your score: $totalPoints!!")
    }

    private fun showQuestion(question: Question) {
        view.question.text = question.text

        val fragment = when (question) {
            is OptQuestion -> OptQuestionFragment.newInstance(question)
            is InputQuestion -> InputQuestionFragment.newInstance(question)
            else -> throw RuntimeException()
        }
        supportFragmentManager.replace(R.id.container, fragment)
    }
}

private class QuizViewModelFactory(val assets: AssetManager) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
        = QuizViewModel(QuizService(AssetServiceImpl(assets))) as T
}

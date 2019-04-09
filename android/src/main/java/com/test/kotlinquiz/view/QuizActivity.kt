package com.test.kotlinquiz.view

import android.content.Context
import android.content.res.AssetManager
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.test.kotlinquiz.R
import com.test.kotlinquiz.data.InputQuestion
import com.test.kotlinquiz.data.OptQuestion
import com.test.kotlinquiz.data.Question
import com.test.kotlinquiz.service.AssetService
import com.test.kotlinquiz.service.QuizService
import com.test.kotlinquiz.viewmodel.QuizViewModel
import kotlinx.android.synthetic.main.activity_quiz.view.*

class QuizActivity : AppCompatActivity() {

    lateinit var viewModel: QuizViewModel

    private val view: View get() = findViewById(android.R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        viewModel = ViewModelProviders.of(this, QuizViewModelFactory(assets))
            .get(QuizViewModel::class.java)

        viewModel.totalPointsLD.observe(this) { totalPoints ->
            view.totalPoints.text = totalPoints.toString()
        }
        viewModel.questionLD.observe(this) {
            setQuestion(it)
        }
        viewModel.doneLD.observe(this) { totalPoints ->
            showMessage("Quiz is done. Your score: $totalPoints!!")
            view.next.isVisible = false
        }

        view.next.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentById(R.id.container)
            when (fragment) {
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

    fun setQuestion(question: Question?) {
        view.question.text = question?.text ?: ""

        if (question == null) {
            supportFragmentManager.findFragmentById(R.id.container)?.let {
                supportFragmentManager.beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .remove(it)
                    .commit()
            }
        } else {
            val fragment = when (question) {
                is OptQuestion -> OptQuestionFragment.newInstance(question)
                is InputQuestion -> InputQuestionFragment.newInstance(question)
                else -> throw IllegalArgumentException()
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit()
        }
    }
}

fun Context.showMessage(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).apply {
        setGravity(Gravity.BOTTOM, xOffset, yOffset + 200)
        show()
    }
}

private class QuizViewModelFactory(val assets: AssetManager) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
        = QuizViewModel(QuizService(AssetService(assets))) as T
}

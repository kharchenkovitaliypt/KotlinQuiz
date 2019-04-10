package com.test.kotlinquiz.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.core.view.children
import androidx.fragment.app.Fragment
import com.test.kotlinquiz.R
import com.test.kotlinquiz.data.OptAnswer
import com.test.kotlinquiz.data.OptQuestion
import com.test.kotlinquiz.data.OptQuestionDto
import kotlinx.serialization.json.Json


class OptQuestionFragment : Fragment() {

    companion object {
        fun newInstance(question: OptQuestion) = OptQuestionFragment().apply {
            arguments = Bundle().apply {
                putString("value", Json.stringify(OptQuestionDto.serializer(), question as OptQuestionDto))
            }
        }
    }
    private val question: OptQuestion  by lazy {
        Json.parse(OptQuestionDto.serializer(), arguments!!.getString("value")!!)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val radioGroup = inflater.inflate(R.layout.fragment_opt_question, container, false) as RadioGroup
        question.answers.forEach { answer ->
            radioGroup.addView<RadioButton>(R.layout.opt_question_button) {
                text = answer.content
                tag = answer
            }
        }
        return radioGroup
    }

    fun validateAndGetAnswer(): OptAnswer? {
        val answer = (view!! as RadioGroup).children
            .map { it as RadioButton }
            .find { it.isChecked }
            ?.let { it.tag as OptAnswer }

        if (answer == null) {
            context?.showMessage("Please select something.")
        }
        return answer
    }
}

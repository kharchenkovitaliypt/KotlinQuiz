package com.test.kotlinquiz.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.test.kotlinquiz.R
import com.test.kotlinquiz.data.InputQuestion
import com.test.kotlinquiz.data.InputQuestionDto
import kotlinx.serialization.json.Json

class InputQuestionFragment : Fragment() {

    companion object {
        fun newInstance(question: InputQuestion) = InputQuestionFragment().apply {
            arguments = Bundle().apply {
                putString("value", Json.stringify(InputQuestionDto.serializer(), question as InputQuestionDto))
            }
        }
    }
    private val question: InputQuestion by lazy {
        Json.parse(InputQuestionDto.serializer(), arguments!!.getString("value")!!)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = container!!.inflate(R.layout.fragment_input_question)

    fun validateAndGetAnswer(): String? {
        val editText = (view!! as EditText)
        val answer = editText.text.toString()

        question.validator // TODO implement

        if (answer.isEmpty()) {
            editText.error = "Please input something."
            return null
        }
        return answer
    }
}
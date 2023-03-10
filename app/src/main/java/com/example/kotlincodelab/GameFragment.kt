package com.example.kotlincodelab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.kotlincodelab.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,
            R.layout.fragment_game, container, false)

        binding.submitButton.setOnClickListener @Suppress("UNUSED_ANONYMOUS_PARAMETER"){
            val checkedId = binding.questionRadioGroup.checkedRadioButtonId

            if(-1 != checkedId) {
                var answerIndex = 0
                when(checkedId) {
                    R.id.firstAnswerRadioButton -> answerIndex = 1
                    R.id.secondAnswerRadioButton -> answerIndex = 2
                    R.id.thirdAnswerRadioButton -> answerIndex = 3
                    R.id.fourthAnswerRadioButton -> answerIndex = 4
                }
                if(answerIndex == 2) {
                    //won
                    it.findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
                } else {
                    //over
                    it.findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
                }
            }
        }
        return binding.root
    }
}
package com.example.countriesoftheworld.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.countriesoftheworld.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {

    private var mBinding: FragmentQuizBinding? = null

    val args: QuizFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentQuizBinding.inflate(inflater, container, false)
        return mBinding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when (args.quiz.toUpperCase()) {
            "FLAGS" -> {
                mBinding!!.ivCountryFlag.visibility = View.INVISIBLE
            }
        }
    }

    private fun setQuestion(question: String){
        TODO("Set method")
    }

    private fun setFlagQuestion() {
        TODO("Set method")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }

}
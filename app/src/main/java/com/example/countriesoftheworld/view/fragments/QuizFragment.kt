package com.example.countriesoftheworld.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.countriesoftheworld.R
import com.example.countriesoftheworld.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {

    private var mBinding: FragmentQuizBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentQuizBinding.inflate(inflater, container, false)
        return mBinding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }

}
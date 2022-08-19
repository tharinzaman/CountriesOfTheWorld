package com.example.countriesoftheworld.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.countriesoftheworld.databinding.FragmentQuizzesBinding

class QuizzesFragment : Fragment() {

    private var mBinding: FragmentQuizzesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentQuizzesBinding.inflate(inflater, container, false)
        return mBinding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }
}
package com.example.countriesoftheworld.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.countriesoftheworld.R
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set the OnClickListeners
        mBinding!!.btnCapitals.setOnClickListener {
            navigateToQuiz(mBinding!!.btnCapitals)
        }
        mBinding!!.btnContinent.setOnClickListener {
            navigateToQuiz(mBinding!!.btnContinent)
        }
        mBinding!!.btnCurrencies.setOnClickListener {
            navigateToQuiz(mBinding!!.btnCurrencies)
        }
        mBinding!!.btnFlags.setOnClickListener {
            navigateToQuiz(mBinding!!.btnFlags)
        }
        mBinding!!.btnLanguages.setOnClickListener {
            navigateToQuiz(mBinding!!.btnLanguages)
        }
        mBinding!!.btnPopulation.setOnClickListener {
            navigateToQuiz(mBinding!!.btnPopulation)
        }
    }

    private fun navigateToQuiz(quiz: Button) {
        if (mBinding!!.etName.text!!.isNotEmpty()) {
            findNavController().navigate(
                QuizzesFragmentDirections.actionNavigationQuizzesToNavigationQuiz(
                    quiz.text as String
                )
            )
        } else {
            Toast.makeText(this@QuizzesFragment.requireActivity(), getString(R.string.name_warning),
                Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }
}
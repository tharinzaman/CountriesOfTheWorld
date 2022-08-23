package com.example.countriesoftheworld.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.fragment.navArgs
import com.example.countriesoftheworld.databinding.FragmentQuizBinding
import com.example.countriesoftheworld.viewmodel.CountryViewModel

class QuizFragment : Fragment() {

    private var mBinding: FragmentQuizBinding? = null

    private lateinit var mRandomCountryViewModel: CountryViewModel

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
        mRandomCountryViewModel = ViewModelProvider(this).get(CountryViewModel::class.java)

        mRandomCountryViewModel.getRandomCountryFromAPI()
        countryViewModelObserver()
    }

    // Observing the responses

    private fun countryViewModelObserver() {
        mRandomCountryViewModel.countryResponse.observe(viewLifecycleOwner,
            { countryResponse ->
                countryResponse?.let {
                    mBinding!!.tvQuestion.text = countryResponse.name.common
                }
            })
        mRandomCountryViewModel.loadingError.observe(viewLifecycleOwner,
            { dataError ->
                dataError.let {
                    mBinding!!.tvQuestion.text = "Error Loading"
                }
            })
        mRandomCountryViewModel.isCountryLoading.observe(viewLifecycleOwner,
            { isLoading ->
                isLoading?.let {
                    mBinding!!.tvQuestion.text = "Currently Loading"
                }
            })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }

}
package com.example.countriesoftheworld.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countriesoftheworld.model.entities.Country
import com.example.countriesoftheworld.model.network.CountryAPIService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers

class CountryViewModel : ViewModel() {

    private val randomCountryAPIService = CountryAPIService()
    private val compositeDisposable = CompositeDisposable()

    val isCountryLoading = MutableLiveData<Boolean>()
    val countryResponse = MutableLiveData<Country>()
    val loadingError = MutableLiveData<Boolean>()

    fun getRandomCountryFromAPI() {

        isCountryLoading.value = true

        compositeDisposable.add(
            randomCountryAPIService.getCountry()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object: DisposableSingleObserver<Country>(){
                    override fun onSuccess(value: Country) {
                        isCountryLoading.value = false
                        countryResponse.value = value
                        loadingError.value = false
                    }

                    override fun onError(e: Throwable) {
                        isCountryLoading.value = false
                        loadingError.value = true
                        e.printStackTrace()
                    }
                })
        )
    }
}
package com.example.countriesoftheworld.model.network

import com.example.countriesoftheworld.Constants
import com.example.countriesoftheworld.model.entities.Country
import io.reactivex.rxjava3.core.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CountryAPIService {

    private val api = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()
        .create(CountryAPI::class.java)

    fun getCountry(): Single<Country>{
        return api.getCountry()
    }
}
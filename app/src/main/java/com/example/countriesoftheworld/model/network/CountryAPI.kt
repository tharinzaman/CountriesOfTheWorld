package com.example.countriesoftheworld.model.network

import com.example.countriesoftheworld.Constants
import com.example.countriesoftheworld.model.entities.Country
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface CountryAPI {

    @GET(Constants.API_ENDPOINT)
    fun getCountry(): Single<Country>

}
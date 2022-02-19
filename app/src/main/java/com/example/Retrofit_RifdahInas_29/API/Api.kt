package com.example.Retrofit_RifdahInas_29.API

import com.example.Retrofit_RifdahInas_29.model.IndonesiaResponse
import com.example.Retrofit_RifdahInas_29.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}
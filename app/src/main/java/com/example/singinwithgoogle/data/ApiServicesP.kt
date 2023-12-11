package com.example.singinwithgoogle.data

import retrofit2.http.GET

interface ApiServicesP {
    @GET("products")
    suspend fun getProducts():ProductPojo?

}
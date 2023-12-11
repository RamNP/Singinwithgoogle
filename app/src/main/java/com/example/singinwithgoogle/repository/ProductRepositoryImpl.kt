package com.example.singinwithgoogle.repository

import com.example.singinwithgoogle.data.ApiServicesP
import com.example.singinwithgoogle.data.ProductPojo

class ProductRepositoryImpl(private val apiServicesP: ApiServicesP): ProductRepository {
    override suspend fun getProductDetails(): ProductPojo? {
        try {
             return apiServicesP.getProducts() ?: throw Exception("Error")
        } catch (e: Exception){
            throw Exception(e)
        }

    }

}

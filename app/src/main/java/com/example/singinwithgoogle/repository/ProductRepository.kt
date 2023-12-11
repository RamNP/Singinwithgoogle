package com.example.singinwithgoogle.repository

import com.example.singinwithgoogle.data.ProductPojo

interface ProductRepository {
    suspend fun getProductDetails(): ProductPojo?

}
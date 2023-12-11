package com.example.singinwithgoogle.data

data class ProductPojo(
	val productPojo: List<ProductPojoItem?>? = null
)

data class ProductPojoItem(
	val image: String? = null,
	val price: Any? = null,
	val rating: Rating? = null,
	val description: String? = null,
	val id: Int? = null,
	val title: String? = null,
	val category: String? = null
)

data class Rating(
	val rate: Any? = null,
	val count: Int? = null
)


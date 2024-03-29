package com.example.wildberriesweekfive3

import kotlinx.serialization.Serializable

@Serializable
data class CatJSONItem(
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)
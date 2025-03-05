package com.example.amphibians.model

import kotlinx.serialization.SerialName

data class Amphibian(
    val name: String,
    val type: String,
    val description: String,
    @SerialName(value = "img_src")
    val impSrc: String
)

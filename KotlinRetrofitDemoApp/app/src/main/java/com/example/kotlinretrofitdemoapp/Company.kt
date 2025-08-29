package com.example.kotlinretrofitdemoapp

import com.google.gson.annotations.SerializedName

data class Company(
    val name: String,
    val countryCode: String,

    @SerializedName("market_cap")
    val marketCap: Double,
    val id: Int
)

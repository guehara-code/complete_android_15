package com.example.kotlinretrofitdemoapp

import retrofit2.Response
import retrofit2.http.GET

interface CompaniesService {

    @GET("/companies")
    fun getAllCompanies(): Response<CompaniesList>

}
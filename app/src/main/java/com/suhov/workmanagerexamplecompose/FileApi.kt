package com.suhov.workmanagerexamplecompose

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

//https://www.countrysideveterinaryclinic.org/sites/default/files/interesting-cat-facts.jpg
interface FileApi {
    @GET("/sites/default/files/interesting-cat-facts.jpg")
    suspend fun downloadImage(): Response<ResponseBody>

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://www.countrysideveterinaryclinic.org")
                .build()
                .create(FileApi::class.java)
        }
    }
}
package com.example.projecttam_2457051010.data.api

import com.example.projecttam_2457051010.data.model.Layanan
import retrofit2.http.GET

interface ApiService {
    @GET("layanan_laundry.json")
    suspend fun getLayanan(): List<Layanan>
}
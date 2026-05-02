package com.example.projecttam_2457051010.network

import com.example.projecttam_2457051010.model.Food
import retrofit2.http.GET

interface ApiService {
    @GET("layanan_laundry.json") // Sesuai endpoint dari URL Gist
    suspend fun getFoods(): List<Food>
}
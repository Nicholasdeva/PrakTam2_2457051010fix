package com.example.projecttam_2457051010.data.repository

import com.example.projecttam_2457051010.data.api.RetrofitClient
import com.example.projecttam_2457051010.data.model.Layanan

class LayananRepository {
    suspend fun getLayanan(): List<Layanan> {
        return try {
            RetrofitClient.instance.getLayanan()
        } catch (e: Exception) {
            emptyList()
        }
    }
}
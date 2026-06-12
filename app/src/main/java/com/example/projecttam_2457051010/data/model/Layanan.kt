package com.example.projecttam_2457051010.data.model

import com.google.gson.annotations.SerializedName

data class Layanan(
    @SerializedName("nama")
    val nama: String,

    @SerializedName("deskripsi")
    val deskripsi: String,

    @SerializedName("harga")
    val harga: Int,

    @SerializedName("image_url")
    val imageUrl: String
)
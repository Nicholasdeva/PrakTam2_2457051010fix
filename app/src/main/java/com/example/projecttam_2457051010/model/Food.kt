package com.example.projecttam_2457051010.model

import com.google.gson.annotations.SerializedName

data class Food(
    @SerializedName("nama")
    val nama: String,

    @SerializedName("deskripsi")
    val deskripsi: String,

    @SerializedName("harga")
    val harga: Int,

    @SerializedName("image_url")
    val imageUrl: String

//    @SerializedName("image_url")
//    val imageUrl: String
)



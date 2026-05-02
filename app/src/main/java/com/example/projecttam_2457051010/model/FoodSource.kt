package com.example.projecttam_2457051010.model

import android.content.Context

object FoodSource {
    fun getResourceId(context: Context, imageName: String): Int {
        return context.resources.getIdentifier(imageName, "drawable", context.packageName)
    }
}
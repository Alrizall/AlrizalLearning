package com.example.alrizallearning.data

import androidx.annotation.DrawableRes

data class DashboardInformation(
    val id : Int,
    @DrawableRes
    val image : Int,
    val title : String
)

package com.example.core;

import androidx.annotation.DrawableRes

data class TugasInformation(
    val id: Int,
    val decription: String,
    @DrawableRes
    val image: Int?) {
}


package com.example.alrizallearning.data

import android.icu.text.CaseMap.Title
import android.net.Uri
import androidx.annotation.DrawableRes

data class MateriInformation (
    val id: Int,
    @DrawableRes
    val image: Int,
    val title: String,
    val uri : String?){
}
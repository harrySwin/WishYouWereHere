package com.example.wishyouwerehere

import android.graphics.Picture
import android.graphics.drawable.Drawable
import android.os.Parcelable
import android.widget.ImageView
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(val name: String,
                    val location: String,
                    val date: String,
                    val rating: Int, val description: String,
                    val imageName: String): Parcelable

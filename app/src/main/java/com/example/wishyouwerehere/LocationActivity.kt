package com.example.wishyouwerehere

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.annotation.RequiresApi

class LocationActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.LocationActivity)
        setContentView(R.layout.activity_location)

        //Retrieving location object from intent created in MainActivity.kt
        val location = intent.getParcelableExtra<Location>("location")

        //if the location object is not null execute...
        location?.let {
            //Channging textViews to corresponding location details.
            findViewById<TextView>(R.id.focusedName).setText(Html.fromHtml("<b>Name:</b> " + location.name))
            findViewById<TextView>(R.id.focusedLocation).setText(Html.fromHtml("<b>Located:</b> " + location.location))
            findViewById<TextView>(R.id.focusedDate).setText(Html.fromHtml("<b>Date last visited:</b> " + location.date))
            findViewById<TextView>(R.id.focusedDescription).text = location.description
            findViewById<RatingBar>(R.id.focusedRating).setRating(location.rating.toFloat())

            //Change image using the Locatoion.imageName as a reference
            findViewById<ImageView>(R.id.focusedImage).setImageResource(getResources().getIdentifier(location.imageName,"drawable",getPackageName()))
        }
    }
}
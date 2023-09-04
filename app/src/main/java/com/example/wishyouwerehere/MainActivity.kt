package com.example.wishyouwerehere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creation of location objects
        val location1 = Location("Rod Laver Arena", "Melbounre Park", "22/1/2023",5, "Rod Laver Arena is a multipurpose arena located within Melbourne Park, in Melbourne, Victoria, Australia. The arena is the main venue for the Australian Open, the first Grand Slam tennis tournament of the calendar year.", "rod_laver_arena")
        val location2 = Location("Shrine of Rememberance", "Kings Domain",  "6/4/2021", 4, "The Shrine of Remembrance is a war memorial in Melbourne, Victoria, Australia, located in Kings Domain on St Kilda Road. It was built to honour the men and women of Victoria who served in World War I, but now functions as a memorial to all Australians who have served in any war.", "shrine_of_rememberance")
        val location3 = Location("Melbourne Museum", "Carlton Gardens", "31/8/2022", 4, "The Melbourne Museum is a natural and cultural history museum located in the Carlton Gardens in Melbourne, Australia. Located adjacent to the Royal Exhibition Building, the museum was opened in 2000 as a project of the Government of Victoria, on behalf of Museums Victoria which administers the venue.", "melbourne_museum")
        val location4 = Location("AAMI Park", "Olympic Blyd", "25/12/2018",3, "The Melbourne Rectangular Stadium, referred to as AAMI Park due to a sponsorship arrangement, is an outdoor sports stadium situated on the grounds of Edwin Flack Field within the Sports and Entertainment Precinct in the heart of the Melbourne central business district.", "aami_park_football")

        //Change activity textViews for location titles and ratings.
        //Location1
        findViewById<TextView>(R.id.titleView1).text = "Title: " + location1.name
        findViewById<RatingBar>(R.id.ratingView1).setRating(location1.rating.toFloat())

        //Location2
        findViewById<TextView>(R.id.titleView2).text = "Title: " + location2.name
        findViewById<RatingBar>(R.id.ratingView2).setRating(location2.rating.toFloat())

        //Location3
        findViewById<TextView>(R.id.titleView3).text = "Title: " + location3.name
        findViewById<RatingBar>(R.id.ratingView3).setRating(location3.rating.toFloat())

        //Location4
        findViewById<TextView>(R.id.titleView4).text = "Title: " + location4.name
        findViewById<RatingBar>(R.id.ratingView4).setRating(location4.rating.toFloat())

        //Listener events for images
        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        imageView1.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java).apply {
                putExtra("location",location1)
            }
            startActivity(intent)
        }
        val imageView2 = findViewById<ImageView>(R.id.focusImage)
        imageView2.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java).apply {
                putExtra("location",location2)
            }
            startActivity(intent)
        }
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        imageView3.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java).apply {
                putExtra("location",location3)
            }
            startActivity(intent)
        }
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        imageView4.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java).apply {
                putExtra("location",location4)
            }
            startActivity(intent)
        }
    }
}
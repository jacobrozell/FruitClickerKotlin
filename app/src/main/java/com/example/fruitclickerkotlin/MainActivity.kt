package com.example.fruitclickerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        var currentPicture = 0
        val appleImages: IntArray = intArrayOf(
            R.drawable.apple0,
            R.drawable.apple1,
            R.drawable.apple2,
            R.drawable.apple3,
            R.drawable.apple4
        )

        val scoreView = findViewById<TextView>(R.id.scoreView)
        val appleImageView = findViewById<ImageView>(R.id.appleView)

        appleImageView.setOnClickListener {
            count.inc()
            currentPicture = count % appleImages.size
            scoreView.text = getString(count)
            //appleImageView.setImageResource(appleImages[currentPicture])
        }
    }
}
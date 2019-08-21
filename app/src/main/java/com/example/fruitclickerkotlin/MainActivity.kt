package com.example.fruitclickerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intro = Toast.makeText(applicationContext, "Press the Apple to eat it!", Toast.LENGTH_LONG)
        intro.show()

        var count = 0
        var multiplier = 1
        var applesEaten = 0
        val bitesToEatApple = 5
        var currentPicture: Int = 0
        var lastPicture: Int = 0
        val appleImages: IntArray = intArrayOf(
            R.drawable.apple0,
            R.drawable.apple1,
            R.drawable.apple2,
            R.drawable.apple3,
            R.drawable.apple4
        )

        val totalClickView = findViewById<TextView>(R.id.clickCountView)
        val totalApplesEaten = findViewById<TextView>(R.id.applesEatenCount)
        val appleImageView = findViewById<ImageView>(R.id.appleView)

        appleImageView.setOnClickListener {

            count += multiplier

            // Logic
            if (applesEaten == 5) {
                multiplier = 2
                val toast = Toast.makeText(applicationContext, "Multiplier increased to " + multiplier, Toast.LENGTH_SHORT)
                toast.show()
            }
            if (applesEaten == 20) {
                multiplier = 3
                val toast = Toast.makeText(applicationContext, "Multiplier increased to " + multiplier, Toast.LENGTH_SHORT)
                toast.show()
            }
            if (applesEaten == 50) {
                multiplier = 6
                val toast = Toast.makeText(applicationContext, "Multiplier increased to " + multiplier, Toast.LENGTH_SHORT)
                toast.show()
            }
            if (applesEaten == 100) {
                multiplier = 8
                val toast = Toast.makeText(applicationContext, "Multiplier increased to " + multiplier, Toast.LENGTH_SHORT)
                toast.show()
            }
            if (applesEaten == 250) {
                multiplier = 12
                val toast = Toast.makeText(applicationContext, "Multiplier increased to " + multiplier, Toast.LENGTH_SHORT)
                toast.show()
            }

            // Set image
            currentPicture = count % appleImages.size

            if (currentPicture <= lastPicture) {
                applesEaten += 1
            }

            lastPicture = currentPicture
            appleImageView.setImageResource(appleImages[currentPicture])

            // Update labels
            totalApplesEaten.text = applesEaten.toString()
            totalClickView.text = count.toString()
        }
    }
}



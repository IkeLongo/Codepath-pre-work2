package com.example.burpsnarp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // User can tap a button to change the text color of the label.
        // 1. Add a button1 to our layout

        // Get a reference to button1
        // 2. Set up logic to know when user has tapped on button1.
        findViewById<Button>(R.id.button1).setOnClickListener {
            // Handle button tap
            // 2. Change the color of the text.
            Log.i("Isaac", "Tapped on button1")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        // User can tap a button to highlight text.
        // 1. Add a button2 to our layout

        // Get reference to button2
        // 2. Set up logic to know when user has tapped on button2.
        findViewById<Button>(R.id.button2).setOnClickListener {
            // Handle button tap
            // 2. Change the color of the text.
            Log.i("Isaac", "Tapped on button2")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setBackgroundColor(getResources().getColor(R.color.purple_200))
        }
    }
}
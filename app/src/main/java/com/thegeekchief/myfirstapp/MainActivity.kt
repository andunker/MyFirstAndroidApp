package com.thegeekchief.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)

        var timesClicked = 0

        btnClickMe.setOnClickListener {
            timesClicked += 1

            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "Hey Fabio", Toast.LENGTH_LONG).show()
        }
    }
}
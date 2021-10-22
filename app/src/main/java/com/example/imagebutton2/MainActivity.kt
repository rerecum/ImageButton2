package com.example.imagebutton2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageButton = findViewById<ImageButton>(R.id.imageButton)

        imageButton.setOnClickListener {
            imageButton.setImageResource(R.drawable.download)
        }
    }
}
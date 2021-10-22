package com.example.imagebutton2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageButton = findViewById<ImageButton>(R.id.imageButton)
        var zmienna = 0

        imageButton.setOnClickListener {
            if (zmienna == 0)
                imageButton.setImageResource(R.drawable.download)
            if (zmienna == 1)
                imageButton.setImageResource(R.drawable.ksiezyc)
            if (zmienna == 2)
                imageButton.setImageResource(R.drawable.kosmos)
            zmienna++
            zmienna%=3
        }
    }
}
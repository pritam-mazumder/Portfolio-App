package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBio = findViewById<Button>(R.id.btnBio)
        val btnDG = findViewById<Button>(R.id.btnDG)
        val btnOOU = findViewById<Button>(R.id.btnOOU)
        val btnGallery = findViewById<Button>(R.id.btnGallery)

        btnBio.setOnClickListener {
            intent = Intent(this, Bio::class.java)
            startActivity(intent)
        }

        btnDG.setOnClickListener {
            intent = Intent(this, GameDetails::class.java)
            startActivity(intent)
        }

        btnOOU.setOnClickListener {
            intent = Intent(this, OutOfUniverse::class.java)
            startActivity(intent)
        }

        btnGallery.setOnClickListener {
            intent = Intent(this, Gallery::class.java)
            startActivity(intent)
        }
    }
}
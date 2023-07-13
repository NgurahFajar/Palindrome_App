package com.ngurah.palindromeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btn_next = findViewById<Button>(R.id.btn_next)
        btn_next.setOnClickListener{
            val intent = Intent(this@MainActivity, SecondScreenActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.ngurah.palindromeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        supportActionBar?.hide()
    }
}
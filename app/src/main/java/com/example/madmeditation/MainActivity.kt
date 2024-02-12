package com.example.madmeditation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBoard(v: View) {
        val intent = Intent(this@MainActivity, Onboarding::class.java)
        startActivity(intent)
    }
}
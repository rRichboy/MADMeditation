package com.example.madmeditation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding)
    }

    fun moveLogin(view: View) {
        val intent = Intent(this, Login::class.java)
        this.startActivity(intent)
    }

    fun onRegister(view: View) {
        val intent = Intent(this, Register::class.java)
        this.startActivity(intent)
    }
}

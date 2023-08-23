package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val email = intent.getStringExtra("email")

        val usernameGreetingText = findViewById<TextView>(R.id.username)
        val logoutButton = findViewById<Button>(R.id.logoutSubmit)

        logoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        usernameGreetingText.text = "Olá ${email}"

    }

    override fun onDestroy() {
        super.onDestroy()
        val message = "Destruindo tela main"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        val message = "Tela Main esta interativa"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val loginEmail = findViewById<EditText>(R.id.loginEmail)
        val loginPassword = findViewById<EditText>(R.id.loginPassword)
        val loginButton = findViewById<Button>(R.id.loginSubmit)

        loginButton.setOnClickListener {
            val email = loginEmail.text.toString()
            val password = loginPassword.text.toString()

            val message = "Email=$email\nPassword=$password"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("email", email)
            startActivity(intent)

        }
    }
}
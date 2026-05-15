package com.example.hasta_shilpa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.emailEditText)
        val password = findViewById<EditText>(R.id.passwordEditText)
        val loginBtn = findViewById<Button>(R.id.loginButton)
        val signupText = findViewById<TextView>(R.id.signupText)

        loginBtn.setOnClickListener {

            val userEmail = email.text.toString()
            val userPassword = password.text.toString()

            if (userEmail.isEmpty() || userPassword.isEmpty()) {

                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this, "Login Successful " +
                        "\"Welcome to Hasta-Shilpa \uD83C\uDF3F\\nBeautiful Handmade Ideas Begin Here\"", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }

        signupText.setOnClickListener {

            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}
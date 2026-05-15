package com.example.hasta_shilpa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val name = findViewById<EditText>(R.id.nameEditText)
        val email = findViewById<EditText>(R.id.signupEmailEditText)
        val password = findViewById<EditText>(R.id.signupPasswordEditText)
        val signupBtn = findViewById<Button>(R.id.signupButton)

        signupBtn.setOnClickListener {

            val userName = name.text.toString()
            val userEmail = email.text.toString()
            val userPassword = password.text.toString()

            if (userName.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty()) {

                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this, "Account Created Successfully", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
    }
}
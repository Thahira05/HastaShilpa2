package com.example.hasta_shilpa

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PriceCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price_calculator)

        val material = findViewById<EditText>(R.id.materialCost)
        val labor = findViewById<EditText>(R.id.laborCost)
        val result = findViewById<TextView>(R.id.result)
        val button = findViewById<Button>(R.id.calculateBtn)

        button.setOnClickListener {

            val materialCost = material.text.toString().toDoubleOrNull() ?: 0.0
            val laborCost = labor.text.toString().toDoubleOrNull() ?: 0.0

            val total = materialCost + laborCost
            val finalPrice = total + (total * 0.20)

            result.text = "Suggested Price: ₹$finalPrice"
        }
    }
}
package com.example.hasta_shilpa

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val name = findViewById<EditText>(R.id.nameInput)
        val address = findViewById<EditText>(R.id.addressInput)
        val phone = findViewById<EditText>(R.id.phoneInput)

        val paymentGroup = findViewById<RadioGroup>(R.id.paymentGroup)
        val placeOrderBtn = findViewById<Button>(R.id.placeOrderBtn)

        placeOrderBtn.setOnClickListener {

            val selectedPaymentId = paymentGroup.checkedRadioButtonId
            val paymentMethod = findViewById<RadioButton>(selectedPaymentId)

            Toast.makeText(
                this,
                "Order placed successfully!",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
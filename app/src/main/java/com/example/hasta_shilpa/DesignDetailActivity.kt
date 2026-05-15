package com.example.hasta_shilpa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DesignDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_detail)

        val title = findViewById<TextView>(R.id.designTitle)
        val image = findViewById<ImageView>(R.id.designImage)
        val blueprint = findViewById<ImageView>(R.id.blueprintImage)

        val tutorialButton = findViewById<Button>(R.id.tutorialButton)
        val buyNowButton = findViewById<Button>(R.id.buyNowButton)

        val designTitle = intent.getStringExtra("title") ?: "Unknown"
        title.text = designTitle

        var videoUrl = ""
        var buyUrl = ""

        when (designTitle) {

            "Modern Bamboo Chair" -> {
                image.setImageResource(R.drawable.bamboo_chair)
                blueprint.setImageResource(R.drawable.blueprint1)

                videoUrl = "https://www.youtube.com/watch?v=CHAIR_VIDEO_ID"
                buyUrl = "https://yourshop.com/chair"
            }

            "Decorative Bamboo Lamp" -> {
                image.setImageResource(R.drawable.lamp_design)
                blueprint.setImageResource(R.drawable.blueprint2)

                videoUrl = "https://www.youtube.com/watch?v=LAMP_VIDEO_ID"
                buyUrl = "https://yourshop.com/lamp"
            }

            "Bamboo Laptop Stand" -> {
                image.setImageResource(R.drawable.laptop_stand)
                blueprint.setImageResource(R.drawable.blueprint3)

                videoUrl = "https://www.youtube.com/watch?v=STAND_VIDEO_ID"
                buyUrl = "https://yourshop.com/stand"
            }

            else -> {
                image.setImageResource(R.drawable.ic_launcher_foreground)
                blueprint.setImageResource(R.drawable.ic_launcher_foreground)

                videoUrl = "https://www.youtube.com"
                buyUrl = "https://yourshop.com"
            }
        }

        // ▶ OPEN VIDEO IN YOUTUBE / BROWSER
        tutorialButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
            startActivity(intent)
        }

        // 🛒 BUY NOW → OPEN CHECKOUT SCREEN
        buyNowButton.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }
}
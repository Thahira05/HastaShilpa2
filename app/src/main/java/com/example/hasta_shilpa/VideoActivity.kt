package com.example.hasta_shilpa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val button = findViewById<Button>(R.id.videoBtn)

        button.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW)

            intent.data =
                Uri.parse("https://www.youtube.com/results?search_query=bamboo+craft+tutorial")

            startActivity(intent)
        }
    }
}
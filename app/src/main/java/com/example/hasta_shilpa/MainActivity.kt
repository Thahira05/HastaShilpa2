package com.example.hasta_shilpa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: DesignAdapter
    private lateinit var designList: ArrayList<DesignModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager =
            LinearLayoutManager(this)

        designList = ArrayList()

        designList.add(
            DesignModel(
                "Modern Bamboo Chair",
                R.drawable.bamboo_chair,
                "Eco-friendly stylish chair",
                "₹2,499"
            )
        )

        designList.add(
            DesignModel(
                "Decorative Bamboo Lamp",
                R.drawable.lamp_design,
                "Modern handcrafted lamp",
                "₹1,299"
            )
        )

        designList.add(
            DesignModel(
                "Bamboo Laptop Stand",
                R.drawable.laptop_stand,
                "Minimal desk accessory",
                "₹899"
            )
        )

        adapter = DesignAdapter(designList)

        recyclerView.adapter = adapter
    }
}
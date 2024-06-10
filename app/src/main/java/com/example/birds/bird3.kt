package com.example.birds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birds.databinding.ActivityBird2Binding
import com.squareup.picasso.Picasso

class bird3 : AppCompatActivity() {
    lateinit var binding: ActivityBird2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBird2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPrev2.setOnClickListener {
            finish()
        }
        binding.btnNext2.setOnClickListener {
            val intent=Intent(this,bird4::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://i.pinimg.com/236x/43/d5/92/43d5929e64249991077be1a1719c83aa.jpg")
            .into(binding.imageView)
    }
}
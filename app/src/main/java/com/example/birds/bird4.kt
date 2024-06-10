package com.example.birds

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.birds.databinding.ActivityPeackockBinding
import com.squareup.picasso.Picasso

class bird4 : AppCompatActivity() {
    lateinit var binding: ActivityPeackockBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPeackockBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev3.setOnClickListener { finish() }
        binding.btnNext3.setOnClickListener { val intent= Intent(this,bird5::class.java)
            startActivity(intent)}
        Picasso
            .get()
            .load("https://i.pinimg.com/474x/94/a3/41/94a341ec45cc385afdcc9b77d1482d02.jpg")
            .into(binding.imageView4)

    }
    }

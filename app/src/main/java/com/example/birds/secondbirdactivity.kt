package com.example.birds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birds.databinding.ActivityColoredbirdBinding
import com.squareup.picasso.Picasso

class secondbirdactivity : AppCompatActivity() {
    lateinit var binding:ActivityColoredbirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityColoredbirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev.setOnClickListener {
            finish()
        }
        binding.btnNext.setOnClickListener {
        val intent = Intent(this, bird3::class.java)
        startActivity(intent)}
        Picasso
            .get()
            .load("https://i.pinimg.com/236x/73/9d/49/739d498ad1a9eda9928b6efffab291b5.jpg")
            .into(binding.imageView6)
    }

}




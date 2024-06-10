package com.example.birds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birds.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
      binding.btnNextf.setOnClickListener{
          val intent=Intent(this,secondbirdactivity::class.java)
          startActivity(intent)
      }
        Picasso
            .get().load("https://images.unsplash.com/photo-1480044965905-02098d419e96?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView5)
        }
    }

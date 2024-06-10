package com.example.birds

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityBird5Binding
import com.example.birds.databinding.ActivityPeackockBinding
import com.squareup.picasso.Picasso

class bird5 : AppCompatActivity() {
    lateinit var binding: ActivityBird5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBird5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnback.setOnClickListener { finish() }
        Picasso
            .get()
            .load("https://i.pinimg.com/236x/4b/56/ed/4b56ede443157d418ce24575aee8cb76.jpg")
            .into(binding.imageView2)
    }

}

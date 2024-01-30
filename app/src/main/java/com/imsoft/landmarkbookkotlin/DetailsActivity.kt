package com.imsoft.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imsoft.landmarkbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val landmark = intent.getSerializableExtra("landmark") as Landmark

        binding.titleText.text = landmark.name
        binding.descriptionText.text = landmark.detail
        binding.imageView.setImageResource(landmark.image)
    }
}
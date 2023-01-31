package com.example.covidtracker22_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.covidtracker22_23.databinding.ActivityCountyListBinding

class CountyListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountyListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountyListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
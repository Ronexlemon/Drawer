package com.example.drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawer.databinding.ActivityProfile2Binding
import com.example.drawer.databinding.FragmentHomeBinding

class ProfileActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityProfile2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfile2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
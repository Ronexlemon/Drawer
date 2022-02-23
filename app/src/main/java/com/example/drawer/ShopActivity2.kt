package com.example.drawer

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.drawer.databinding.ActivitySShopBinding

class ShopActivity2 : AppCompatActivity() {


    private lateinit var binding: ActivitySShopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
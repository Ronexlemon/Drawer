package com.example.drawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.example.drawer.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    private lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

      //  var drawerlayout : DrawerLayout = findViewById(R.id.drawer)
      //  var navview: NavigationView = findViewById(R.id.navview)
        toggle = ActionBarDrawerToggle(this,binding.drawer,R.string.open,R.string.close)
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.navview.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> {Toast.makeText(this,"home page", Toast.LENGTH_LONG).show()
                    var intent:Intent = Intent(this,ProfileActivity2::class.java)
                    startActivity(intent)}
                R.id.shop -> {Toast.makeText(this,"home page", Toast.LENGTH_LONG).show()
                var intent:Intent = Intent(this,ShopActivity2::class.java)
                    startActivity(intent)

              }
                R.id.send -> Toast.makeText(this,"send page", Toast.LENGTH_LONG).show()
                R.id.delete -> Toast.makeText(this,"delete page", Toast.LENGTH_LONG).show()
                R.id.setting -> {Toast.makeText(this,"shopping page ", Toast.LENGTH_LONG).show()
                  }

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
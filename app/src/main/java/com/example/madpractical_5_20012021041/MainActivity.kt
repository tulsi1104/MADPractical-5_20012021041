package com.example.madpractical_5_20012021041

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madpractical_5_20012021041.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }

    private fun play(){
        Intent(applicationContext,MediaService::class.java).putExtra(MediaService.DATA_KEY,MediaService.DATA_KEY).apply {
            startService(this)
        }
    }

   private fun stop()
   {
       Intent(applicationContext,MediaService::class.java).apply {
           stopService(this)
       }
   }
}
package com.example.madpractical_5_20012021041

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.madpractical_5_20012021041.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var playbtn : FloatingActionButton
    private lateinit var stopbtn : FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playbtn = findViewById(R.id.btn_play)
        playbtn.setOnClickListener(View.OnClickListener{
            play()
        })
        stopbtn = findViewById(R.id.btn_stop)
        stopbtn.setOnClickListener(View.OnClickListener{
            stop()
        }) }
    private fun play(){
        Intent(applicationContext, MediaService::class.java).putExtra(MediaService.DATA_KEY,MediaService.DATA_VALUE).apply { startService(this) } }
    private fun stop(){
        Intent(applicationContext,MediaService::class.java).apply { stopService(this) }
    }
}

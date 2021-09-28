package ru.bfu.kulagin.rukulaginlab_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity:kulagin.vasily", "onCreate")
        val settingsButton =findViewById(R.id.buttonSettings) as Button
        val aboutButton =findViewById(R.id.buttonAbout) as Button
        settingsButton.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        aboutButton.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }

    @SuppressLint("LongLogTag")
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity:kulagin.vasily", "onStart")
    }

    @SuppressLint("LongLogTag")
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity:kulagin.vasily", "onResume")
    }

    @SuppressLint("LongLogTag")
    override fun onPause() {
        super.onPause()
            Log.d("MainActivity:kulagin.vasily", "onPause")
    }

    @SuppressLint("LongLogTag")
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity:kulagin.vasily", "onStop")
    }

    @SuppressLint("LongLogTag")
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity:kulagin.vasily", "onDestroy")
    }

    @SuppressLint("LongLogTag")
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity:kulagin.vasily", "onRestart")
    }
}
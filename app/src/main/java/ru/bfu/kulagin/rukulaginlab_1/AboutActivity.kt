package ru.bfu.kulagin.rukulaginlab_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AboutActivity : AppCompatActivity() {
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Log.d("AboutActivity:kulagin.vasily", "onCreate")
    }

    @SuppressLint("LongLogTag")
    override fun onStart() {
        super.onStart()
        Log.d("AboutActivity:kulagin.vasily", "onStart")
    }

    @SuppressLint("LongLogTag")
    override fun onResume() {
        super.onResume()
        Log.d("AboutActivity:kulagin.vasily", "onResume")
    }

    @SuppressLint("LongLogTag")
    override fun onPause() {
        super.onPause()
        Log.d("AboutActivity:kulagin.vasily", "onPause")
    }

    @SuppressLint("LongLogTag")
    override fun onStop() {
        super.onStop()
        Log.d("AboutActivity:kulagin.vasily", "onStop")
    }

    @SuppressLint("LongLogTag")
    override fun onDestroy() {
        super.onDestroy()
        Log.d("AboutActivity:kulagin.vasily", "onDestroy")
    }

    @SuppressLint("LongLogTag")
    override fun onRestart() {
        super.onRestart()
        Log.d("AboutActivity:kulagin.vasily", "onRestart")
    }
}
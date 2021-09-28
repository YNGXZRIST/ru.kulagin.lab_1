package ru.bfu.kulagin.rukulaginlab_1

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat

class SettingsActivity : AppCompatActivity() {

    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)
        Log.d("SettingsActivity:kulagin.vasily", "onCreate")
    }

    @SuppressLint("LongLogTag")
    override fun onStart() {
        super.onStart()
        Log.d("SettingsActivity:kulagin.vasily", "onStart")
    }

    @SuppressLint("LongLogTag")
    override fun onResume() {
        super.onResume()
        Log.d("SettingsActivity:kulagin.vasily", "onResume")
    }

    @SuppressLint("LongLogTag")
    override fun onPause() {
        super.onPause()
        Log.d("SettingsActivity:kulagin.vasily", "onPause")
    }

    @SuppressLint("LongLogTag")
    override fun onStop() {
        super.onStop()
        Log.d("SettingsActivity:kulagin.vasily", "onStop")
    }

    @SuppressLint("LongLogTag")
    override fun onDestroy() {
        super.onDestroy()
        Log.d("SettingsActivity:kulagin.vasily", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
    }
}
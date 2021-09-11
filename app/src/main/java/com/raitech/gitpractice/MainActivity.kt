package com.raitech.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyApp", "first revision")
        Log.d("MyApp", "second revision")
        Log.d("MyApp", "third revision")
        Log.d("MyApp", "master branch first revision")
        Log.d("MyApp", "master branch second revision")
        Log.d("MyApp", "master branch third revision")
    }
}
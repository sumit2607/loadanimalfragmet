package com.example.animallistkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragmentManager = supportFragmentManager
        var transaction =fragmentManager.beginTransaction()
        transaction.add(R.id.container,AnimalFragment(),"AnimalFragment").commit()
    }
}
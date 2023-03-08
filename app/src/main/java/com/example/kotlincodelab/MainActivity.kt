package com.example.kotlincodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val titleTv: TextView = findViewById(R.id.tv_title)

        rollButton.setOnClickListener {titleTv.text = rollDice().toString()}
    }

    private fun rollDice(): Int {
        val randomInt = (1..6).random()
        return randomInt;
    }
}
package com.example.mycodepathapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Victor", "User has tapped")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Change", "tapped")
            findViewById<ConstraintLayout>(R.id.backgroundview).setBackgroundColor(getResources().getColor(R.color.black))

        }
    }
}
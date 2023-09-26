package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val edt2:TextView = findViewById(R.id.edt2)

        val intent=intent
        val name =intent.getStringExtra("UserName")
        edt2.text="Hello $name!"

    }
}
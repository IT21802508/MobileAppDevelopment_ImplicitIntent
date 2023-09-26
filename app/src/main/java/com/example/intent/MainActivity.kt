package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.net.Uri



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnactivity1: Button = findViewById(R.id.btnactivity1)
        val edtName:EditText=findViewById(R.id.editName)
        btnactivity1.setOnClickListener {
            val name = edtName.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("UserName",name)
            startActivity(intent)
        }

        val btnOpenWeb: Button = findViewById(R.id.btnWeb)
        btnOpenWeb.setOnClickListener {
            val webpage = Uri.parse("http://www.google.com")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            startActivity(intent)
        }


    }




}
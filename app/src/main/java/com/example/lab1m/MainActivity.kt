package com.example.lab1m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoAT1 = findViewById<Button>(R.id.botao1);
        botaoAT1.setOnClickListener{
            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }
    }
}
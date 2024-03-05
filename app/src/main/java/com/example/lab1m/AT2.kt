package com.example.lab1m

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)

        val botaoAT2 = findViewById<Button>(R.id.botao2);
        botaoAT2.setOnClickListener{
            finish()
        }
    }
}
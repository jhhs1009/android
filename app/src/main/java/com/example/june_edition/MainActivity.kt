package com.example.june_edition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bar.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnhome.setOnClickListener {
            val intent = Intent(this, MyHomeActivity::class.java)
            startActivity(intent)
        }
    }




}
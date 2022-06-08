package com.example.june_edition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_my_home.*
import kotlinx.android.synthetic.main.bar.*

class MyHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_home)

        btnsetting.setOnClickListener {
            val intent = Intent(this, MyHomeSettingActivity::class.java)
            startActivity(intent)
        }
    }
}
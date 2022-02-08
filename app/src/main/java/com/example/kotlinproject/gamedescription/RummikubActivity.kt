package com.example.kotlinproject.gamedescription

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinproject.R
import com.example.kotlinproject.baseactivities.HomeActivity
import kotlinx.android.synthetic.main.activity_rummikub.*

class RummikubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rummikub)

        val goIntent = Intent(this, HomeActivity::class.java)

        button_back.setOnClickListener {
            startActivity(goIntent)
        }
    }
}
package com.example.kotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_memo.*

class MemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)

        val goIntent2 = Intent(this, AddActivity::class.java)

        button_addgame.setOnClickListener {
            startActivity(goIntent2)
        }
        //memoRecycler.layoutManager = LinearLayoutManager(this)

    }

}
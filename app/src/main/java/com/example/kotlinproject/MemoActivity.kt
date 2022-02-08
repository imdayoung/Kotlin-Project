package com.example.kotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_memo.*

class MemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)
        val memoList : List<MemoEntity> = listOf<MemoEntity>()

        val goIntent = Intent(this, HomeActivity::class.java)
        button_home.setOnClickListener {
            startActivity(goIntent)
        }

        val goIntent2 = Intent(this, AddActivity::class.java)
        button_addgame.setOnClickListener {
            startActivity(goIntent2)
        }

        memoRecycler.layoutManager = LinearLayoutManager(this)
        setRecyclerView(memoList)
    }

    fun setRecyclerView(memoList : List<MemoEntity>){
        memoRecycler.adapter = MemoAdapter(this, memoList)
    }
}
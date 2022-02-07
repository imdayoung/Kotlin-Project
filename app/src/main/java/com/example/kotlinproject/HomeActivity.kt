package com.example.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    lateinit var gameAdapter: ProfileAdapter
    val datas = mutableListOf<GameData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initRecycler()
    }

    private fun initRecycler() {
        gameAdapter = ProfileAdapter(this)
        games.adapter = gameAdapter

        datas.apply {
            add(GameData(img=R.drawable.halligalli, name="할리갈리", people="2~7명", time="15분"))
            add(GameData(img=R.drawable.davinchcode, name="다빈치코드", people="2~4명", time="15분"))
            add(GameData(img=R.drawable.rummikub, name="루미큐브", people="2~4명", time="20분"))
            add(GameData(img=R.drawable.splender, name="스플렌더", people="2~4명", time="30분"))
            add(GameData(img=R.drawable.bang, name="뱅!", people="4~7명", time="20분"))

            gameAdapter.datas = datas
            gameAdapter.notifyDataSetChanged()
        }
    }
}
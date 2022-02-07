package com.example.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddActivity : AppCompatActivity() {
    lateinit var db : MemoDatabase
    var memoList : List<MemoEntity> = listOf<MemoEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)

        db = MemoDatabase.getInstance(this)!!
    }

    fun insertMemo(){

    }

    fun getAllMemos(){

    }

    fun deleteMemo(){

    }


}
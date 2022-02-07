package com.example.kotlinproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add.*

@SuppressLint("StaticFieldLeak")
class AddActivity : AppCompatActivity() {
    lateinit var db : MemoDatabase
    var memoList : List<MemoEntity> = listOf<MemoEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        button_add.setOnClickListener {
            val memo = MemoEntity(edittext_gamename.text.toString(), edittext_evaluate.text.toString(), edittext_shortmemo.text.toString())
            insertMemo(memo)
        }
        db = MemoDatabase.getInstance(this)!!

    }

    fun insertMemo(memo : MemoEntity){
        val insertTask = object : AsyncTask<Unit, Unit, Unit>(){
            override fun doInBackground(vararg params: Unit?) {
                db.memoDAO().insert(memo)
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                getAllMemos()
            }
        }

        insertTask.execute()
    }

    fun getAllMemos(){
        val goIntent3 = Intent(this, MemoActivity::class.java)
        val getTask = object : AsyncTask<Unit,Unit,Unit>(){
            override fun doInBackground(vararg params: Unit?) {
                memoList = db.memoDAO().getAll()
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                startActivity(goIntent3)
            }
        }.execute()
    }

}
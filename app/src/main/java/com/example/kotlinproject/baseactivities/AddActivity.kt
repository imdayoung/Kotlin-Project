package com.example.kotlinproject.baseactivities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinproject.R
import com.example.kotlinproject.adapters.MemoAdapter
import com.example.kotlinproject.database.MemoDatabase
import com.example.kotlinproject.database.MemoEntity
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.activity_memo.*

@SuppressLint("StaticFieldLeak")
class AddActivity : AppCompatActivity() {
    lateinit var db: MemoDatabase
    var memoList: List<MemoEntity> = listOf<MemoEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        db = MemoDatabase.getInstance(this)!!

        button_add.setOnClickListener {
            val memo = MemoEntity(
                edittext_evaluate.text.toString(),
                edittext_gamename.text.toString(),
                edittext_shortmemo.text.toString()
            )
            insertMemo(memo)
        }
    }

    fun insertMemo(memo: MemoEntity) {
        val insertTask = object : AsyncTask<Unit, Unit, Unit>() {
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

    fun getAllMemos() {
        val goIntent3 = Intent(this, MemoActivity::class.java)
        val getTask: AsyncTask<Unit, Unit, Unit> = (object : AsyncTask<Unit, Unit, Unit>() {
            override fun doInBackground(vararg params: Unit?) {
                memoList = db.memoDAO().getAll()
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                startActivity(goIntent3)
            }
        })
        getTask.execute()
    }
}
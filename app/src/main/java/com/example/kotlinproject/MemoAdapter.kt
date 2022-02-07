package com.example.kotlinproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MemoAdapter(val context : Context, var list : List<MemoEntity>) : RecyclerView.Adapter<MemoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_memo, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val memo = list[position]
        holder.txtEvaluate.text = memo.rate
        holder.txtGamename.text = memo.game
        holder.txtShortmemo.text = memo.memo
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val txtEvaluate : TextView = itemView.findViewById(R.id.text_evaluate)
        val txtGamename : TextView = itemView.findViewById(R.id.text_gamename)
        val txtShortmemo : TextView = itemView.findViewById(R.id.text_shortmemo)
    }
}
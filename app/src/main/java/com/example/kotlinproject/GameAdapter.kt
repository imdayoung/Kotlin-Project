package com.example.kotlinproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProfileAdapter(private val context: Context) : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {

    var datas = mutableListOf<GameData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_home,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])

        holder.itemView.setOnClickListener {
            when(position){
                0 -> {
                    val goIntent = Intent(holder.itemView?.context, HalligalliActivity::class.java)
                    ContextCompat.startActivity(holder.itemView.context, goIntent, null)
                }
                1 -> {
                    val goIntent = Intent(holder.itemView?.context, DavinchcodeActivity::class.java)
                    ContextCompat.startActivity(holder.itemView.context, goIntent, null)
                }
                2 -> {
                    val goIntent = Intent(holder.itemView?.context, RummikubActivity::class.java)
                    ContextCompat.startActivity(holder.itemView.context, goIntent, null)
                }
                3 -> {
                    val goIntent = Intent(holder.itemView?.context, SplenderActivity::class.java)
                    ContextCompat.startActivity(holder.itemView.context, goIntent, null)
                }
                4 -> {
                    val goIntent = Intent(holder.itemView?.context, BangActivity::class.java)
                    ContextCompat.startActivity(holder.itemView.context, goIntent, null)
                }
            }
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imgProfile: ImageView = itemView.findViewById(R.id.img_rv_photo)
        private val txtName: TextView = itemView.findViewById(R.id.tv_rv_name)
        private val txtPeople: TextView = itemView.findViewById(R.id.tv_rv_people)
        private val txtTime: TextView = itemView.findViewById(R.id.tv_rv_time)

        fun bind(item: GameData) {
            txtName.text = item.name
            txtPeople.text = item.people
            txtTime.text = item.time
            Glide.with(itemView).load(item.img).into(imgProfile)
        }
    }
}
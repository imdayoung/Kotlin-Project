package com.example.kotlinproject

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
data class MemoEntity(
    @PrimaryKey(autoGenerate = true)
    var game : String,
    var rate : Char,
    var memo : String = "")
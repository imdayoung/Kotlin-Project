package com.example.kotlinproject

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
data class MemoEntity(
    var rate : String = "",
    @PrimaryKey
    var game : String = "",
    var memo : String = "")
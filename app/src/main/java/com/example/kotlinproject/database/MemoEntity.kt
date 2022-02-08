package com.example.kotlinproject.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
data class MemoEntity(
    var rate : String = "",
    @PrimaryKey
    var game : String = "",
    var memo : String = "")
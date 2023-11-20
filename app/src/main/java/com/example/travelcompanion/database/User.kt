package com.example.travelcompanion.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
data class User (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "username")val username : String,
    @ColumnInfo(name = "email")val email: String,
    @ColumnInfo(name = "password")val password: String
)
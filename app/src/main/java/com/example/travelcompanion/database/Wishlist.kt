package com.example.travelcompanion.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Wishlist")
data class Wishlist (
    @PrimaryKey(autoGenerate = true) val wishlistId: Long = 0,
    @ColumnInfo(name = "destination") val destination: String,
    @ColumnInfo(name = "duration") val duration: Int,
    @ColumnInfo(name = "budget") val budget: Float,
    @ColumnInfo(name = "number_of_people") val numberOfPeople: Int,
    @ColumnInfo(name = "places_of_interest") val placesOfInterest: String
)

package com.example.travelcompanion.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface WishlistDao {
    @Insert
    fun insertWishlistItem(wishlist: Wishlist)

    @Update
    fun updateWishlistItem(wishlist: Wishlist)

    @Delete
    fun deleteWishlistItem(wishlist: Wishlist)

    @Query("SELECT * FROM Wishlist")
    fun getAllWishlistItems(): List<Wishlist>
}
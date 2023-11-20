package com.example.travelcompanion.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TravelPlanDao {
    @Insert
    fun insertTravelPlan(travelPlan: TravelPlan)

    @Update
    fun updateTravelPlan(travelPlan: TravelPlan)

    @Delete
    fun deleteTravelPlan(travelPlan: TravelPlan)

    @Query("SELECT * FROM TravelPlan")
    fun getAllTravelPlans(): List<TravelPlan>
}
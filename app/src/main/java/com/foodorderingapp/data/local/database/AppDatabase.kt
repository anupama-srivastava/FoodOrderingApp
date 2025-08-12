package com.foodorderingapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.foodorderingapp.data.local.dao.RestaurantDao
import com.foodorderingapp.data.local.dao.UserDao
import com.foodorderingapp.data.local.entity.RestaurantEntity
import com.foodorderingapp.data.local.entity.UserEntity

@Database(
    entities = [
        UserEntity::class,
        RestaurantEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun restaurantDao(): RestaurantDao
}

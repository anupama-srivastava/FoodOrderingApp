package com.foodorderingapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "restaurants")
data class RestaurantEntity(
    @PrimaryKey
    val id: String,
    val name: String,
    val description: String,
    val image: String,
    val rating: Double,
    val totalReviews: Int,
    val deliveryTime: String,
    val deliveryFee: Double,
    val minOrder: Double,
    val cuisines: List<String>,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val phone: String,
    val email: String,
    val isOpen: Boolean,
    val isFavorite: Boolean = false,
    val createdAt: Long,
    val updatedAt: Long
)

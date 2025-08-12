package com.foodorderingapp.domain.model

import com.google.firebase.firestore.PropertyName

data class Review(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("restaurantId")
    val restaurantId: String = "",
    
    @PropertyName("userId")
    val userId: String = "",
    
    @PropertyName("userName")
    val userName: String = "",
    
    @PropertyName("userImage")
    val userImage: String = "",
    
    @PropertyName("rating")
    val rating: Int = 0,
    
    @PropertyName("comment")
    val comment: String = "",
    
    @PropertyName("images")
    val images: List<String> = emptyList(),
    
    @PropertyName("createdAt")
    val createdAt: Long = System.currentTimeMillis(),
    
    @PropertyName("updatedAt")
    val updatedAt: Long = System.currentTimeMillis()
)

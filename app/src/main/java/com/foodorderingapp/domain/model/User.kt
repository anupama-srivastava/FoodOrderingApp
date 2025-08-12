package com.foodorderingapp.domain.model

import com.google.firebase.firestore.PropertyName

data class User(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("name")
    val name: String = "",
    
    @PropertyName("email")
    val email: String = "",
    
    @PropertyName("phone")
    val phone: String = "",
    
    @PropertyName("profileImage")
    val profileImage: String = "",
    
    @PropertyName("addresses")
    val addresses: List<Address> = emptyList(),
    
    @PropertyName("favoriteRestaurants")
    val favoriteRestaurants: List<String> = emptyList(),
    
    @PropertyName("createdAt")
    val createdAt: Long = System.currentTimeMillis(),
    
    @PropertyName("updatedAt")
    val updatedAt: Long = System.currentTimeMillis()
)

data class Address(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("type")
    val type: AddressType = AddressType.HOME,
    
    @PropertyName("street")
    val street: String = "",
    
    @PropertyName("city")
    val city: String = "",
    
    @PropertyName("state")
    val state: String = "",
    
    @PropertyName("zipCode")
    val zipCode: String = "",
    
    @PropertyName("country")
    val country: String = "",
    
    @PropertyName("latitude")
    val latitude: Double = 0.0,
    
    @PropertyName("longitude")
    val longitude: Double = 0.0,
    
    @PropertyName("isDefault")
    val isDefault: Boolean = false
)

enum class AddressType {
    HOME, WORK, OTHER
}

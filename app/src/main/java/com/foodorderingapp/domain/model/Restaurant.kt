package com.foodorderingapp.domain.model

import com.google.firebase.firestore.PropertyName

data class Restaurant(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("name")
    val name: String = "",
    
    @PropertyName("description")
    val description: String = "",
    
    @PropertyName("image")
    val image: String = "",
    
    @PropertyName("rating")
    val rating: Double = 0.0,
    
    @PropertyName("totalReviews")
    val totalReviews: Int = 0,
    
    @PropertyName("deliveryTime")
    val deliveryTime: String = "",
    
    @PropertyName("deliveryFee")
    val deliveryFee: Double = 0.0,
    
    @PropertyName("minOrder")
    val minOrder: Double = 0.0,
    
    @PropertyName("cuisines")
    val cuisines: List<String> = emptyList(),
    
    @PropertyName("address")
    val address: String = "",
    
    @PropertyName("latitude")
    val latitude: Double = 0.0,
    
    @PropertyName("longitude")
    val longitude: Double = 0.0,
    
    @PropertyName("phone")
    val phone: String = "",
    
    @PropertyName("email")
    val email: String = "",
    
    @PropertyName("isOpen")
    val isOpen: Boolean = true,
    
    @PropertyName("openingHours")
    val openingHours: List<OpeningHours> = emptyList(),
    
    @PropertyName("categories")
    val categories: List<Category> = emptyList(),
    
    @PropertyName("promotions")
    val promotions: List<Promotion> = emptyList(),
    
    @PropertyName("createdAt")
    val createdAt: Long = System.currentTimeMillis(),
    
    @PropertyName("updatedAt")
    val updatedAt: Long = System.currentTimeMillis()
)

data class OpeningHours(
    @PropertyName("day")
    val day: String = "",
    
    @PropertyName("open")
    val open: String = "",
    
    @PropertyName("close")
    val close: String = ""
)

data class Category(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("name")
    val name: String = "",
    
    @PropertyName("description")
    val description: String = "",
    
    @PropertyName("image")
    val image: String = "",
    
    @PropertyName("items")
    val items: List<MenuItem> = emptyList()
)

data class MenuItem(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("name")
    val name: String = "",
    
    @PropertyName("description")
    val description: String = "",
    
    @PropertyName("image")
    val image: String = "",
    
    @PropertyName("price")
    val price: Double = 0.0,
    
    @PropertyName("discountedPrice")
    val discountedPrice: Double? = null,
    
    @PropertyName("category")
    val category: String = "",
    
    @PropertyName("isVegetarian")
    val isVegetarian: Boolean = true,
    
    @PropertyName("isAvailable")
    val isAvailable: Boolean = true,
    
    @PropertyName("spiceLevel")
    val spiceLevel: SpiceLevel = SpiceLevel.MILD,
    
    @PropertyName("allergens")
    val allergens: List<String> = emptyList(),
    
    @PropertyName("nutritionalInfo")
    val nutritionalInfo: NutritionalInfo? = null,
    
    @PropertyName("addons")
    val addons: List<Addon> = emptyList(),
    
    @PropertyName("tags")
    val tags: List<String> = emptyList()
)

data class Addon(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("name")
    val name: String = "",
    
    @PropertyName("price")
    val price: Double = 0.0,
    
    @PropertyName("isAvailable")
    val isAvailable: Boolean = true
)

data class NutritionalInfo(
    @PropertyName("calories")
    val calories: Int = 0,
    
    @PropertyName("protein")
    val protein: Double = 0.0,
    
    @PropertyName("carbs")
    val carbs: Double = 0.0,
    
    @PropertyName("fat")
    val fat: Double = 0.0,
    
    @PropertyName("fiber")
    val fiber: Double = 0.0
)

data class Promotion(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("title")
    val title: String = "",
    
    @PropertyName("description")
    val description: String = "",
    
    @PropertyName("discountType")
    val discountType: DiscountType = DiscountType.PERCENTAGE,
    
    @PropertyName("discountValue")
    val discountValue: Double = 0.0,
    
    @PropertyName("minimumOrder")
    val minimumOrder: Double = 0.0,
    
    @PropertyName("maximumDiscount")
    val maximumDiscount: Double = 0.0,
    
    @PropertyName("validFrom")
    val validFrom: Long = 0,
    
    @PropertyName("validTo")
    val validTo: Long = 0,
    
    @PropertyName("code")
    val code: String = "",
    
    @PropertyName("isActive")
    val isActive: Boolean = true
)

enum class SpiceLevel {
    MILD, MEDIUM, HOT, EXTRA_HOT
}

enum class DiscountType {
    PERCENTAGE, FIXED
}

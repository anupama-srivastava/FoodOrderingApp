package com.foodorderingapp.domain.repository

import com.foodorderingapp.domain.model.Restaurant
import com.foodorderingapp.domain.model.Review
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface RestaurantRepository {
    
    fun getRestaurants(
        latitude: Double? = null,
        longitude: Double? = null,
        cuisine: String? = null,
        rating: Double? = null,
        priceRange: String? = null,
        sortBy: String? = null
    ): Flow<Resource<List<Restaurant>>>
    
    fun getRestaurantById(restaurantId: String): Flow<Resource<Restaurant>>
    
    fun searchRestaurants(query: String): Flow<Resource<List<Restaurant>>>
    
    fun getFavoriteRestaurants(userId: String): Flow<Resource<List<Restaurant>>>
    
    fun addToFavorites(userId: String, restaurantId: String): Flow<Resource<Unit>>
    
    fun removeFromFavorites(userId: String, restaurantId: String): Flow<Resource<Unit>>
    
    fun getNearbyRestaurants(
        latitude: Double,
        longitude: Double,
        radius: Double
    ): Flow<Resource<List<Restaurant>>>
    
    fun getPopularRestaurants(): Flow<Resource<List<Restaurant>>>
    
    fun getRestaurantReviews(restaurantId: String): Flow<Resource<List<Review>>>
    
    fun addReview(
        restaurantId: String,
        rating: Int,
        comment: String,
        images: List<String>
    ): Flow<Resource<Unit>>
}

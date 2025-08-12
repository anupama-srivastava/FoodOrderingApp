package com.foodorderingapp.domain.usecase

import com.foodorderingapp.domain.model.Restaurant
import com.foodorderingapp.domain.repository.RestaurantRepository
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RestaurantUseCase @Inject constructor(
    private val restaurantRepository: RestaurantRepository
) {
    
    fun getRestaurants(
        latitude: Double? = null,
        longitude: Double? = null,
        cuisine: String? = null,
        rating: Double? = null,
        priceRange: String? = null,
        sortBy: String? = null
    ): Flow<Resource<List<Restaurant>>> {
        return restaurantRepository.getRestaurants(
            latitude,
            longitude,
            cuisine,
            rating,
            priceRange,
            sortBy
        )
    }
    
    fun getRestaurantById(restaurantId: String): Flow<Resource<Restaurant>> {
        return restaurantRepository.getRestaurantById(restaurantId)
    }
    
    fun searchRestaurants(query: String): Flow<Resource<List<Restaurant>>> {
        return restaurantRepository.searchRestaurants(query)
    }
    
    fun getFavoriteRestaurants(userId: String): Flow<Resource<List<Restaurant>>> {
        return restaurantRepository.getFavoriteRestaurants(userId)
    }
    
    fun addToFavorites(userId: String, restaurantId: String): Flow<Resource<Unit>> {
        return restaurantRepository.addToFavorites(userId, restaurantId)
    }
    
    fun removeFromFavorites(userId: String, restaurantId: String): Flow<Resource<Unit>> {
        return restaurantRepository.removeFromFavorites(userId, restaurantId)
    }
    
    fun getNearbyRestaurants(
        latitude: Double,
        longitude: Double,
        radius: Double = 5.0
    ): Flow<Resource<List<Restaurant>>> {
        return restaurantRepository.getNearbyRestaurants(latitude, longitude, radius)
    }
    
    fun getPopularRestaurants(): Flow<Resource<List<Restaurant>>> {
        return restaurantRepository.getPopularRestaurants()
    }
    
    fun getRestaurantReviews(restaurantId: String): Flow<Resource<List<Review>>> {
        return restaurantRepository.getRestaurantReviews(restaurantId)
    }
    
    fun addReview(
        restaurantId: String,
        rating: Int,
        comment: String,
        images: List<String> = emptyList()
    ): Flow<Resource<Unit>> {
        return restaurantRepository.addReview(restaurantId, rating, comment, images)
    }
}

data class Review(
    val id: String = "",
    val userId: String = "",
    val userName: String = "",
    val userImage: String = "",
    val rating: Int = 0,
    val comment: String = "",
    val images: List<String> = emptyList(),
    val createdAt: Long = System.currentTimeMillis()
)

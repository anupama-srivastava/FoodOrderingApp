package com.foodorderingapp.data.repository

import com.foodorderingapp.data.local.dao.RestaurantDao
import com.foodorderingapp.data.remote.api.ApiService
import com.foodorderingapp.data.remote.firebase.FirebaseRestaurantService
import com.foodorderingapp.domain.model.Restaurant
import com.foodorderingapp.domain.model.Review
import com.foodorderingapp.domain.repository.RestaurantRepository
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RestaurantRepositoryImpl @Inject constructor(
    private val firebaseRestaurantService: FirebaseRestaurantService,
    private val apiService: ApiService,
    private val restaurantDao: RestaurantDao
) : RestaurantRepository {
    
    override fun getRestaurants(
        latitude: Double?,
        longitude: Double?,
        cuisine: String?,
        rating: Double?,
        priceRange: String?,
        sortBy: String?
    ): Flow<Resource<List<Restaurant>>> = flow {
        emit(Resource.Loading())
        try {
            val restaurants = firebaseRestaurantService.getRestaurants(
                latitude,
                longitude,
                cuisine,
                rating,
                priceRange,
                sortBy
            )
            emit(Resource.Success(restaurants))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch restaurants"))
        }
    }
    
    override fun getRestaurantById(restaurantId: String): Flow<Resource<Restaurant>> = flow {
        emit(Resource.Loading())
        try {
            val restaurant = firebaseRestaurantService.getRestaurantById(restaurantId)
            emit(Resource.Success(restaurant))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch restaurant"))
        }
    }
    
    override fun searchRestaurants(query: String): Flow<Resource<List<Restaurant>>> = flow {
        emit(Resource.Loading())
        try {
            val restaurants = firebaseRestaurantService.searchRestaurants(query)
            emit(Resource.Success(restaurants))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to search restaurants"))
        }
    }
    
    override fun getFavoriteRestaurants(userId: String): Flow<Resource<List<Restaurant>>> = flow {
        emit(Resource.Loading())
        try {
            val restaurants = firebaseRestaurantService.getFavoriteRestaurants(userId)
            emit(Resource.Success(restaurants))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch favorite restaurants"))
        }
    }
    
    override fun addToFavorites(userId: String, restaurantId: String): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseRestaurantService.addToFavorites(userId, restaurantId)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to add to favorites"))
        }
    }
    
    override fun removeFromFavorites(userId: String, restaurantId: String): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseRestaurantService.removeFromFavorites(userId, restaurantId)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to remove from favorites"))
        }
    }
    
    override fun getNearbyRestaurants(
        latitude: Double,
        longitude: Double,
        radius: Double
    ): Flow<Resource<List<Restaurant>>> = flow {
        emit(Resource.Loading())
        try {
            val restaurants = firebaseRestaurantService.getNearbyRestaurants(latitude, longitude, radius)
            emit(Resource.Success(restaurants))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch nearby restaurants"))
        }
    }
    
    override fun getPopularRestaurants(): Flow<Resource<List<Restaurant>>> = flow {
        emit(Resource.Loading())
        try {
            val restaurants = firebaseRestaurantService.getPopularRestaurants()
            emit(Resource.Success(restaurants))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch popular restaurants"))
        }
    }
    
    override fun getRestaurantReviews(restaurantId: String): Flow<Resource<List<Review>>> = flow {
        emit(Resource.Loading())
        try {
            val reviews = firebaseRestaurantService.getRestaurantReviews(restaurantId)
            emit(Resource.Success(reviews))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch reviews"))
        }
    }
    
    override fun addReview(
        restaurantId: String,
        rating: Int,
        comment: String,
        images: List<String>
    ): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseRestaurantService.addReview(restaurantId, rating, comment, images)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to add review"))
        }
    }
}

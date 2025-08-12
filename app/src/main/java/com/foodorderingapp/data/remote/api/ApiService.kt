package com.foodorderingapp.data.remote.api

import com.foodorderingapp.domain.model.*
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    
    // Auth Endpoints
    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<AuthResponse>
    
    @POST("auth/register")
    suspend fun register(@Body registerRequest: RegisterRequest): Response<AuthResponse>
    
    @POST("auth/google")
    suspend fun loginWithGoogle(@Body googleRequest: GoogleRequest): Response<AuthResponse>
    
    @POST("auth/facebook")
    suspend fun loginWithFacebook(@Body facebookRequest: FacebookRequest): Response<AuthResponse>
    
    @POST("auth/reset-password")
    suspend fun resetPassword(@Body resetRequest: ResetPasswordRequest): Response<Unit>
    
    // Restaurant Endpoints
    @GET("restaurants")
    suspend fun getRestaurants(
        @Query("latitude") latitude: Double?,
        @Query("longitude") longitude: Double?,
        @Query("cuisine") cuisine: String?,
        @Query("rating") rating: Double?,
        @Query("priceRange") priceRange: String?,
        @Query("sortBy") sortBy: String?
    ): Response<List<Restaurant>>
    
    @GET("restaurants/{id}")
    suspend fun getRestaurantById(@Path("id") id: String): Response<Restaurant>
    
    @GET("restaurants/search")
    suspend fun searchRestaurants(@Query("query") query: String): Response<List<Restaurant>>
    
    @GET("restaurants/nearby")
    suspend fun getNearbyRestaurants(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("radius") radius: Double
    ): Response<List<Restaurant>>
    
    @GET("restaurants/popular")
    suspend fun getPopularRestaurants(): Response<List<Restaurant>>
    
    @GET("restaurants/{id}/reviews")
    suspend fun getRestaurantReviews(@Path("id") id: String): Response<List<Review>>
    
    @POST("restaurants/{id}/reviews")
    suspend fun addReview(
        @Path("id") id: String,
        @Body reviewRequest: ReviewRequest
    ): Response<Unit>
    
    // Cart Endpoints
    @GET("cart/{userId}")
    suspend fun getCart(@Path("userId") userId: String): Response<Cart>
    
    @POST("cart/{userId}/items")
    suspend fun addToCart(
        @Path("userId") userId: String,
        @Body cartItem: CartItem
    ): Response<Unit>
    
    @DELETE("cart/{userId}/items/{itemId}")
    suspend fun removeFromCart(
        @Path("userId") userId: String,
        @Path("itemId") itemId: String
    ): Response<Unit>
    
    @PUT("cart/{userId}/items/{itemId}")
    suspend fun updateCartItemQuantity(
        @Path("userId") userId: String,
        @Path("itemId") itemId: String,
        @Body quantityRequest: QuantityRequest
    ): Response<Unit>
    
    @DELETE("cart/{userId}")
    suspend fun clearCart(@Path("userId") userId: String): Response<Unit>
    
    @POST("cart/{userId}/promo")
    suspend fun applyPromoCode(
        @Path("userId") userId: String,
        @Body promoRequest: PromoRequest
    ): Response<Double>
    
    @DELETE("cart/{userId}/promo")
    suspend fun removePromoCode(@Path("userId") userId: String): Response<Unit>
    
    // Order Endpoints
    @POST("orders")
    suspend fun placeOrder(@Body orderRequest: OrderRequest): Response<Order>
    
    @GET("orders/user/{userId}")
    suspend fun getUserOrders(@Path("userId") userId: String): Response<List<Order>>
    
    @GET("orders/{id}")
    suspend fun getOrderById(@Path("id") id: String): Response<Order>
    
    @PUT("orders/{id}/status")
    suspend fun updateOrderStatus(
        @Path("id") id: String,
        @Body statusRequest: StatusRequest
    ): Response<Unit>
    
    // User Endpoints
    @GET("users/{id}")
    suspend fun getUser(@Path("id") id: String): Response<User>
    
    @PUT("users/{id}")
    suspend fun updateUser(
        @Path("id") id: String,
        @Body userRequest: UserRequest
    ): Response<User>
    
    @GET("users/{id}/favorites")
    suspend fun getFavoriteRestaurants(@Path("id") userId: String): Response<List<Restaurant>>
    
    @POST("users/{id}/favorites/{restaurantId}")
    suspend fun addToFavorites(
        @Path("id") userId: String,
        @Path("restaurantId") restaurantId: String
    ): Response<Unit>
    
    @DELETE("users/{id}/favorites/{restaurantId}")
    suspend fun removeFromFavorites(
        @Path("id") userId: String,
        @Path("restaurantId") restaurantId: String
    ): Response<Unit>
}

// Request DTOs
data class LoginRequest(val email: String, val password: String)
data class RegisterRequest(val name: String, val email: String, val phone: String, val password: String)
data class GoogleRequest(val idToken: String)
data class FacebookRequest(val accessToken: String)
data class ResetPasswordRequest(val email: String)
data class ReviewRequest(val rating: Int, val comment: String, val images: List<String>)
data class QuantityRequest(val quantity: Int)
data class PromoRequest(val promoCode: String)
data class OrderRequest(
    val restaurantId: String,
    val items: List<OrderItem>,
    val deliveryAddress: Address,
    val paymentMethod: String,
    val promoCode: String? = null
)
data class StatusRequest(val status: String)
data class UserRequest(val name: String?, val phone: String?, val profileImage: String?)

// Response DTOs
data class AuthResponse(
    val user: User,
    val token: String
)

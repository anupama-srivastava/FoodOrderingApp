package com.foodorderingapp.domain.repository

import com.foodorderingapp.domain.model.Cart
import com.foodorderingapp.domain.model.CartItem
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface CartRepository {
    
    fun getCart(userId: String): Flow<Resource<Cart>>
    
    fun addToCart(userId: String, cartItem: CartItem): Flow<Resource<Unit>>
    
    fun removeFromCart(userId: String, cartItemId: String): Flow<Resource<Unit>>
    
    fun updateCartItemQuantity(
        userId: String,
        cartItemId: String,
        quantity: Int
    ): Flow<Resource<Unit>>
    
    fun clearCart(userId: String): Flow<Resource<Unit>>
    
    fun getCartItemCount(userId: String): Flow<Resource<Int>>
    
    fun mergeCarts(userId: String, guestCart: Cart): Flow<Resource<Unit>>
    
    fun validateCart(userId: String): Flow<Resource<Boolean>>
    
    fun calculateCartTotal(
        userId: String,
        promoCode: String? = null
    ): Flow<Resource<Double>>
    
    fun applyPromoCode(userId: String, promoCode: String): Flow<Resource<Double>>
    
    fun removePromoCode(userId: String): Flow<Resource<Unit>>
}

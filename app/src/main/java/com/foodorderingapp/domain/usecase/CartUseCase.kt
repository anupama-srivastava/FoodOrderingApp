package com.foodorderingapp.domain.usecase

import com.foodorderingapp.domain.model.Cart
import com.foodorderingapp.domain.model.CartItem
import com.foodorderingapp.domain.repository.CartRepository
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CartUseCase @Inject constructor(
    private val cartRepository: CartRepository
) {
    
    fun getCart(userId: String): Flow<Resource<Cart>> {
        return cartRepository.getCart(userId)
    }
    
    fun addToCart(
        userId: String,
        cartItem: CartItem
    ): Flow<Resource<Unit>> {
        return cartRepository.addToCart(userId, cartItem)
    }
    
    fun removeFromCart(
        userId: String,
        cartItemId: String
    ): Flow<Resource<Unit>> {
        return cartRepository.removeFromCart(userId, cartItemId)
    }
    
    fun updateCartItemQuantity(
        userId: String,
        cartItemId: String,
        quantity: Int
    ): Flow<Resource<Unit>> {
        return cartRepository.updateCartItemQuantity(userId, cartItemId, quantity)
    }
    
    fun clearCart(userId: String): Flow<Resource<Unit>> {
        return cartRepository.clearCart(userId)
    }
    
    fun getCartItemCount(userId: String): Flow<Resource<Int>> {
        return cartRepository.getCartItemCount(userId)
    }
    
    fun mergeCarts(
        userId: String,
        guestCart: Cart
    ): Flow<Resource<Unit>> {
        return cartRepository.mergeCarts(userId, guestCart)
    }
    
    fun validateCart(userId: String): Flow<Resource<Boolean>> {
        return cartRepository.validateCart(userId)
    }
    
    fun calculateCartTotal(
        userId: String,
        promoCode: String? = null
    ): Flow<Resource<Double>> {
        return cartRepository.calculateCartTotal(userId, promoCode)
    }
    
    fun applyPromoCode(
        userId: String,
        promoCode: String
    ): Flow<Resource<Double>> {
        return cartRepository.applyPromoCode(userId, promoCode)
    }
    
    fun removePromoCode(userId: String): Flow<Resource<Unit>> {
        return cartRepository.removePromoCode(userId)
    }
}

package com.foodorderingapp.data.repository

import com.foodorderingapp.data.local.dao.CartDao
import com.foodorderingapp.data.remote.firebase.FirebaseCartService
import com.foodorderingapp.domain.model.Cart
import com.foodorderingapp.domain.model.CartItem
import com.foodorderingapp.domain.repository.CartRepository
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CartRepositoryImpl @Inject constructor(
    private val firebaseCartService: FirebaseCartService,
    private val cartDao: CartDao
) : CartRepository {
    
    override fun getCart(userId: String): Flow<Resource<Cart>> = flow {
        emit(Resource.Loading())
        try {
            val cart = firebaseCartService.getCart(userId)
            emit(Resource.Success(cart))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch cart"))
        }
    }
    
    override fun addToCart(userId: String, cartItem: CartItem): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseCartService.addToCart(userId, cartItem)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to add item to cart"))
        }
    }
    
    override fun removeFromCart(userId: String, cartItemId: String): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseCartService.removeFromCart(userId, cartItemId)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to remove item from cart"))
        }
    }
    
    override fun updateCartItemQuantity(
        userId: String,
        cartItemId: String,
        quantity: Int
    ): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseCartService.updateCartItemQuantity(userId, cartItemId, quantity)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to update cart item quantity"))
        }
    }
    
    override fun clearCart(userId: String): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseCartService.clearCart(userId)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to clear cart"))
        }
    }
    
    override fun getCartItemCount(userId: String): Flow<Resource<Int>> = flow {
        emit(Resource.Loading())
        try {
            val count = firebaseCartService.getCartItemCount(userId)
            emit(Resource.Success(count))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to get cart item count"))
        }
    }
    
    override fun mergeCarts(userId: String, guestCart: Cart): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseCartService.mergeCarts(userId, guestCart)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to merge carts"))
        }
    }
    
    override fun validateCart(userId: String): Flow<Resource<Boolean>> = flow {
        emit(Resource.Loading())
        try {
            val isValid = firebaseCartService.validateCart(userId)
            emit(Resource.Success(isValid))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to validate cart"))
        }
    }
    
    override fun calculateCartTotal(
        userId: String,
        promoCode: String?
    ): Flow<Resource<Double>> = flow {
        emit(Resource.Loading())
        try {
            val total = firebaseCartService.calculateCartTotal(userId, promoCode)
            emit(Resource.Success(total))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to calculate cart total"))
        }
    }
    
    override fun applyPromoCode(
        userId: String,
        promoCode: String
    ): Flow<Resource<Double>> = flow {
        emit(Resource.Loading())
        try {
            val discount = firebaseCartService.applyPromoCode(userId, promoCode)
            emit(Resource.Success(discount))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to apply promo code"))
        }
    }
    
    override fun removePromoCode(userId: String): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            firebaseCartService.removePromoCode(userId)
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to remove promo code"))
        }
    }
}

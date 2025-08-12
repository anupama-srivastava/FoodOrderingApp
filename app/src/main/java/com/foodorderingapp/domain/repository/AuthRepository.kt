package com.foodorderingapp.domain.repository

import com.foodorderingapp.domain.model.User
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    
    fun login(email: String, password: String): Flow<Resource<User>>
    
    fun register(
        name: String,
        email: String,
        phone: String,
        password: String
    ): Flow<Resource<User>>
    
    fun loginWithGoogle(idToken: String): Flow<Resource<User>>
    
    fun loginWithFacebook(accessToken: String): Flow<Resource<User>>
    
    fun logout(): Flow<Resource<Unit>>
    
    fun getCurrentUser(): Flow<User?>
    
    fun isUserLoggedIn(): Boolean
    
    fun resetPassword(email: String): Flow<Resource<Unit>>
    
    fun updateProfile(
        name: String? = null,
        phone: String? = null,
        profileImage: String? = null
    ): Flow<Resource<User>>
}

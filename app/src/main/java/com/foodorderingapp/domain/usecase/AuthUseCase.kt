package com.foodorderingapp.domain.usecase

import com.foodorderingapp.domain.model.User
import com.foodorderingapp.domain.repository.AuthRepository
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AuthUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    
    fun login(email: String, password: String): Flow<Resource<User>> {
        return authRepository.login(email, password)
    }
    
    fun register(
        name: String,
        email: String,
        phone: String,
        password: String
    ): Flow<Resource<User>> {
        return authRepository.register(name, email, phone, password)
    }
    
    fun loginWithGoogle(idToken: String): Flow<Resource<User>> {
        return authRepository.loginWithGoogle(idToken)
    }
    
    fun loginWithFacebook(accessToken: String): Flow<Resource<User>> {
        return authRepository.loginWithFacebook(accessToken)
    }
    
    fun logout(): Flow<Resource<Unit>> {
        return authRepository.logout()
    }
    
    fun getCurrentUser(): Flow<User?> {
        return authRepository.getCurrentUser()
    }
    
    fun isUserLoggedIn(): Boolean {
        return authRepository.isUserLoggedIn()
    }
    
    fun resetPassword(email: String): Flow<Resource<Unit>> {
        return authRepository.resetPassword(email)
    }
    
    fun updateProfile(
        name: String? = null,
        phone: String? = null,
        profileImage: String? = null
    ): Flow<Resource<User>> {
        return authRepository.updateProfile(name, phone, profileImage)
    }
}

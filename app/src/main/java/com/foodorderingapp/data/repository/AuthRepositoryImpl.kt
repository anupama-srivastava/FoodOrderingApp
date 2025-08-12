package com.foodorderingapp.data.repository

import com.foodorderingapp.data.remote.api.ApiService
import com.foodorderingapp.data.remote.firebase.FirebaseAuthService
import com.foodorderingapp.domain.model.User
import com.foodorderingapp.domain.repository.AuthRepository
import com.foodorderingapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val firebaseAuthService: FirebaseAuthService,
    private val apiService: ApiService
) : AuthRepository {
    
    override fun login(email: String, password: String): Flow<Resource<User>> = flow {
        emit(Resource.Loading())
        try {
            val result = firebaseAuthService.login(email, password)
            if (result.isSuccess) {
                val user = result.getOrNull()
                user?.let {
                    emit(Resource.Success(it))
                } ?: emit(Resource.Error("Login failed"))
            } else {
                emit(Resource.Error(result.exceptionOrNull()?.message ?: "Login failed"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }
    
    override fun register(
        name: String,
        email: String,
        phone: String,
        password: String
    ): Flow<Resource<User>> = flow {
        emit(Resource.Loading())
        try {
            val result = firebaseAuthService.register(name, email, phone, password)
            if (result.isSuccess) {
                val user = result.getOrNull()
                user?.let {
                    emit(Resource.Success(it))
                } ?: emit(Resource.Error("Registration failed"))
            } else {
                emit(Resource.Error(result.exceptionOrNull()?.message ?: "Registration failed"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }
    
    override fun loginWithGoogle(idToken: String): Flow<Resource<User>> = flow {
        emit(Resource.Loading())
        try {
            val result = firebaseAuthService.loginWithGoogle(idToken)
            if (result.isSuccess) {
                val user = result.getOrNull()
                user?.let {
                    emit(Resource.Success(it))
                } ?: emit(Resource.Error("Google login failed"))
            } else {
                emit(Resource.Error(result.exceptionOrNull()?.message ?: "Google login failed"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }
    
    override fun loginWithFacebook(accessToken: String): Flow<Resource<User>> = flow {
        emit(Resource.Loading())
        try {
            val result = firebaseAuthService.loginWithFacebook(accessToken)
            if (result.isSuccess) {
                val user = result.getOrNull()
                user?.let {
                    emit(Resource.Success(it))
                } ?: emit(Resource.Error("Facebook login failed"))
            } else {
                emit(Resource.Error(result.exceptionOrNull()?.message ?: "Facebook login failed"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }
    
    override fun logout(): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            val result = firebaseAuthService.logout()
            if (result.isSuccess) {
                emit(Resource.Success(Unit))
            } else {
                emit(Resource.Error(result.exceptionOrNull()?.message ?: "Logout failed"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }
    
    override fun getCurrentUser(): Flow<User?> = flow {
        emit(firebaseAuthService.getCurrentUser())
    }
    
    override fun isUserLoggedIn(): Boolean = firebaseAuthService.isUserLoggedIn()
    
    override fun resetPassword(email: String): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            val result = firebaseAuthService.resetPassword(email)
            if (result.isSuccess) {
                emit(Resource.Success(Unit))
            } else {
                emit(Resource.Error(result.exceptionOrNull()?.message ?: "Reset password failed"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }
    
    override fun updateProfile(
        name: String?,
        phone: String?,
        profileImage: String?
    ): Flow<Resource<User>> = flow {
        emit(Resource.Loading())
        try {
            val result = firebaseAuthService.updateProfile(name, phone, profileImage)
            if (result.isSuccess) {
                val user = result.getOrNull()
                user?.let {
                    emit(Resource.Success(it))
                } ?: emit(Resource.Error("Profile update failed"))
            } else {
                emit(Resource.Error(result.exceptionOrNull()?.message ?: "Profile update failed"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "An error occurred"))
        }
    }
}

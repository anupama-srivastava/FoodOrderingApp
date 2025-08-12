package com.foodorderingapp.presentation.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.foodorderingapp.domain.usecase.RestaurantUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val restaurantUseCase: RestaurantUseCase
) : ViewModel() {
    
    private val _restaurants = MutableStateFlow<List<com.foodorderingapp.domain.model.Restaurant>>(emptyList())
    val restaurants: StateFlow<List<com.foodorderingapp.domain.model.Restaurant>> = _restaurants.asStateFlow()
    
    init {
        loadRestaurants()
    }
    
    private fun loadRestaurants() {
        viewModelScope.launch {
            restaurantUseCase.getRestaurants().collect { result ->
                when (result) {
                    is com.foodorderingapp.utils.Resource.Success -> {
                        _restaurants.value = result.data ?: emptyList()
                    }
                    is com.foodorderingapp.utils.Resource.Error -> {
                        // Handle error
                    }
                    is com.foodorderingapp.utils.Resource.Loading -> {
                        // Handle loading
                    }
                }
            }
        }
    }
}

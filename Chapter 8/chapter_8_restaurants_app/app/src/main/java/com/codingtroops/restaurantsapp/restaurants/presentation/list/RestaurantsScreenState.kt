package com.codingtroops.restaurantsapp.restaurants.presentation.list

import com.codingtroops.restaurantsapp.restaurants.data.Restaurant

data class RestaurantsScreenState(
    val restaurants: List<Restaurant>,
    val isLoading: Boolean,
    val error: String? = null
)
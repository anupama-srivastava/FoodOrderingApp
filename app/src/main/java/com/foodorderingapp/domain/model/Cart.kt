package com.foodorderingapp.domain.model

data class Cart(
    val items: List<CartItem> = emptyList(),
    val restaurantId: String = "",
    val restaurantName: String = "",
    val restaurantImage: String = "",
    val deliveryFee: Double = 0.0,
    val minOrder: Double = 0.0
) {
    val itemCount: Int
        get() = items.sumOf { it.quantity }
    
    val subtotal: Double
        get() = items.sumOf { it.totalPrice }
    
    val total: Double
        get() = subtotal + deliveryFee
    
    val isEmpty: Boolean
        get() = items.isEmpty()
}

data class CartItem(
    val id: String = "",
    val menuItemId: String = "",
    val name: String = "",
    val image: String = "",
    val price: Double = 0.0,
    val quantity: Int = 1,
    val addons: List<SelectedAddon> = emptyList(),
    val specialInstructions: String = "",
    val restaurantId: String = ""
) {
    val totalPrice: Double
        get() = (price + addons.sumOf { it.price }) * quantity
}

data class CartSummary(
    val subtotal: Double = 0.0,
    val deliveryFee: Double = 0.0,
    val tax: Double = 0.0,
    val discount: Double = 0.0,
    val total: Double = 0.0,
    val itemCount: Int = 0
)

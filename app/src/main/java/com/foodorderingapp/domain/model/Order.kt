package com.foodorderingapp.domain.model

import com.google.firebase.firestore.PropertyName

data class Order(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("userId")
    val userId: String = "",
    
    @PropertyName("restaurantId")
    val restaurantId: String = "",
    
    @PropertyName("restaurantName")
    val restaurantName: String = "",
    
    @PropertyName("restaurantImage")
    val restaurantImage: String = "",
    
    @PropertyName("items")
    val items: List<OrderItem> = emptyList(),
    
    @PropertyName("subtotal")
    val subtotal: Double = 0.0,
    
    @PropertyName("deliveryFee")
    val deliveryFee: Double = 0.0,
    
    @PropertyName("tax")
    val tax: Double = 0.0,
    
    @PropertyName("discount")
    val discount: Double = 0.0,
    
    @PropertyName("total")
    val total: Double = 0.0,
    
    @PropertyName("promoCode")
    val promoCode: String = "",
    
    @PropertyName("deliveryAddress")
    val deliveryAddress: Address = Address(),
    
    @PropertyName("deliveryInstructions")
    val deliveryInstructions: String = "",
    
    @PropertyName("paymentMethod")
    val paymentMethod: PaymentMethod = PaymentMethod.COD,
    
    @PropertyName("paymentStatus")
    val paymentStatus: PaymentStatus = PaymentStatus.PENDING,
    
    @PropertyName("orderStatus")
    val orderStatus: OrderStatus = OrderStatus.PENDING,
    
    @PropertyName("estimatedDeliveryTime")
    val estimatedDeliveryTime: Long = 0,
    
    @PropertyName("actualDeliveryTime")
    val actualDeliveryTime: Long? = null,
    
    @PropertyName("driverId")
    val driverId: String = "",
    
    @PropertyName("driverName")
    val driverName: String = "",
    
    @PropertyName("driverPhone")
    val driverPhone: String = "",
    
    @PropertyName("driverImage")
    val driverImage: String = "",
    
    @PropertyName("trackingUrl")
    val trackingUrl: String = "",
    
    @PropertyName("notes")
    val notes: String = "",
    
    @PropertyName("createdAt")
    val createdAt: Long = System.currentTimeMillis(),
    
    @PropertyName("updatedAt")
    val updatedAt: Long = System.currentTimeMillis()
)

data class OrderItem(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("menuItemId")
    val menuItemId: String = "",
    
    @PropertyName("name")
    val name: String = "",
    
    @PropertyName("image")
    val image: String = "",
    
    @PropertyName("price")
    val price: Double = 0.0,
    
    @PropertyName("quantity")
    val quantity: Int = 1,
    
    @PropertyName("addons")
    val addons: List<SelectedAddon> = emptyList(),
    
    @PropertyName("specialInstructions")
    val specialInstructions: String = "",
    
    @PropertyName("totalPrice")
    val totalPrice: Double = 0.0
)

data class SelectedAddon(
    @PropertyName("id")
    val id: String = "",
    
    @PropertyName("name")
    val name: String = "",
    
    @PropertyName("price")
    val price: Double = 0.0
)

enum class OrderStatus {
    PENDING,
    CONFIRMED,
    PREPARING,
    READY_FOR_PICKUP,
    OUT_FOR_DELIVERY,
    DELIVERED,
    CANCELLED,
    REFUNDED
}

enum class PaymentMethod {
    COD, // Cash on Delivery
    CARD, // Credit/Debit Card
    UPI, // Unified Payment Interface
    WALLET // Digital Wallet
}

enum class PaymentStatus {
    PENDING,
    COMPLETED,
    FAILED,
    REFUNDED
}

data class OrderTracking(
    @PropertyName("orderId")
    val orderId: String = "",
    
    @PropertyName("status")
    val status: OrderStatus = OrderStatus.PENDING,
    
    @PropertyName("timestamp")
    val timestamp: Long = System.currentTimeMillis(),
    
    @PropertyName("location")
    val location: String = "",
    
    @PropertyName("notes")
    val notes: String = ""
)

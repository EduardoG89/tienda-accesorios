package com.example.tiendaaccesorios.domain.model

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageDrw:   Int,
    val category: String
)
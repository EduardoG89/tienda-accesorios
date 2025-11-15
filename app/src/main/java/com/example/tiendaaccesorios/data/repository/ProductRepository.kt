package com.example.tiendaaccesorios.data.repository

import com.example.tiendaaccesorios.R
import com.example.tiendaaccesorios.domain.model.Product

class ProductRepository {
    fun getProducts(): List<Product> {
        return listOf(
            Product(
                id = 1,
                name = "Cinturón de cuero negro",
                description = "Cinturón clásico de piel genuina con hebilla metálica.",
                price = 450.0,
                imageDrw = R.drawable.cint_negro,
                category = "Cinturón"
            ),
            Product(
                id = 2,
                name = "Cartera marrón de piel",
                description = "Cartera elegante con espacio para tarjetas y billetes.",
                price = 520.0,
                imageDrw = R.drawable.cart_cafe,
                category = "Cartera"
            ),
            Product(
                id = 3,
                name = "Cinturón trenzado beige",
                description = "Cinturón casual trenzado con detalles en cuero.",
                price = 380.0,
                imageDrw = R.drawable.cint_cafe,
                category = "Cinturón"
            ),
            Product(
                id = 4,
                name = "Cartera negra minimalista",
                description = "Diseño moderno y delgado con compartimientos funcionales.",
                price = 410.0,
                imageDrw = R.drawable.cart_negra,
                category = "Cartera"
            )
        )
    }
}
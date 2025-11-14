package com.example.tiendaaccesorios.data.repository

import com.example.tiendaaccesorios.domain.model.Product

class ProductRepository {
    fun getProducts(): List<Product> {
        return listOf(
            Product(
                id = 1,
                name = "Cinturón de cuero negro",
                description = "Cinturón clásico de piel genuina con hebilla metálica.",
                price = 450.0,
                imageUrl = "https://pixabay.com/get/gbb428f9ffc9f00ac67db949900ac324cc8b82b91ed39177a54ec996078abd6a6f404880bf21c180526a232aba4b87628f84f59b8d94526d42fd26d348af8ca91_1280.jpg",
                category = "Cinturón"
            ),
            Product(
                id = 2,
                name = "Cartera marrón de piel",
                description = "Cartera elegante con espacio para tarjetas y billetes.",
                price = 520.0,
                imageUrl = "https://pixabay.com/get/gbb428f9ffc9f00ac67db949900ac324cc8b82b91ed39177a54ec996078abd6a6f404880bf21c180526a232aba4b87628f84f59b8d94526d42fd26d348af8ca91_1280.jpg",
                category = "Cartera"
            ),
            Product(
                id = 3,
                name = "Cinturón trenzado beige",
                description = "Cinturón casual trenzado con detalles en cuero.",
                price = 380.0,
                imageUrl = "https://pixabay.com/get/gbb428f9ffc9f00ac67db949900ac324cc8b82b91ed39177a54ec996078abd6a6f404880bf21c180526a232aba4b87628f84f59b8d94526d42fd26d348af8ca91_1280.jpg",
                category = "Cinturón"
            ),
            Product(
                id = 4,
                name = "Cartera negra minimalista",
                description = "Diseño moderno y delgado con compartimientos funcionales.",
                price = 410.0,
                imageUrl = "https://pixabay.com/get/gbb428f9ffc9f00ac67db949900ac324cc8b82b91ed39177a54ec996078abd6a6f404880bf21c180526a232aba4b87628f84f59b8d94526d42fd26d348af8ca91_1280.jpg",
                category = "Cartera"
            )
        )
    }
}
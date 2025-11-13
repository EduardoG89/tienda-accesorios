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
                imageUrl = "https://pixabay.com/get/g8ec512ea1bb3b183fec9c150546036b23cf18fe8c4c3f56f372de64761fa10c51aa66263478817d94ce4a20f05b74e3f71f9c39ec7830dedb7d28cb66202e940_1280.jpg",
                category = "Cinturón"
            ),
            Product(
                id = 2,
                name = "Cartera marrón de piel",
                description = "Cartera elegante con espacio para tarjetas y billetes.",
                price = 520.0,
                imageUrl = "https://pixabay.com/get/g68f1a7d60902e299dcbaf159ad15ffbd6503bc3ebff2f13e91dc6d3e3059fd47f6591386abc2a8dd0ecd31e04188d510_1280.jpg",
                category = "Cartera"
            ),
            Product(
                id = 3,
                name = "Cinturón trenzado beige",
                description = "Cinturón casual trenzado con detalles en cuero.",
                price = 380.0,
                imageUrl = "https://pixabay.com/get/g738473ea6f7f1c7e328d7b3cefa6a48737256d5ade3394e362cb0d22fdbe60babe1d77bde543d7401cca138ed89721bb_1280.jpg",
                category = "Cinturón"
            ),
            Product(
                id = 4,
                name = "Cartera negra minimalista",
                description = "Diseño moderno y delgado con compartimientos funcionales.",
                price = 410.0,
                imageUrl = "https://pixabay.com/get/g943404bf8eb9ad19908a13e33c576cda7d99640e795d6c5e9fa602bc0266b513c9f51192bbfa1da6e371d47d1dfd5c1a32d495f399e2ca430f828d26cdd65d2d_1280.jpg",
                category = "Cartera"
            )
        )
    }
}
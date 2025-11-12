package com.example.tiendaaccesorios.domain.usecase

import com.example.tiendaaccesorios.data.repository.ProductRepository

class GetProductsUseCase(private val repository: ProductRepository) {
    operator fun invoke() = repository.getProducts()
}
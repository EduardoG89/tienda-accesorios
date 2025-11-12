package com.example.tiendaaccesorios.ui.screens.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.tiendaaccesorios.data.repository.ProductRepository
import com.example.tiendaaccesorios.domain.model.Product
import com.example.tiendaaccesorios.domain.usecase.GetProductsUseCase

class HomeViewModel : ViewModel() {
    private val getProductsUseCase = GetProductsUseCase(ProductRepository())
    private val _products = mutableStateOf(getProductsUseCase())
    val products: State<List<Product>> = _products
}
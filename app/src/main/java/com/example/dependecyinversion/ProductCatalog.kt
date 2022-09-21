package com.example.dependecyinversion

class ProductCatalog (private val repository: ProductRepository){
    fun getAll(): List<String>{
        return repository.getAll()

    }
}
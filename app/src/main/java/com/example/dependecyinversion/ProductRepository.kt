package com.example.dependecyinversion

interface ProductRepository {
    fun getAll(): List<String>
}
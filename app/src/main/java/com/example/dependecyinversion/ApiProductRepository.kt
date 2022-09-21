package com.example.dependecyinversion

class API : ProductRepository {
    override fun getAll(): List<String> {
        return listOf(
            "Mezcal de Gusano",
            "Mezcal Espadin",
            "Mezcal Tobala",
            "Crema de mezcal",
        )
    }
}


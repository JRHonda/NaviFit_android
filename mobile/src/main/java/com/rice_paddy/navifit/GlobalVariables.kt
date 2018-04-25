package com.rice_paddy.navifit

class GlobalVariables {

    // MARK: - Constants
    val a: String = "Poop"

    // MARK: - Variables
    var number: Int? = 0

    // MARK: - Methods
    fun testStringProperties() {
        val length: Int = a.length
        number = length
        number?.let { print(it) }
    }
} //endClass
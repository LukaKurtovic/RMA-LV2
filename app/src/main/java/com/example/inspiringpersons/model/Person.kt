package com.example.inspiringpersons.model

import java.io.Serializable

data class Person(
    val Image: Int,
    val Name: String,
    val Description: String,
    val Quotes: MutableList<String>
) : Serializable
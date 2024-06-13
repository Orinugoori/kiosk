package com.example.kiosk

class MainMenu{


    var categoryNumber : Int
    var categoryName : String


    constructor(_categoryNumber: Int, _categoryName: String){
        categoryNumber = _categoryNumber
        categoryName = _categoryName
        println("[$categoryNumber] $categoryName")
    }
}
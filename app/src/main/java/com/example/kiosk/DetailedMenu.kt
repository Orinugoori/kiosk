package com.example.kiosk

open class DetailedMenu {
    var menuName : String
    var menuNumber : Int
    var price : Int

    constructor(_menuName : String, _menuNumber : Int , _price : Int) {
        menuName = _menuName
        menuNumber = _menuNumber
        price = _price
        var menuInformation = mutableListOf(menuName,menuNumber,price)

        println("[$_menuNumber] $_menuName 가격 : $price ")
    }




}
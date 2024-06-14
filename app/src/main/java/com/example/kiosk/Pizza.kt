package com.example.kiosk

class Pizza : Menu {


    val price: Int
    val pizzaSize: String

    constructor(_menuName: String, _menuNumber: Int, _price: Int, _pizzaSize: String)
            : super(_menuNumber, _menuName) {
        price = _price
        pizzaSize = _pizzaSize
    }


    override fun display() {
        println("[${menuNumber}] <$menuName> 피자사이즈 : $pizzaSize --- $price 원 ")
    }
}
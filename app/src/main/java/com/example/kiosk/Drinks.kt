package com.example.kiosk

class Drinks : Menu {


    val price : Int

    constructor(_menuName: String, _menuNumber: Int, _price: Int)
            : super(_menuNumber, _menuName) {
        price = _price

    }


    override fun display(){
        println("[${menuNumber}] <$menuName> --- $price 원 ")
    }


}
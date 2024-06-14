package com.example.kiosk

class Pasta : Menu{


    val price : Int
    val noodle : String

    constructor(_menuName : String ,  _menuNumber : Int , _price : Int , _noodle : String)
    :super(_menuNumber,_menuName){
        price = _price
        noodle = _noodle
    }

    override fun display(){
        println("[${menuNumber}] <$menuName> 파스타 면 종류 : $noodle --- $price 원 ")
    }


}
package com.example.kiosk

open class DetailedMenu(val menuName : String , val menuNumber : Int , val price : Int) {

        fun display (){
        println("[$menuNumber] $menuName 가격 : $price")
    }

}
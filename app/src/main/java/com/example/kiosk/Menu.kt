package com.example.kiosk

open class Menu {

    val menuName : String
    val menuNumber : Int

    constructor( _menuNumber :Int, _menuName:String ){

        menuNumber = _menuNumber
        menuName = _menuName
    }
    open fun display (){
        println("[$menuNumber] $menuName")
    }
    }


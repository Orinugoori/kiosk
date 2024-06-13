package com.example.kiosk

class MainMenu {
    var number : Int
    var name : String

    constructor(_number: Int, _name: String){
        number = _number
        name = _name
        println("[$number] $name")
    }
}
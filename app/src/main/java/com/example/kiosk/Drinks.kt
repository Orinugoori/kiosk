package com.example.kiosk

class Drinks : MenuCategory("Drinks") {

    init {
        addMenu(DetailedMenu("콜라",1,2500))
        addMenu(DetailedMenu("사이다",2,2500))
    }



}
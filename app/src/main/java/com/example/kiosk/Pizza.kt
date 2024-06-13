package com.example.kiosk

class Pizza  : MenuCategory("Pizza"){

    init {
        addMenu(DetailedMenu("하와이안 피자",1,15000))
        addMenu(DetailedMenu("치즈 피자" , 2 , 18000))
    }
}
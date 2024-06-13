package com.example.kiosk

class Pasta : MenuCategory("Pasta"){

    init {
        addMenu(DetailedMenu("베이컨토마토 파스타",1,18000))
        addMenu(DetailedMenu("까르보나라 파스타",2,15000))
        addMenu(DetailedMenu("마라탕후루 파스타",3,25000))
    }

}
package com.example.kiosk



    fun main(){



        displayMainMenu()
        var selectMainMenu = inputSelect("mainmenu").toString().toInt()
        moveToDetailedMenu()









    }



fun inputSelect(type: String): Any?{
    return when (type) {
        "mainmenu" -> {
            println("어떤 메뉴를 선택하시겠습니까?")
            println("[1] Pasta [2] Pizza [3] Drinks [0] 주문 종료 ")
            var selectedMenu = readln()
        }
        else -> 0
    }
}


fun displayMainMenu(){

    println("=======오리너구리 식당 메뉴판=======")
    println("아래 메뉴판을 보시고 카테고리를 선택하면 세부 메뉴를 확인할 수 있습니다.")
    println("[메뉴 카테고리]")

    var pasta = MainMenu(1,"Pasta")
    var pizza = MainMenu(2,"Pizza")
    var drinks = MainMenu(3,"Drinks")
    println("[0] 종료")
}

fun displayDetailedMenu(){
    println("-------Pasta-------")
    println("아래 메뉴판을 보시고 메뉴를 선택해주세요")

    println("1. 베이컨 토마토 파스타")
    println("2. 까르보나라 파스타")
    println("3. 마라탕후루 파스타")
}

fun moveToDetailedMenu(){
   displayDetailedMenu()
}


class DetailedMenu{


}

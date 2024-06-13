package com.example.kiosk

import android.view.Menu


fun main() {

    while (true) {
        var selectedCategory = displayCategory()
        if (selectedCategory == 0) {
            println("프로그램을 종료합니다.")
            break
        }



            displayDetailedMenu(selectedCategory)
            var selectedMenu = inputSelect("menu").toString().toInt()

            when (selectedMenu) {
                1 -> println("주문 완료")
                2 -> println("주문 완료")
                3 -> println("주문 완료")
                0 -> {

                }
            }

        }



}


fun displayCategory(): Int {

    println("=======오리너구리 식당 메뉴판=======")
    println("아래 메뉴판을 보시고 카테고리를 선택하면 세부 메뉴를 확인할 수 있습니다.")
    println("[메뉴 카테고리]")
    println("[1] Pasta ")
    println("[2] Pizza ")
    println("[3] Drinks")
    println("[0] 종료")


    return inputSelect("category").toString().toInt()
}

fun inputSelect(type: String): Any? {
    return when (type) {
        "category" -> {
            println("어떤 카테고리를 선택하시겠습니까?")
            readln()
        }

        "menu" -> {
            println("어떤 메뉴를 선택 하시겠습니까?")
            readln()
        }

        else -> 0
    }
}


fun displayDetailedMenu(selectedCategory: Int) {


    when (selectedCategory) {
        1 -> {

            println("-------Pasta-------")
            println("아래 메뉴판을 보시고 메뉴를 선택해주세요")
            var tomatoPasta = DetailedMenu("베이컨 토마토 파스타", 1, 18000)
            var carbonara = DetailedMenu("까르보나라 파스타", 2, 15000)
            var maratangtang = DetailedMenu("마라탕후루 파스타", 3, 25000)

            tomatoPasta.display()
            carbonara.display()
            maratangtang.display()
            println("[0] 뒤로가기")

        }

        2 -> {
            println("-------Pizza-------")
            println("아래 메뉴판을 보시고 메뉴를 선택해주세요")
            var peperoniPizza = DetailedMenu("페퍼로니 피자", 1, 20000)
            var cheezePizza = DetailedMenu("치즈 피자", 2, 18000)

            peperoniPizza.display()
            cheezePizza.display()
            println("[0] 뒤로가기")

        }

        3 -> {
            println("-------Drinks-------")
            println("아래 메뉴판을 보시고 메뉴를 선택해주세요")
            var cola = DetailedMenu("콜라", 1, 3000)
            var zeroCola = DetailedMenu("제로콜라", 2, 2500)

            cola.display()
            zeroCola.display()
            println("[0] 뒤로가기")

        }

        else -> {
            println("주문 종료")
        }

    }


}



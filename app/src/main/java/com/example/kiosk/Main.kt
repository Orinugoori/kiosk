package com.example.kiosk

import android.view.Menu


fun main() {

    val pasta = Pasta()
    val pizza = Pizza()
    val drinks = Drinks()


    var categoryList = listOf(pasta,pizza,drinks)



    while (true) {
        var selectedCategory = displayCategory()
        if (selectedCategory == 0) {
            println("프로그램을 종료합니다.")
            break
        }


            movePage(selectedCategory,categoryList)
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


fun displayDetailedMenu(menuList: List<DetailedMenu>) {
        println("------- menuList -------")
        println("아래 메뉴판을 보시고 메뉴를 선택해주세요")
        for(i in menuList.indices){
            menuList[i].display()
        }
        println("[0] 뒤로가기")
    }



fun movePage(selectedCategory: Int,categoryList: List<MenuCategory>){
    when(selectedCategory){
        1 -> {
            displayDetailedMenu(categoryList[0].menuList)
        }
        2 -> {
            displayDetailedMenu(categoryList[1].menuList)
        }
        3 -> {
            displayDetailedMenu(categoryList[2].menuList)
        }

    }
}



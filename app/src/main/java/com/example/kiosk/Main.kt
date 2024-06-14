package com.example.kiosk

var menuList = mutableListOf<Menu>()
var categoryList = mutableListOf<Menu>()
fun main() {

    init()


    while (true) {
        displayCategory(categoryList)
        var selectedCategory = inputSelect("category", categoryList).toString().toInt()
        if (selectedCategory == 0) {
            println("프로그램을 종료합니다.")
            break
        }


        displayDetailedMenu(selectedCategory, menuList)
        var selectedMenu = inputSelect("menu", menuList).toString().toInt()

        when (selectedMenu) {
            in 1 ..menuList.size -> println("주문 완료")
            0 -> {}

        }
    }
}


fun displayCategory(categoryList: List<Menu>){

    println("=======오리너구리 식당 메뉴판=======")
    println("아래 메뉴판을 보시고 카테고리를 선택하면 세부 메뉴를 확인할 수 있습니다.")
    println("[메뉴 카테고리]")
    for (i in categoryList.indices) {
        categoryList[i].display()
    }
    println("[0] 종료")


}

fun inputSelect(type: String,list : List<Menu>): Any? {
    return when (type) {
        "category" -> {
            println("어떤 카테고리를 선택하시겠습니까?")
            while (true) {
                try {
                    var selectedCategory = readln().toString()
                    if (selectedCategory.isNotEmpty() && selectedCategory.toIntOrNull() in 0 until  list.size+1) {
                        return selectedCategory
                    } else {
                        println("다시 입력해주세요")
                    }
                }catch (e: Exception){
                    println("다시 입력해주세요")
                }
            }
        }

        "menu" -> {
            println("어떤 메뉴를 선택 하시겠습니까?")
            while (true) {
                try {
                    var selectedCMenu = readln().toString()
                    if (selectedCMenu.isNotEmpty() && selectedCMenu.toIntOrNull()in 0 ..3) {
                        return selectedCMenu
                    } else {
                        println("다시 입력해주세요")
                    }
                }catch (e: Exception){
                    println("다시 입력해주세요")
                }
            }
        }

        else -> 0
    }
}


fun displayDetailedMenu(selectedCategory: Int, menuList: List<Menu>) {
    when (selectedCategory) {
        1 -> {
            println("------- Pasta -------")
            println("아래 메뉴판을 보시고 메뉴를 선택해주세요")
            for (i in menuList.indices) {
                if (menuList[i] is Pasta)
                    menuList[i].display()
            }
            println("[0] 뒤로가기")
        }

        2 -> {
            println("------- Pizza -------")
            println("아래 메뉴판을 보시고 메뉴를 선택해주세요")
            for (i in menuList.indices) {
                if (menuList[i] is Pizza)
                    menuList[i].display()
            }
            println("[0] 뒤로가기")
        }

        3 -> {
            println("------- Drinks -------")
            println("아래 메뉴판을 보시고 메뉴를 선택해주세요")
            for (i in menuList.indices) {
                if (menuList[i] is Drinks)
                    menuList[i].display()
            }
            println("[0] 뒤로가기")
        }

    }
}


fun init() {
    val pasta = Menu(1, "Pasta")
    val pizza = Menu(2, "Pizza")
    val drinks = Menu(3, "Drinks")

    categoryList = mutableListOf(pasta, pizza, drinks)

    val tomatoPasta = Pasta("토마토 파스타", 1, 15000, "링귀니")
    val carbonara = Pasta("까르보나라", 2, 18000, "페투치네")
    val maratang = Pasta("마라탕후루 파스타", 3, 20000, "스파게티니")

    val hawaianPizza = Pizza("하와이안 피자", 1, 17000, "L")
    val cheezePizza = Pizza("치즈 피자", 2, 15000, "s")


    val cola = Drinks("콜라", 1, 2500)
    val sprite = Drinks("사이다", 2, 2500)
    val ade = Drinks("에이드",3,4500)

    menuList.add(tomatoPasta)
    menuList.add(carbonara)
    menuList.add(maratang)
    menuList.add(hawaianPizza)
    menuList.add(cheezePizza)
    menuList.add(cola)
    menuList.add(sprite)
    menuList.add(ade)


}

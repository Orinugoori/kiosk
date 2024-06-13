package com.example.kiosk



    fun main(){

        displayCategory()
        var selectedCategory = inputSelect("category").toString().toInt()
        moveToDetailedMenu(selectedCategory)










    }



fun inputSelect(type: String): Any?{
    return when (type) {
        "category" -> {
            println("어떤 카테고리를 선택하시겠습니까?")
            println("[1] Pasta [2] Pizza [3] Drinks [0] 주문 종료 ")
            readln()
        }
        "menu" -> {
            println("어떤 메뉴를 선택 하시겠습니까?")
            readln()
        }
        else -> 0
    }
}


fun displayCategory(){

    println("=======오리너구리 식당 메뉴판=======")
    println("아래 메뉴판을 보시고 카테고리를 선택하면 세부 메뉴를 확인할 수 있습니다.")
    println("[메뉴 카테고리]")

    var pasta = MainMenu(1,"Pasta")
    var pizza = MainMenu(2,"Pizza")
    var drinks = MainMenu(3,"Drinks")
    println("[0] 종료")
}

fun displayDetailedMenu(selectedCategory: Int){

    println("-------카테고리이름-------")
    println("아래 메뉴판을 보시고 메뉴를 선택해주세요")

    when (selectedCategory) {
        1 -> {
            val tomatoPasta = DetailedMenu("베이컨 토마토 파스타", 1, 18000)
            val carbonara = DetailedMenu("까르보나라 파스타", 2, 15000)
            val maratangtang = DetailedMenu("마라탕후루 파스타", 3, 25000)
        }
        2 -> {
            val peperoniPizza = DetailedMenu("페퍼로니 피자",1,20000)
            val cheezePizza = DetailedMenu("치즈 피자",2,18000)
        }
        3 -> {
            val cola = DetailedMenu("콜라",1,3000)
            val zeroCola = DetailedMenu("제로콜라",2,2500)
        }

    }






}

fun moveToDetailedMenu(selectedCategory : Int){
   when (selectedCategory){
       1 -> displayDetailedMenu(1)
       2 -> displayDetailedMenu(2)
       3 -> displayDetailedMenu(3)
   }
}


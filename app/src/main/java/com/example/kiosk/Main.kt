package com.example.kiosk

var menuList = mutableListOf<Menu>()
var categoryList = mutableListOf<Menu>()
var cart = mutableListOf<Menu>()
fun main() {

    init()


    while (true) {
        displayCategory(categoryList)

        val selectedCategory = inputSelect("category", categoryList).toString().toInt()

        if (selectedCategory == -1) {
            println("프로그램을 종료합니다.")
            break
        }
        displayDetailedMenu(selectedCategory, menuList)

        if (selectedCategory == 0) {
            val totalPrice = calculatetotalPrice(cart)
            displayCart(cart, totalPrice)
            val inputCash = inputSelect("cash", cart).toString().toInt()

            val yesOrNO = inputSelect("confirm", cart).toString().toInt()

            if (yesOrNO == 1) {
                try {
                    if (inputCash >= totalPrice) {
                        println("결제가 완료되었습니다.")
                        break
                    } else {
                        throw Exception()
                    }
                } catch (e: Exception) {
                    println("결제 실패 : 금액 부족")
                    println("다시 시도해주세요.")
                    continue
                }

            } else {
                println("처음 화면으로 돌아갑니다.")
                continue
            }

        }

        val selectedMenu = inputSelect("menu", menuList).toString().toInt()

        when (selectedMenu) {
            in 1..menuList.size -> {

                addCart(selectedCategory, selectedMenu, menuList)

                println("현재 선택하신 메뉴")
                for (i in cart.indices) {
                    cart[i].display()
                }


            }

            0 -> {}

        }
    }
}


fun displayCategory(categoryList: List<Menu>) {

    println("=======오리너구리 식당 메뉴판=======")
    println("아래 메뉴판을 보시고 카테고리를 선택하면 세부 메뉴를 확인할 수 있습니다.")
    println("[메뉴 카테고리]")
    for (i in categoryList.indices) {
        categoryList[i].display()
    }
    println("[0] 주문 하기")
    println("[-1] 주문 종료")


}

fun inputSelect(type: String, list: List<Menu>): Any {
    return when (type) {
        "category" -> {
            println("어떤 카테고리를 선택하시겠습니까?")
            while (true) {
                try {
                    val selectedCategory = readln()
                    if (selectedCategory.isNotEmpty() && selectedCategory.toIntOrNull() in -1 until list.size + 1) {
                        return selectedCategory
                    } else {
                        println("다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("다시 입력해주세요")
                }
            }
        }

        "menu" -> {
            println("어떤 메뉴를 선택 하시겠습니까?")
            while (true) {
                try {
                    val selectedCMenu = readln()
                    if (selectedCMenu.isNotEmpty() && selectedCMenu.toIntOrNull() in 0..3) {
                        return selectedCMenu
                    } else {
                        println("다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("다시 입력해주세요")
                }
            }
        }

        "cash" -> {
            println("현금을 투입해주세요")
            while (true) {
                try {
                    val inputCash = readln()
                    if (inputCash.isNotEmpty() && inputCash.toIntOrNull() != null) {
                        return inputCash
                    } else {
                        println("다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("다시 입력해주세요")
                }
            }
        }

        "confirm" -> {
            println("결제 하시겠습니까?")
            println("[1] 결제 진행  [2] 결제 취소")
            while (true) {
                try {
                    val yesOrNo = readln()
                    if (yesOrNo.isNotEmpty() && yesOrNo.toIntOrNull() != null) {
                        return yesOrNo
                    } else {
                        println("다시 입력해주세요")
                    }
                } catch (e: Exception) {
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

fun addCart(selectedCategory: Int, selectedMenu: Int, menuList: List<Menu>) {

    val cartItem: Menu = when (selectedCategory) {
        1 -> menuList.filterIsInstance<Pasta>().get(selectedMenu - 1)
        2 -> menuList.filterIsInstance<Pizza>().get(selectedMenu - 1)
        else -> menuList.filterIsInstance<Drinks>().get(selectedMenu - 1)
    }

    println("주문 목록에 [${cartItem.menuName}]를 추가했습니다.")
    cart.add(cartItem)
}

fun displayCart(cart: List<Menu>, totalPrice: Int) {

    println("----결제 화면----")
    println("담은 메뉴 목록")
    for (i in cart.indices) {
        cart[i].display()
    }
    println("총 결제 금액 : $totalPrice")


}

fun calculatetotalPrice(cart: List<Menu>): Int {
    var totalPrice = 0
    for (i in cart) {
        totalPrice += when (i) {
            is Pasta -> i.price
            is Pizza -> i.price
            is Drinks -> i.price
            else -> 0
        }
    }
    return totalPrice
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
    val ade = Drinks("에이드", 3, 4500)

    menuList.add(tomatoPasta)
    menuList.add(carbonara)
    menuList.add(maratang)
    menuList.add(hawaianPizza)
    menuList.add(cheezePizza)
    menuList.add(cola)
    menuList.add(sprite)
    menuList.add(ade)


}

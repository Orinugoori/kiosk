package com.example.kiosk

// 대분류 : 햄버거 아이스크림 음료수
// 햄버거 > 치즈버거 , 게살버거
// 아스크림 -> 바닐라 , 초코
//


fun main() {

    while (true) {
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println("[ SHAKESHACK MENU ]")
        println("1. 메롱햄버거 ")
        println("2. 메롱아이스크림")
        println("3. 메롱음료수")
        println("0. 종료")

        val selectedMenu = readln().toString().toInt()

        when (selectedMenu) {
            1 -> {
                println("[ 햄버거 MENU ]")
                println("1. 무슨버거 ")
                println("2. 게살버거")
                println("메뉴를 골라주세요")
                val menu = readln().toString().toInt()
            }

            2 -> {
                println("[ 아이스크림 MENU ]")
                println("1. 아이스크림1")
                println("2. 아이스크림2")
                println("메뉴를 골라주세요")
                val menu = readln().toString().toInt()
            }

            3 -> {
                println("음료수 메뉴")
                println("1.무슨 음료수")
                println("2. 다른음료수")
                println("메뉴를 골라주세요")
                val menu = readln().toString().toInt()
            }

            0 -> {
                break
            }
        }
    }
}

package com.example.kiosk

open class MenuCategory(name : String) {

    var menuList = mutableListOf<DetailedMenu>()

    fun addMenu(menu : DetailedMenu){
        menuList.add(menu)
    }

//    fun displayDetailedMenu() {
//        println("------- $name -------")
//        println("아래 메뉴판을 보시고 메뉴를 선택해주세요")
//        for(i in categoryList.indices){
//            categoryList[i].display()
//        }
//        println("[0] 뒤로가기")
//    }





}
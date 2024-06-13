package com.example.kiosk

open class MenuCategory { //DetailedMenu 인스턴스들을 리스트로 묶어주기 //카테고리를 만들어줘야함


//    var categoryNumber : Int
//    var categoryName : String
    var category = mutableListOf<DetailedMenu>()


    fun addCategory(_menuName : DetailedMenu){
        category.add(_menuName)
    }





}
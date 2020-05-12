package com.bw.myapplication

/*
 *@auther:谷建龙
 *@Date: 2020/5/12
 *@Time:8:37
 *@Description:
 * */


class kotlinIfElse {
    fun checkFace(score: Int) {
        if (score > 80)
            println("这是一个帅哥")
        else
            println("这是一个衰哥")

    }

    var score = 90

    fun returnBig(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else
            return b
    }

}
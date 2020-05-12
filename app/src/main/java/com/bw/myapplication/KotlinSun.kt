package com.bw.myapplication

/*
 *@auther:谷建龙
 *@Date: 2020/5/12
 *@Time:19:53
 *@Description:
 * */

//密封类
//sealed class更在意的是数据的类型
//枚举更在意数据
sealed class KotlinSun {
    fun sayHelly() {
        println("大家好")
    }
    class xiaolv() : KotlinSun()
    class xiaoluo() : KotlinSun()
}
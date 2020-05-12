package com.bw.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.math.BigInteger
import java.net.BindException
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ifelse
        val kotlin = kotlinIfElse()
        kotlin.score
        kotlin.checkFace(90)
        println(kotlin.returnBig(a = 9, b = 6))

        //判断字符串
        val kotlinZiFuChuan = KotlinZiFuChuan()
        println(kotlinZiFuChuan.str1 == kotlinZiFuChuan.str2)
        //第二个参数如果为true就是忽略字母大小写,如果为false就是不忽略字母大小写
        println(kotlinZiFuChuan.str1.equals(kotlinZiFuChuan.str2, true))

        //判断空值
        val kotlinKongZhi = KotlinKongZhi()
        println(kotlinKongZhi.heat("水"))
        println(kotlinKongZhi.heat(null))

        //when表达式
        val kotlinWhen = KotlinWhen()
        println(kotlinWhen.gradeStudent(80))
        println(kotlinWhen.diaryGenerator("人民大院"))

        //for循环
        //正常
        for (num in 1 until 15) {
            println(num)
        }
        //step是步长的意思
        for (a in 1..16 step 2) {
            println(a)
        }
        //reversed倒叙的意思
        var sum = 1..10
        for (s in sum.reversed()) {
            println(s)
        }

        //list
        var lists= listOf("买面条","买鸡蛋","买辣条")
        for (list in lists){
            println(list)
        }
        var map =TreeMap<String,String>()
        map["好"]="good"
        println(map)

        //阶乘
        val kotlinJieCheng = KotlinJieCheng()
        var num=BigInteger("100")
        println(kotlinJieCheng.fact(num))
    }
}

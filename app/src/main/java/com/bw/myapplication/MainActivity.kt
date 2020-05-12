package com.bw.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
    }
}

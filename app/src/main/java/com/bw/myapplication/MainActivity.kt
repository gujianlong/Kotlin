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
        //equals()第二个参数如果为true就是忽略字母大小写,如果为false就是不忽略字母大小写
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
        var lists = listOf("买面条", "买鸡蛋", "买辣条")
        for (list in lists) {
            println(list)
        }
        var map = TreeMap<String, String>()
        map["好"] = "good"
        println(map)

        //阶乘
        val kotlinJieCheng = KotlinJieCheng()
        var num = BigInteger("10")
        println(kotlinJieCheng.fact(num))

        //面向对象入门
        val kotlinRect = kotlinRect()
        println("矩形的高度是:${kotlinRect.height}")
        println("矩形的宽度是:${kotlinRect.width}")
        println("这位小姐姐的声音很:${kotlinRect.voice}的" + "但是象形很:${kotlinRect.chactor}")
        //对象具有行为和属性
        //封装
        //隐藏内部实现的细节就是封装
        //继承
        //继承是指一个对象直接使用另一个对象的属性和方法.
        //override可以让子类重写父类的方法
        //open可以让子类继承父类的方法
        //多态
        //同种功能,不同表现形态
        //接口
        //接口泛指实体把自己提供给外界的一种抽象化物,用以有外界内部
        //操作分离出外部沟通方法,使其能内部修改而不影响外界其他实体
        //与其交互的方法
        //接口和抽象类
        //接口是事物的能力
        //抽象类是事物的本质
        //委托和代理
        //枚举 (enum)

        //闭包 (closure)
        //闭包让函数成为成为编程语言的一等公民
        //闭包让函数具有对象所具有的能力
        //闭包让函数具有状态

//        函数式编程的优点
//        简洁,方便理解
//        方便程序修改和扩展
        //行为参数化
        //把筛选的的行为作为参数的传递到过滤器里面
        //简洁代码,提高效率
    }
}

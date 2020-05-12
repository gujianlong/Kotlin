package com.bw.myapplication

import java.math.BigInteger

/*
 *@auther:谷建龙
 *@Date: 2020/5/12
 *@Time:13:43
 *@Description:
 * */


class KotlinJieCheng {
    //BigInteger代表是一个数字想要多大就有多大
    //tailrec为递归优化
    tailrec fun fact(num: BigInteger): BigInteger {
        if (num == BigInteger.ONE)
            return BigInteger.ONE
        else
            return num * fact(num -BigInteger.ONE)
    }
}
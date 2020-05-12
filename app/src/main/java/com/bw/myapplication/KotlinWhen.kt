package com.bw.myapplication

/*
 *@auther:谷建龙
 *@Date: 2020/5/12
 *@Time:9:54
 *@Description:
 * */


class KotlinWhen {
    fun gradeStudent(score: Int) {
        when (score) {
            100 -> println("考了满分,真棒")
            90 -> println("干的不错")
            80 -> println("还不错")
            70 -> println("还得加油")
            80 -> println("刚好及格")
            else -> println("需要加油哦")
        }
    }

    fun diaryGenerator(placeName: String) {
        var diary = """今天天气晴朗,万里无云,我们去${placeName}游玩,首先映入眼帘的是,${placeName}${numToChinese(placeName.length)}个鎏金大字"""
        println(diary)
    }

    fun numToChinese(sum: Int): String {
        var resut = when (sum) {
            1->"一"
            2->"二"
            3->"三"
            4->"四"
            5->"五"
            else->"地名太长啦,记不清了"
        }
        return resut
    }
}
package com.bw.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kotlin = kotlin()
        kotlin.score
        kotlin.checkFace(90)
        println(kotlin.returnBig(a = 9,b = 6))
    }
}

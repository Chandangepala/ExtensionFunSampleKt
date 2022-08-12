package com.basic.extensionfunsamplekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var aInt: Int = 10

        println("aInt is even: " + aInt.isEven())
    }

    //Extension function
    fun Int.isEven(): Boolean{
        return this % 2 == 0
    }
}
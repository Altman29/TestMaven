package com.zeen.testmaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun appMethod1(): Int {
        return 1
    }


    fun appMethod2(): Int {
        return 2
    }


    fun appMethod3(): Int {
        return 3
    }
}
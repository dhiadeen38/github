package com.example.macbook.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val firstNum = num1.toString()
        val secondNum = num2.toString()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        add_btn.setOnClickListener{
        }

        fun calculate(){
            val sum = firstNum + secondNum

            result.text= "$sum"
        }
    }
}

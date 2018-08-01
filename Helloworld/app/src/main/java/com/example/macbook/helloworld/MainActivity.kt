package com.example.macbook.helloworld

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_main.setOnClickListener{
            Toast.makeText(this, "Hello world", Toast.LENGTH_LONG).show()
        }

        increment_btn.setOnClickListener{
            number++
            numberTextView.text= "$number"
        }

        decrement_btn.setOnClickListener{
            if (number!=0){
                number--
                numberTextView.text= "$number"
            }
            else{
                Toast.makeText(this, "Number cannot be negative", Toast.LENGTH_LONG).show()
            }

        }

        reset_btn.setOnClickListener{
            number = 0
            numberTextView.text= "$number"
        }

        next_btn.setOnClickListener{
            val randomIntent = Intent(this, SecondActivity::class.java)

            startActivity(randomIntent)
        }

    }
}

package com.deevrv.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener() {
            var rez: Int = 0
            var dob: Int = 0
            var ubav: Int = 0
            dob = input1.text.toString().toIntOrNull() ?: 0
            ubav = input2.text.toString().toIntOrNull() ?: 0
            rez = rez + dob - ubav.toInt()
            result.text = rez.toString()
            ap(rez)
        }


    }

    fun ap(rez: Int) {
        counter = rez + counter
        resultHole.text = counter.toString()
    }
}







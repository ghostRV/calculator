package com.deevrv.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), TextWatcher {
    private var counter = 0
    private var int1: Boolean = false
    private var int2: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input1.addTextChangedListener(this)
        input2.addTextChangedListener(this)

        button.setOnClickListener() {
            var rez: Int = 0
            var dob: Int = 0
            var ubav: Int = 0
            dob = input1.text.toString().toInt()
            ubav = input2.text.toString().toInt()
            if (int1 == true && int2 == true) {
                rez = rez + dob - ubav.toInt()
                result.text = rez.toString()
                ap(rez)
            } else  {
                Toast.makeText(this, "kghj", Toast.LENGTH_SHORT).show()
                Log.i("info", "The user clicked the top button")
            }

        }


    }

    override fun afterTextChanged(s: Editable?) {

        if (input1.text.toString().isNotEmpty()) {
            int1 = true
        }
        if (input2.text.toString().isNotEmpty()) {
            int2 = true
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}


    fun ap(rez: Int) {
        counter = rez + counter
        resultHole.text = counter.toString()

    }
}








// button.setOnClickListener() {
//            var rez: Int = 0
//            var dob: Int = 0
//            var ubav: Int = 0
//
//            dob = input1.text.toString().toInt()
//            ubav = input2.text.toString().toInt()
//            rez = rez + dob - ubav.toInt()
//            result.text = rez.toString()
//        }
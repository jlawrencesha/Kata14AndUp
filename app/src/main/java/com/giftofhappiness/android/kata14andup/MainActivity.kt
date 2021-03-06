package com.giftofhappiness.android.kata14andup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity(),LifecycleOwner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        val myButton : Button = findViewById(R.id.button)
        val myTextView: TextView = findViewById(R.id.textView)
        myButton.setOnClickListener {

        myViewModel.addNumber()
            myTextView.text = myViewModel.number.toString()

        }





    }
}
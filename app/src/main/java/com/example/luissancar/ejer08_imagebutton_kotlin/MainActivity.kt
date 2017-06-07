package com.example.luissancar.ejer08_imagebutton_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.luissancar.ejer08_imagebutton_kotlin.R.id.button
import com.example.luissancar.ejer08_imagebutton_kotlin.R.id.label

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        label.text="a"
        button.setOnClickListener({ opera() })
    }


    fun opera() {
        if (label.text=="a")
            label.text="b"
        else
            label.text="a"
    }


}

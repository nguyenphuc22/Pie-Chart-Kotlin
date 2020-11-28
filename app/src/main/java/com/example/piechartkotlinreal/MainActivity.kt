package com.example.piechartkotlinreal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun draw(view : View) {

        val arrayList = ArrayList<Int>()

        arrayList.add( Integer.valueOf(edt_1.text.toString()))
        arrayList.add( Integer.valueOf(edt_2.text.toString()))
        arrayList.add( Integer.valueOf(edt_3.text.toString()))
        arrayList.add( Integer.valueOf(edt_4.text.toString()))

        val intent = Intent(this,pieChart::class.java)
        intent.putIntegerArrayListExtra("arrayList",arrayList)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
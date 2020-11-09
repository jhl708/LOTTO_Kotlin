package com.example.llotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //TOAST : 메세지 띄우기
        Toast.makeText(applicationContext,"MainActivity입니다.", Toast.LENGTH_LONG).show()

    }
}
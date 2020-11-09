package com.example.llotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        //TOAST : 메세지 띄우기
        Toast.makeText(applicationContext,"NameActivity입니다.", Toast.LENGTH_LONG).show()
    }
}
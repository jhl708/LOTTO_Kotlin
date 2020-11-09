package com.example.llotto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        //이벤트 리스너 설정하는 방법
        //kotlin에서는 Android Extension를 사용하면 findViewById 없이 바로 접근 가능함
        //setOnClickListener  : 버튼 같은 view가 클릭되었을때 실행될 listener를 등록하는 메소드
        button.setOnClickListener {     //@+id/''.setOnClickListener
            //MainActivity로 이동하는 Intent 생성
            val intent = Intent(this@TestActivity, MainActivity::class.java)    //명시적 호출 : Intent(자기자신, 타겟)
            //intent 를 사용하여 Activity를 시작한다.
            startActivity(intent)
        }

        button2.setOnClickListener {     //@+id/''.setOnClickListener
            //ConstellationActivity로 이동하는 Intent 생성
            val intent = Intent(this@TestActivity, NameActivity::class.java)
            //intent 를 사용하여 Activity를 시작한다.
            startActivity(intent)
        }

        button3.setOnClickListener {     //@+id/''.setOnClickListener
            //NameActivity로 이동하는 Intent 생성
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
            //intent 를 사용하여 Activity를 시작한다.
            startActivity(intent)
        }

        button4.setOnClickListener {     //@+id/''.setOnClickListener
            //ResultActivity로 이동하는 Intent 생성
            val intent = Intent(this@TestActivity, ResultActivity::class.java)
            //intent 를 사용하여 Activity를 시작한다.
            startActivity(intent)
        }

    }

    //xml에서 사용할 수 있는 함수 생성
    fun goConstellation(view: View){
        //화면을 전환하는 코드
        val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
        startActivity(intent)
        //xml에서  android:onClick="goConstellation" 코드 작성
    }

    //암시적 호출(Intent)
    fun callWeb(view: View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
        startActivity(intent)
        //xml에서 android:onClick="callWeb" 코드 작성
    }

}
package com.tj.a20191031_01_androidfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainTextViewName.text=intent.getStringExtra("name")+"님이 로그인 하였습니다."
        mainTextViewNumber.text=intent.getStringExtra("number")+"번 회원"
    }
}

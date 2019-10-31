package com.tj.a20191031_01_androidfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var receivedName = intent.getStringExtra("name")
        var receivedNumber = intent.getStringExtra("number")
        var receivedId = intent.getStringExtra("id")

        mainTextViewName.text="${receivedName}(${receivedId})"
        mainTextViewNumber.text="${receivedNumber}번 회원"

    }
}

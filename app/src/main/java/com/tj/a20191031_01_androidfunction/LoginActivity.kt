package com.tj.a20191031_01_androidfunction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    // 연습문제.
    // 이름과 회원번호를 입력하고 로그인 버튼을 누르면
    // Ex. 10번 조경진 회원님 환영합니다. 라는 Toast를 띄우자.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            var name = editTextName.text
            var number = editTextNumber.text
            var loginId = editTextId.text
            Toast.makeText(this, "${number}번 ${name} 회원님 환영합니다.", Toast.LENGTH_SHORT).show()

            var myIntent = Intent(this, MainActivity::class.java)
            myIntent.putExtra("name", name.toString())
            myIntent.putExtra("number", number.toString())
            myIntent.putExtra("id", loginId.toString())
            startActivity(myIntent)
        }

        signUpBtn.setOnClickListener {
            var intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}

// 연습문제
// 회원가입 (SignUp) 화면을 만들고 배경을 초록색 #00FF00 으로만 설정하자.
// 회원가입 버튼을 누르면 해당 액티비티로 이동하도록
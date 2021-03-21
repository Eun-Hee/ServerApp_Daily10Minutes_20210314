package com.tjoeun.serverapp_daily10minutes_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.emailEdt
import kotlinx.android.synthetic.main.activity_main.signUpBtn
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        signUpBtn.setOnClickListener {

//            이메일 / 비번 / 닉네임ㅂ -> 서버 회원가입기능에 전송

            val email = emailEdt.text.toString()
            val pw =
            val nick = nicknameEdt.text.toString()

//            서버 - 회원가입기능에 전송 : ServerUtil
        }

    }

    override fun setValues() {

    }


}
package com.kim.intent3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        backToMainBtn.setOnClickListener {

            val inputMessage = newNicknameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputMessage)
            setResult(RESULT_OK, resultIntent)
            finish()


        }


    }
}
package com.kim.intent3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUEST_FOR_NICK = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToSecond1Btn.setOnClickListener {

            val inputDatas = nickName1Txt.text.toString()
            val myIntent = Intent(this, ThirdActivity::class.java)
            myIntent.putExtra("family", inputDatas)
            startActivity(myIntent)

        }

        moveToSecondBtn.setOnClickListener {

            val myIntent = Intent(this, SecondActivity::class.java)
            startActivityForResult(myIntent, REQUEST_FOR_NICK)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_FOR_NICK){

            if(resultCode == RESULT_OK){

                val receiveMessage = data?.getStringExtra("nickname")
                nickNameTxt.text = receiveMessage
            }
        }
    }
}
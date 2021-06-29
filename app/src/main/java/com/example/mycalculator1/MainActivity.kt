package com.example.mycalculator1

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result:Int = 0

        delNum1.setOnClickListener {
            edtNum1.setText("")
        }
        delNum2.setOnClickListener {
            edtNum2.setText("")
        }
        delAllNum.setOnClickListener {
            edtNum1.setText("")
            edtNum2.setText("")
        }

        btnAdd.setOnClickListener {
            val num1=edtNum1.text.toString()
            val num2=edtNum2.text.toString()

            if(num1=="" || num2==""){
                Toast.makeText(applicationContext,"숫자를 입력하시오",Toast.LENGTH_SHORT).show()
            }else{
                result=(num1.toInt()+num2.toInt())
                resultView.text= "계산 결과: $result"
                resultView.setTextColor(Color.RED)
            }
        }

        btnSub.setOnClickListener {
            val num1=edtNum1.text.toString()
            val num2=edtNum2.text.toString()

            if(num1=="" || num2==""){
                Toast.makeText(applicationContext,"숫자를 입력하시오",Toast.LENGTH_SHORT).show()
            }else{
                result=(num1.toInt()-num2.toInt())
                resultView.text= "계산 결과: $result"
                resultView.setTextColor(Color.RED)
            }
        }

        btnMul.setOnClickListener {
            val num1=edtNum1.text.toString()
            val num2=edtNum2.text.toString()

            if(num1=="" || num2==""){
                Toast.makeText(applicationContext,"숫자를 입력하시오",Toast.LENGTH_SHORT).show()
            }else{
                result=(num1.toInt()*num2.toInt())
                resultView.text= "계산 결과: $result"
                resultView.setTextColor(Color.RED)
            }
        }

        btnDiv.setOnClickListener {
            val num1=edtNum1.text.toString()
            val num2=edtNum2.text.toString()

            if(num1=="" || num2==""){
                Toast.makeText(applicationContext,"숫자를 입력하시오",Toast.LENGTH_SHORT).show()
            }else if(num2=="0"){
                Toast.makeText(applicationContext,"0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show()
            }else{
                result=(num1.toInt()/num2.toInt())
                resultView.text= "계산 결과: $result"
                resultView.setTextColor(Color.RED)
            }
        }

    }
}
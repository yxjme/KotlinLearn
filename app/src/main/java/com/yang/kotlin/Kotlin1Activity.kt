package com.yang.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kotlin1.*

class Kotlin1Activity : AppCompatActivity() {

    private lateinit var str:StringBuffer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin1)
        init()
    }


    private fun init(){
        str = StringBuffer()
        str.append("定义变量和常量").append("\n")
        str.append("可变变量定义：var 关键字").append("\n")
        str.append("var <标识符>  = <初始化值>").append("\n")
        str.append("var <标识符> : <类型> = <初始化值>").append("\n")
        str.append("不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)").append("\n")
        str.append("val <标识符> : <类型> = <初始化值>").append("\n")
        var s = " val a : Int = 0 \n val a1 = 0\n var b : String = \"\" var b1 = null "
        str.append(s).append("\n")
        text.text=str.toString()
    }



    inner class Bean(var b:String){

        init {
            print(b)
        }

        constructor(b:String,a:String):this(b){

        }

        constructor(b:String,v:String,v1:Int):this(b){

        }
    }
}

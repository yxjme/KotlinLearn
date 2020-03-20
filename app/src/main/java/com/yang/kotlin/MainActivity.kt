package com.yang.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.textview_layout.view.*


class MainActivity : AppCompatActivity(){

    /**初始化数据*/
    private val list= arrayOf("Kotlin基础语法", "Kotlin基本数据类型","Kotlin条件控制","Kotlin循环控制","Kotlin类和对象", "Kotlin继承","Kotlin接口","Kotlin扩展")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initList()
    }

    private fun initList(){
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter =  MainAdapter(list)
    }

    private inner class MainAdapter(val items :Array<String>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
        override fun onBindViewHolder(holder: MainViewHolder, p: Int) {
            holder.item.itemText.text = items[p]
            holder.item.image.setImageResource(R.drawable.ic_launcher_background)
            holder.item.setOnClickListener{
                this@MainActivity.toActivity(p)
            }
        }
        override fun getItemCount() : Int{
            return items.size
        }

        override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MainViewHolder {
            val view = LayoutInflater.from(p0.context).inflate(R.layout.textview_layout,p0,false)
            return MainViewHolder(view)
        }

        private inner class MainViewHolder constructor(val item: View): RecyclerView.ViewHolder(item)
    }



    /**
     * @param p
     */
    fun toActivity(p: Int) {
        when(p){
            0 ->{
                startActivity(Intent(this@MainActivity, Kotlin1Activity::class.java))
            }
            1->{
                startActivity(Intent(this@MainActivity, Kotlin1Activity::class.java))
            }
            2->{
                startActivity(Intent(this@MainActivity, Kotlin1Activity::class.java))
            }
            3->{
                startActivity(Intent(this@MainActivity, Kotlin1Activity::class.java))
            }
            4->{
                startActivity(Intent(this@MainActivity, Kotlin1Activity::class.java))
            }
            else->{
                startActivity(Intent(this@MainActivity, Kotlin1Activity::class.java))
            }
        }
    }
}


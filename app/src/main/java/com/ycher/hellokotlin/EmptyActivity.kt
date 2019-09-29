package com.ycher.hellokotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Kotlin 的变量、函数和类型「练习题」
 * 1 - 使用 Android Studio 创建一个基于 Kotlin 的新项目（Empty Activity），添加一个新的属性（类型是非空的 View），在 onCreate 函数中初始化它。
 * 2 - 声明一个参数为 View? 类型的方法，传入刚才的 View 类型属性，并在该方法中打印出该 View? 的 id。
 */

class EmptyActivity : AppCompatActivity() {

    companion object {
        const val TAG = "EmptyActivity"
    }

    private lateinit var tvNonEmpty: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        tvNonEmpty = findViewById(R.id.tvNonEmpty)
        empty(tvNonEmpty)
    }

    private fun empty(v: View?) {
        val string = v.toString()
        Log.i(TAG, "View? id is $string")
        tvNonEmpty.text = string
    }
}

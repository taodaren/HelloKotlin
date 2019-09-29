package com.ycher.hellokotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_array_list.*

/**
 * 分别用 Array、IntArray、List 实现 「保存 1-100_000 的数字，并求出这些数字的平均值」，打印出这三种数据结构的执行时间。
 */
class ArrayListActivity : AppCompatActivity() {

    companion object {
        const val TAG = "ArrayListActivity"
        const val CLEAR = "clear string"
        const val MAX = 100_000
        var str = ""
    }

    fun onClick(view: View) {
        var avg = 0f
        val startTime = System.currentTimeMillis()

        when (view.id) {
            R.id.btn_array      -> avg = modeArray()
            R.id.btn_int_array  -> avg = modeIntArray()
            R.id.btn_list       -> avg = modeList()

            else -> str = CLEAR
        }

        str = when (str) {
            CLEAR -> ""
            else -> str.plus("\n平均数值 = $avg | 执行时间 = ${System.currentTimeMillis() - startTime}")
        }

        Log.i(TAG, str)
        tvShow.text = str
    }

    private fun modeArray(): Float {
        var sum = 0L
        val array: Array<Int>

        array = Array(MAX, init = { i -> i + 1 })

        for (i in array) {
            sum += i
        }

        return sum / array.size.toFloat()
    }

    private fun modeIntArray(): Float {
        var sum = 0L
        val intArray: IntArray

        intArray = IntArray(MAX, init = { i -> i + 1 })

        for (i in intArray) {
            sum += i
        }

        return sum / intArray.size.toFloat()
    }

    private fun modeList(): Float {
        var sum = 0L
        val list: List<Int>

        list = List(MAX, init = { i -> i + 1 })

        for (i in list) {
            sum += i
        }

        return sum / list.size.toFloat()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array_list)
    }
}

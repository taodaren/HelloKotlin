package com.ycher.hellokotlin

// 创建一个 Kotlin 类，这个类需要禁止外部通过构造器创建实例，并提供至少一种实例化方式。

class CreateInstances {

    fun callMethod() {
        val instance1 = getInstance()

        val instance2 = Second.getInstance()

        val instance3 = Third.getInstance()
    }

    companion object {
        fun getInstance(): CreateInstances {
            return CreateInstances()
        }
    }

    object Second {
        fun getInstance(): CreateInstances {
            return CreateInstances()
        }
    }

    class Third {
        companion object {
            fun getInstance() {

            }
        }
    }

}
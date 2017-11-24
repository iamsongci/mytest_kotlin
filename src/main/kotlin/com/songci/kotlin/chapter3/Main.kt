package com.songci.kotlin.chapter3

/**
 * Created by SongLiuxin on 2017/11/24.
 * val类似java中的final
 * 加上const，编译期常量，系统在编译时就知道了
 * 不加加上const，运行时常量，系统在运行时知道值为多少
 */

const val FINAL_HELLO_WORLD:String = "HelloWorld"//编译期常量，可以提升代码执行效率
val Final_HELLO ="Hello" //编译器很聪明 能够类型推导，知道是String

fun main(args: Array<String>) {
    var a:Int = 1
    a = 2
    println("$a")
}
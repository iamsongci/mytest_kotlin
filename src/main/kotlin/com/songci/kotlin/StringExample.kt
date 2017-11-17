package com.songci.kotlin

/**
 * Created by SongLiuxin on 2017/11/17.
 */
val string:String = "HelloWorld"
val fromChars:String = String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))

fun main(args: Array<String>) {
    println(string == fromChars)//与equals完全等价
    println(string === fromChars)//比较引用值与java中 = = 等价

    println("连接字符串"+ string)

    val arg1:Int = 0
    val arg2:Int = 2
    println("$arg1+$arg2=${arg1+arg2}")

    println("Hello \'Trump\'")//转义符

    val salay:Int = 1000
    println("$$salay")
    println("\$salay")

    var rawString:String = """
    厉害的原始字符串
    \t
    \n
    $salay
    """
    println(rawString)
    println(rawString.length)
}
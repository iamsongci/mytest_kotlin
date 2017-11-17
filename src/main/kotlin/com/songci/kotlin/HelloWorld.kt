package com.songci.kotlin

/**
 * Created by SongLiuxin on 2017/11/17.
 */
val FINAL_HELLO_WORLD:String = "Hello World"
var helloWorld:String = FINAL_HELLO_WORLD
var nullableHelloWorld:String ? = helloWorld
var helloWorldArray:Array<Char> = arrayOf('H','e','l','l','o','W','o','r','l','d')
var helloWorldCharArray:CharArray = charArrayOf('H','e','l','l','o','W','o','r','l','d')
var helloWorldLength:Int = helloWorld.length
var helloWorldLengthLong:Long = helloWorldLength.toLong()
fun main(args:Array<String>){
    println("Hello World")
    println(helloWorld)
    println(nullableHelloWorld)
    println(helloWorldArray.joinToString(""))
    println(helloWorldCharArray)
    println(helloWorldLength)
    println(helloWorldLengthLong)

}
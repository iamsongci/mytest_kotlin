package com.songci.kotlin

/**
 * Created by SongLiuxin on 2017/11/17.
 */
val range:IntRange = 0..1024 //[0,1024]
val range_exclusive:IntRange = 0 until 1024 //[1,1024) =[0,1023]

val emptyRange:IntRange =0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty())  //是否为空
    println(range.contains(500)) //constains是否包含500
    println(50 in range)//50是否在[0,1024]之间

    for (i  in range_exclusive){
        println("$i,")
    }
}
package com.songci.kotlin

/**
 * Created by SongLiuxin on 2017/11/17.
 */
val aBoolean:Boolean = true
val anotherBoolean:Boolean = false

val anInt:Int = 8
val anotherInt:Int =0xff
val moreInt:Int = 0b00000011
val maxInt:Int = Int.MAX_VALUE
val minInt:Int = Int.MIN_VALUE

val aLong:Long = 12313123131231231
val anotherLong:Long = 123
val maxLong:Long = Long.MAX_VALUE
val minLong:Long =Long.MIN_VALUE

val aFloat:Float =2.0F
val anotherFloat:Float = 1E3f
val maxFloat:Float = Float.MAX_VALUE
val minFloat:Float = -Float.MAX_VALUE //真正最小值   Float.MIN_VALUE正数最小值

val aDouble = 3.0
val anotherDuouble = 3.1415926
val maxDouble:Double = Double.MAX_VALUE
val minDouble:Double = -Double.MIN_VALUE

val maxShort:Short = Short.MAX_VALUE
val minShort:Short = Short.MIN_VALUE


val maxByte:Byte = Byte.MAX_VALUE
val minByte:Byte = Byte.MIN_VALUE

val aChar:Char = '0';
var bChar:Char = '你'
var cChar:Char = '\u000f'
fun main(args:Array<String>){
    println(anotherInt)
    println(moreInt)

    println(maxInt)
    println(Math.pow(2.0,31.0)-1)
    println(minInt)
    println(-Math.pow(2.0,31.0))

    println(maxLong)
    println(Math.pow(2.0,63.0)-1)
    println(minLong)
    println(-Math.pow(2.0,63.0))

    println(aFloat)
    println(anotherFloat)
    println(maxFloat)
    println(minFloat)

    println(0.0F/0.0F)
    println(Float.NaN)
    println(0.0F/0.0F == Float.NaN) //任何一个NotNumber比较起来没有意义

    println(maxDouble)
    println(minDouble)

    println(maxShort)
    println(minShort)

    println(maxByte)
    println(minByte)

    println(aChar)
    println(bChar)
    println(cChar)//看不到的字符
}
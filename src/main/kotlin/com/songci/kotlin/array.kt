package com.songci.kotlin

import com.songci.kotlin.市委书记.上海.市委书记

/**
 * Created by SongLiuxin on 2017/11/24.
 */
var arrayOfInt:IntArray = intArrayOf(1,2,3,4)
var arrayOfChar:CharArray = charArrayOf('h','e','l','l','o')
var arrayOfString:Array<String> = arrayOf("我","是","码农")
var ayyayOf市委书记:Array<市委书记> = arrayOf(市委书记("张"), 市委书记("王"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for(i in arrayOfInt){
        println(i)
    }
    println(ayyayOf市委书记[0])
    ayyayOf市委书记[0] = 市委书记("李")
    println(ayyayOf市委书记[0])

    println(arrayOfChar.joinToString(""))
    println(arrayOfInt.slice(1..2))//取[1,2]的元素，从0开始算
}
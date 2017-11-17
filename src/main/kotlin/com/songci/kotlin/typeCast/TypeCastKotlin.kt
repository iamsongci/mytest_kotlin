package com.songci.kotlin.typeCast

/**
 * Created by SongLiuxin on 2017/11/17.
 */
fun main(args: Array<String>) {
    val parent:Parent = Child();
    if(parent is Child){
        println(parent.name)
    }

    val string:String?="Hello"
    if(string != null){
        println(string.length)
    }

    //类转换异常
    val parent1:Parent = Parent()
    val child1:Child? = parent as? Child //as?安全的类型转换
    println(child1)
}
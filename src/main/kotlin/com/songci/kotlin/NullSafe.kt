package com.songci.kotlin

/**
 * Created by SongLiuxin on 2017/11/17.
 */
//fun getName():String{
//    return "哈哈";
//}
fun getName():String?{
//    return null;
    return "123"
}

fun main(args: Array<String>) {
//    val name = getName()
    val name1:String = getName()?: return  //将getName()的值反回给name:String不可为空的String  ?:  如果为null则执行后面的return，否则继续执行
    println(name1.length)
//    println(name?.length)
//    if (name == null) return
//    if (name == null){
//        println("name is invalid")
//    }else{
//        println(name.length)
//    }
val value:String? = "HelloWorld"  //String?可为null的String
//    println(value.length) //编译器不会执行.length
    println(value!!.length)//告诉编译器没问题，去执行吧
}
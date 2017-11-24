package com.songci.kotlin.chapter3

/**
 * Created by SongLiuxin on 2017/11/24.
 */
fun main(args: Array<String>):Unit { //kotiln中的Unit相当于java中的void
    if (args.size < 2){
        println("你需要传入两个整型参数")
        System.exit(0);//exit中的code其实是需要开发提供一个错误码表
    }
    var arg1 = args[0].toInt()
    var arg2 = args[1].toInt()
    println("$arg1 + $arg2 = ${sum(arg1, arg2)}")

    println(int2Long(2))

    println(lambdaMinus(1,4))

    //遍历数组args
    for (i in args){
        println(i)
    }
    //lambda遍历数组
     args.forEach ForEach@{  //@ForEach跳出这个函数迭代
         if(it == "5") return@ForEach
         println(it) }
}
fun sum(arg1:Int,arg2:Int):Int{
    return arg1 + arg2
}
val printlnHello = { println("Hello")}
//lambda   () -> Unit

val lambdaMinus = {arg1:Int,arg2:Int ->  //lambda
    println("$arg1 + $arg2 = ${arg1+arg2}")
    arg1 + arg2}
fun minus(arg1:Int,arg2:Int)=arg1 - arg2
//() -> Unit

val int2Long = fun(x:Int):Long{  //匿名函数  与 lambdaMinus实质上没什么区别
    return x.toLong()
}
//(Int) -> Long
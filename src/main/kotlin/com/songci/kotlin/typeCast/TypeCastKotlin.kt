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
        println(string.length)//智能类型转换，看到前面已经判断不为null，因此可以使用不为空的方法
    }

    //类转换异常
    val parent1:Parent = Parent()
    val child1:Child? = parent as? Child //as?安全的类型转换,如果转换失败，返回null，不抛异常
    println(child1)
}
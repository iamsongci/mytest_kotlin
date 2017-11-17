package com.songci.kotlin

/**
 * Created by SongLiuxin on 2017/11/17.
 */
//class 妹子 constructor( var 性格:String,var 长相:String, var 声音:String ){
//
//}
open class 人 (var 性格:String,var 长相:String, var 声音:String ){
    init {
        println("new了一个${this.javaClass.simpleName}，性格：$性格，长相：$长相，声音：$声音")
    }
}
class 妹子 ( 性格:String, 长相:String,  声音:String ):人(性格, 长相, 声音)
class 帅哥( 性格:String, 长相: String, 声音: String):人(性格, 长相, 声音)
fun main(args: Array<String>) {
    val 我喜欢的妹子:妹子 = 妹子("温柔","甜美","动人")
    val 我喜欢的帅哥:帅哥 = 帅哥("彪悍","帅气","浑厚")
    println(我喜欢的妹子 is 人)
}

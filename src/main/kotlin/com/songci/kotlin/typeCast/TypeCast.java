package com.songci.kotlin.typeCast;

/**
 * Created by SongLiuxin on 2017/11/17.
 */
public class TypeCast {
    public static void main(String... args){
        Parent parent = new Child();
        System.out.println(((Child)parent).getName());

        if(parent instanceof Child){   //Child是Parent的实例
            System.out.println(((Child) parent).getName());   //为啥还要强转？不智能
        }
    }
}

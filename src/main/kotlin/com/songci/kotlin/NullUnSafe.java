package com.songci.kotlin;

/**
 * Created by SongLiuxin on 2017/11/17.
 */
public class NullUnSafe {
    public static void main(String... args ){
        String name=getName();
        if(name == null){
            System.out.println("Null");
        }else {
            System.out.println(getName().length());
        }

    }
    public static String getName(){
        return null;
    }
}

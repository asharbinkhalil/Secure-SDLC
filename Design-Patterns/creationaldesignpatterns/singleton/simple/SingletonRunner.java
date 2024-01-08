package com.digicl.creationaldesignpatterns.singleton.simple;

import com.digicl.creationaldesignpatterns.singleton.simple.SimpleSingleton;

public class SingletonRunner {
    public static void main(String[] args){
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        SimpleSingleton singleton = SimpleSingleton.getInstance("BAR");
        SimpleSingleton anotherSingleton = SimpleSingleton.getInstance("FOO");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

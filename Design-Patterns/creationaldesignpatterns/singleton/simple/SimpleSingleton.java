package com.digicl.creationaldesignpatterns.singleton.simple;

public class SimpleSingleton {
    private static SimpleSingleton instance;
    public String value;

    private SimpleSingleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SimpleSingleton getInstance(String value) {
        if (instance == null) {
            instance = new SimpleSingleton(value);
        }
        return instance;
    }
}
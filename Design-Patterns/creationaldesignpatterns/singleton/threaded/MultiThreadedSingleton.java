package com.digicl.creationaldesignpatterns.singleton.threaded;

public class MultiThreadedSingleton {
    private static MultiThreadedSingleton instance;
    public String value;

    private MultiThreadedSingleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static MultiThreadedSingleton getInstance(String value) {
        if (instance == null) {
            instance = new MultiThreadedSingleton(value);
        }
        return instance;
    }
}

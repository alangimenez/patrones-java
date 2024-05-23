package org.gimenezalan.singleton;

public class SingletonClass {
    private static SingletonClass instance;
    public String singletonValue;

    private SingletonClass(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.singletonValue = value;
    }

    public static SingletonClass getInstance(String value) {
        if (instance == null) {
            instance = new SingletonClass(value);
        }
        return instance;
    }
}

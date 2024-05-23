package org.gimenezalan.singleton;

import com.google.inject.Singleton;

@Singleton
public class SingletonClassWithAnotation {
    public String singletonValue;

    public SingletonClassWithAnotation(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.singletonValue = value;
    }
}

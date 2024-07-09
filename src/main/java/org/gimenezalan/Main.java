package org.gimenezalan;

import org.gimenezalan.builder.BuilderMain;
import org.gimenezalan.factoryMethod.FactoryMethodMain;
import org.gimenezalan.singleton.SingletonMain;

public class Main {
    public static void main(String[] args) {
        // SINGLETON
        // SingletonMain singletonMain = new SingletonMain();
        // singletonMain.executeSingletonMain();

        // BUILDER
        // BuilderMain builderMain = new BuilderMain();
        // builderMain.executeBuilderMain();

        // FACTORY METHOD
        FactoryMethodMain factoryMethodMain = new FactoryMethodMain();
        factoryMethodMain.executeFactoryMethodMain();
    }
}
package org.gimenezalan.singleton;

public class SingletonMain {
    public void executeSingletonMain() {
        // con clase sin anotacion @Singleton
        SingletonClass firstSingleton = SingletonClass.getInstance("first");
        SingletonClass secondSingleton = SingletonClass.getInstance("second");
        System.out.println(firstSingleton.singletonValue);
        System.out.println(secondSingleton.singletonValue);

        // con clase con anotación @Singleton
        // aca no funciona porque la anotación singleton es para injección de dependencias
        /*SingletonClassWithAnotation thirdSingleton = new SingletonClassWithAnotation("third");
        SingletonClassWithAnotation fourthSingleton = new SingletonClassWithAnotation("fourth");
        System.out.println(thirdSingleton.singletonValue);
        System.out.println(fourthSingleton.singletonValue);*/
    }
}

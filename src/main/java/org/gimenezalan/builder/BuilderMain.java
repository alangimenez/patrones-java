package org.gimenezalan.builder;

import org.gimenezalan.builder.builders.impl.CarBuilder;
import org.gimenezalan.builder.builders.impl.CarManualBuilder;
import org.gimenezalan.builder.cars.Car;
import org.gimenezalan.builder.cars.Manual;
import org.gimenezalan.builder.director.Director;

public class BuilderMain {
    public void executeBuilderMain() {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        CarBuilder builder = new CarBuilder();
        // builder to use to get a specific product.
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        car.getTripComputer().showFuelLevel();
        car.getTripComputer().showStatus();

        director.constructSUV(builder);
        Car suvCar = builder.getResult();
        suvCar.getTripComputer().showFuelLevel();
        suvCar.getTripComputer().showStatus();


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}

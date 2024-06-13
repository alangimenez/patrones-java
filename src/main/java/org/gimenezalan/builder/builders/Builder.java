package org.gimenezalan.builder.builders;

import org.gimenezalan.builder.cars.CarType;
import org.gimenezalan.builder.components.Engine;
import org.gimenezalan.builder.components.GPSNavigator;
import org.gimenezalan.builder.components.Transmission;
import org.gimenezalan.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

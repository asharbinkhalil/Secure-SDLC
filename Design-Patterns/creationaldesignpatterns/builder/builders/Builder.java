package com.digicl.creationaldesignpatterns.builder.builders;

import com.digicl.creationaldesignpatterns.builder.car.CarType;
import com.digicl.creationaldesignpatterns.builder.components.Engine;
import com.digicl.creationaldesignpatterns.builder.components.GPSNavigator;
import com.digicl.creationaldesignpatterns.builder.components.Transmission;
import com.digicl.creationaldesignpatterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

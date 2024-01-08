package com.digicl.creationaldesignpatterns.builder.builders;

import com.digicl.creationaldesignpatterns.builder.car.CarType;
import com.digicl.creationaldesignpatterns.builder.car.Manual;
import com.digicl.creationaldesignpatterns.builder.components.Engine;
import com.digicl.creationaldesignpatterns.builder.components.GPSNavigator;
import com.digicl.creationaldesignpatterns.builder.components.Transmission;
import com.digicl.creationaldesignpatterns.builder.components.TripComputer;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

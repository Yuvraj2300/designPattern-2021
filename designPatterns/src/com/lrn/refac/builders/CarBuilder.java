package com.lrn.refac.builders;

import com.lrn.refac.builders.cars.Car;
import com.lrn.refac.builders.cars.CarType;
import com.lrn.refac.builders.cars.components.Engine;
import com.lrn.refac.builders.cars.components.GPSNavigator;
import com.lrn.refac.builders.cars.components.Transmission;
import com.lrn.refac.builders.cars.components.TripComputer;

public class CarBuilder implements Builder {
	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

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

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}

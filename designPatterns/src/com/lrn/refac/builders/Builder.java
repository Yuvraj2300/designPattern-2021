package com.lrn.refac.builders;

import com.lrn.refac.builders.cars.CarType;
import com.lrn.refac.builders.cars.components.Engine;
import com.lrn.refac.builders.cars.components.GPSNavigator;
import com.lrn.refac.builders.cars.components.Transmission;
import com.lrn.refac.builders.cars.components.TripComputer;

public interface Builder {
	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setGPSNavigator(GPSNavigator gpsNavigator);

	void setTripComputer(TripComputer tripComputer);
}

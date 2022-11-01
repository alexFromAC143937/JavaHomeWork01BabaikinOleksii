package hw20221027.CarForUse;

import hw20221027.Car.Engine;
import hw20221027.Car.HeavyCar;
import hw20221027.Enams.CarStatus;

public class Truck extends HeavyCar {

    public Truck(String name, CarStatus status, Engine engine, int maxWeight) {
        super(name, status, engine, 100, maxWeight);
    }
}

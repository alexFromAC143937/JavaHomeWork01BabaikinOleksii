package hw20221027.CarForUse;

import hw20221027.Car.Engine;
import hw20221027.Car.HeavyCar;
import hw20221027.Enams.CarStatus;

public class Tractor extends HeavyCar {
    public Tractor(String name, CarStatus status, Engine engine) {
        super(name, status, engine, 30, 30000);
    }
}

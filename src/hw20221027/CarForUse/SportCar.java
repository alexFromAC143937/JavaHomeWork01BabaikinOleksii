package hw20221027.CarForUse;

import hw20221027.Car.Engine;
import hw20221027.Car.PersonalCar;
import hw20221027.Enams.CarStatus;

public class SportCar extends PersonalCar {

    public SportCar(String name, CarStatus status,  String comfortName) {
        super(name, status, new Engine("Gasoline"), 300, comfortName);
    }
}

package hw20221027.Car;

import hw20221027.Enams.CarStatus;

public class PersonalCar extends GeneralCar {

    private String comfortName;


    public PersonalCar(String name, CarStatus status, Engine engine, int maxSpeed, String comfortName) {
        super(name, status, engine, maxSpeed);
        this.comfortName = comfortName;
    }
}

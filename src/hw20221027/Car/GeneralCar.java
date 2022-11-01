package hw20221027.Car;

import hw20221027.Enams.CarStatus;

import java.util.Objects;

public abstract class  GeneralCar implements Car, Comparable{

    private String name;
    private int speed;
    private boolean carOn = false;
    private CarStatus status;
    private Engine Engine;
    private int maxSpeed;

    public GeneralCar(String name, CarStatus status, hw20221027.Car.Engine engine, int maxSpeed) {
        this.name = name;
        this.status = status;
        Engine = engine;
        this.maxSpeed = maxSpeed;
    }

    protected void setSpeed(int speed) {

        switch (status) {
            case NEW:
            case USED:
                if (speed > this.getMaxSpeed()){
                    System.out.printf("Max car speed is %d. A car is not able to go with the speed %d", getMaxSpeed() ,speed );
                    speed = getMaxSpeed();
                }
                this.speed = speed;
                System.out.println("Car speed : " + this.speed);

                break;
            case NOTWORKING:
                this.speed = 0;
                System.out.println("Please, repair a car, change status. The сar speed : " + this.speed);
                break;
            default:
                this.speed = 0;
                System.out.println("Please, check a Car status. The car speed : " + this.speed);
        }
    }

    @Override
    public void go(int speed) {
        setSpeed(speed);
    }

    @Override
    public void stop() {
        setSpeed(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public CarStatus getStatus() {
        return null;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void onEngine() {

    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void offEngine() {
    }

    public boolean isCarOn() {
        return carOn;
    }

    public void setCarOn(boolean carOn) {
        this.carOn = carOn;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public Engine getEngine() {
        return Engine;
    }

    public void setEngine(Engine engine) {
        Engine = engine;
    }

    @Override
    public int compareTo(Object o) {
        GeneralCar generalCar = (GeneralCar) o;
        int comp = this.name.compareTo(generalCar.getName());
        if(this.name.compareTo(generalCar.getName()) == 0){
           return this.maxSpeed - generalCar.getMaxSpeed();
        }
        return comp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSpeed);
    }
}
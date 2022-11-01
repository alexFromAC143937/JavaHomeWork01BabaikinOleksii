package hw20221027.Car;

import hw20221027.Enams.CarStatus;

public interface Car{

    public String getName();
    public void setName(String name);
    public CarStatus getStatus();
    public int getMaxSpeed();
    public void setMaxSpeed(int maxSpeed);
    public int getSpeed();
    public void onEngine();
    public void offEngine();
    public void go(int speed);
    public void stop();
}

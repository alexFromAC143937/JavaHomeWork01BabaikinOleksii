package hw20221027.CarForUse;

import hw20221027.Car.Car;
import hw20221027.Car.Engine;
import hw20221027.Car.GeneralCar;
import hw20221027.DataBase.DataBase;
import hw20221027.Enams.CarStatus;

import java.util.ArrayList;
import java.util.List;

public class AvtoMarket {

    static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        DataBase  dataBase = new DataBase();

        for (int i = 0; i <= 14 ; i++){
            switch (i%4){
                case 0:
                    addCarToArray(new CityCar("Toyota N" +i, CarStatus.NEW, "Comfort"));
                    break;
                case 1:
                    addCarToArray(new SportCar("Ferrari N" +i, CarStatus.NOTWORKING, "Sport"));
                    break;
                case 2:
                    addCarToArray(new Truck("Volvo N" +i, CarStatus.USED, new Engine("Disel"), 20000));
                    break;
                case 3:
                    addCarToArray(new Tractor("Tractor DW4" +i, CarStatus.NEW, new Engine("Steam")));
                    break;
            }
            dataBase.addItem(cars.get(i));
        }
        arrayToString();
        dataBase.print();
    }

    private static void addCarToArray(Car item){
        cars.add(item);
    }

    private static void arrayToString(){
        System.out.println(" Init array:");
        for (Car car: cars){
            System.out.print(((GeneralCar) car).toString() + " | ");
        }
        System.out.println();
    }
}

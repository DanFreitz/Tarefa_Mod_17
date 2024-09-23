package Programas.services;

import java.util.ArrayList;
import java.util.List;

    public class CarFactory<T> {

    List<T> garage = new ArrayList<>();

    public void storeCar(T Car) {
        garage.add(Car);
    }

    public void reportCarsInGarage() {
        System.out.print("[");
        if (garage.isEmpty()) {
            throw new IllegalStateException("The garage is empty!");
        }

//        for (int i = 0; i < garage.size(); i++) {
//            System.out.print(garage.get(i));
//        }
        garage.forEach(System.out::print);
        System.out.print("]");
    }
}

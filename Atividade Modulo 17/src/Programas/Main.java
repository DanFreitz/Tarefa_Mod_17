package Programas;

import Programas.carros.Toyota;
import Programas.carros.Bmw;
import Programas.services.CarFactory;

/*
 * @author DanFreitz
 */

    public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Toyota SupraMK4 = new Toyota("Supra MK4", "Orange", 2011);
        Toyota SupraMK5 = new Toyota("Supra MK5", "White", 2021);
        Bmw BmwX6 = new Bmw("BmwX6", "Black", 2024);
        Bmw BmwM4 = new Bmw("BmwM4", "Pearl", 2025);

        carFactory.storeCar(SupraMK4);
        carFactory.storeCar(SupraMK5);
        carFactory.storeCar(BmwX6);
        carFactory.storeCar(BmwM4);

        carFactory.reportCarsInGarage();


    }
}
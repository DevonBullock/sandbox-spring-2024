package org.example.sandbox.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());  //anonymous instantiation
            vehicles.add(new Truck());
        }
//        for(Vehicle vehicle : vehicles) {
//            vehicle.startEngine();
//            displayVehicle(vehicle);
//            vehicle.stopEngine();
//            displayVehicle(vehicle);
//        }

        System.out.println(vehicles);
    }
}

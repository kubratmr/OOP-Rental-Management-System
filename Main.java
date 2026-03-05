
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kübra
 */
public class Main {
    public static void main(String[] args) {
        // Car(plate, id, brand, model, dailyRent, trunkCapacity, isAvailable, fuelType,
        // mileage, productionYear)
        Car car1 = new Car("34 ABC 01", "C001", "Fiat", "Egea", 800.0, 440, true, "Diesel", 45000, 2021);
        Car car2 = new Car("06 TES 99", "C002", "Tesla", "Model Y", 2500.0, 854, true, "Electric", 15000, 2024);
        Car car3 = new Car("35 EGE 35", "C003", "Fiat", "Egea", 900.0, 520, false, "Diesel", 60000, 2021);

        // Motorcycle(plate, id, brand, model, dailyRent, engineSize, isAvailable,
        // fuelType, mileage, productionYear)
        Motorcycle moto1 = new Motorcycle("34 MTR 11", "M001", "Honda", "Forza 250", 600.0, 249, true, "Gasoline", 5000,
                2023);
        Motorcycle moto2 = new Motorcycle("07 KNG 07", "M002", "Kawasaki", "Ninja H2", 3000.0, 998, true, "Gasoline",
                2000, 2024);
        Motorcycle moto3 = new Motorcycle("16 SC 123", "M003", "Vespa", "Primavera", 800.0, 150, true, "Gasoline", 3000,
                2022);

        Customer customer1 = new Customer("Kubra Temur", 21, "17234858920");
        Customer customer2 = new Customer("Emir Temur", 4, "17234853783");

        ArrayList<Vehicle> galery = new ArrayList<>();

        galery.add(car1);
        galery.add(car2);
        galery.add(car3);
        galery.add(moto1);
        galery.add(moto2);
        galery.add(moto3);

        System.out.println("------VEHICLE LIST AND RENT CALCULATION------");

        for (Vehicle v : galery) {
            v.displayInfo();
            System.out.println("Rent for 3 days: " + v.calculateRent(3));
            System.out.println();
        }

        System.out.println("------RENTAL OPERATIONS------");
        customer1.rentVehicle(car3, 5);
        customer2.rentVehicle(moto1, 3);
        customer1.rentVehicle(car2, 7);
        customer1.rentVehicle(car1, 3);

        System.out.println();
        customer1.calculateTotalRent();

        System.out.println();
        customer1.returnVehicle(car1);

        System.out.println();
        customer1.displayRentedVehicles();
    }
}

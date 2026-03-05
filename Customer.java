
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kübra
 */
public class Customer {
    private String name;
    private int age;
    private String customerId;
    HashMap<Vehicle, Integer> rentedVehicles = new HashMap<>();

    public Customer(String name, int age, String customerId) {
        this.name = name;
        this.age = age;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void rentVehicle(Vehicle v, int days) {
        if (age > 18 && v.getIsAvailable()) {
            rentedVehicles.put(v, days);
            v.setIsAvailable(false);
            System.out.println(v.getBrand() + " " + "rented successfully");
        } else {
            if (age <= 18) {
                System.out.println("Renting is unsuccessfull age is invalid");
            }
            if (v.getIsAvailable() == false) {
                System.out.println("Renting is unsuccessfull vehicle is not available");
            }

        }
    }

    public void returnVehicle(Vehicle v) {
        v.setIsAvailable(true);
        rentedVehicles.remove(v);
        System.out.println(v.getBrand() + " " + "is returned successfully");
    }

    public void calculateTotalRent() {
        double totalRent = 0;
        for (Vehicle v : rentedVehicles.keySet()) {
            totalRent += v.calculateRent(rentedVehicles.get(v));

        }
        System.out.println("Total rent is: " + totalRent);
    }

    public void displayRentedVehicles() {
        for (Vehicle v : rentedVehicles.keySet()) {
            v.displayInfo();
            System.out.println("\n");
        }
    }
}

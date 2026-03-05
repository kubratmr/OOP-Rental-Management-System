/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kübra
 */
public class Car extends Vehicle {
    private int trunkCapacity;

    public Car(String plate, String id, String brand, String model, double dailyRent, int trunkCapacity,
            boolean isAvailable, String fuelType, int mileage, int productionYear) {
        super(plate, id, brand, model, dailyRent, mileage, isAvailable, fuelType, productionYear);
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Trunk Capacity: " + trunkCapacity);
    }

    @Override
    public double calculateRent(int days) {
        double price = days * getDailyRent();
        if (trunkCapacity > 500) {
            price += 50 * days;

        }
        return price;
    }

}

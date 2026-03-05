/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kübra
 */
public class Motorcycle extends Vehicle {
    private int engineSize;

    public Motorcycle(String plate, String id, String brand, String model, double dailyRent, int engineSize,
            boolean isAvailable, String fuelType, int mileage, int productionYear) {
        super(plate, id, brand, model, dailyRent, mileage, isAvailable, fuelType, productionYear);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Size: " + engineSize);
    }

    @Override
    public double calculateRent(int days) {
        double basePrice = days * getDailyRent();
        if (engineSize > 200) {
            basePrice += 200;

        }
        return basePrice;
    }
}

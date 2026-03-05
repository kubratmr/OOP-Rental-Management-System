/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kübra
 */
public abstract class Vehicle {
    
    private String plate;
    private String id;
    private String brand;
    private String model;
    private double dailyRent;
    private int mileage;
    private boolean isAvailable;
    private String fuelType;
    private int productionYear;

   
    public Vehicle(String plate, String id, String brand, String model, double dailyRent, 
                   int mileage, boolean isAvailable, String fuelType, int productionYear) {
        this.plate = plate;
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.dailyRent = dailyRent;
        this.mileage = mileage;
        this.isAvailable = isAvailable;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(double dailyRent) {
        this.dailyRent = dailyRent;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage>this.mileage) {
            this.mileage=mileage;
            
        }
        else{
            System.out.println("Mileage can't be lower or equal to its current value!");
        }
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
  
    public abstract double calculateRent(int days);

    
    public void displayInfo() {
        System.out.println("VEHICLE INFORMATIONS:");
        System.out.println("Brand:" + brand);
        System.out.println("Daily Rent:" + dailyRent);
        System.out.println("Fuel Type:" + fuelType);
        System.out.println("ID:" + id);
        System.out.println("Is vehicle available?" + isAvailable);
        System.out.println("Mileage:" + mileage);
        System.out.println("Model:" + model);
        System.out.println("Plate:" + plate);
        System.out.println("Production Year:" + productionYear);
    }
}

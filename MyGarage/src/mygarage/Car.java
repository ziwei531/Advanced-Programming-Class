package mygarage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ziwei
 */
public class Car {

    private String carName;
    private double carPrice;

    Car(String carName, double carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;

    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public double afterInsurance(double carPrice) {
        return carPrice *= 1.05;
    }

    public void displayDetails() {
        System.out.println("Car: " + getCarName());
        System.out.println("Car's Price: " + getCarPrice());
        System.out.println("Car Insurance's Percentage: 5%");
        System.out.println("Car's Price after Insurance: " + afterInsurance(getCarPrice()));

    }

}

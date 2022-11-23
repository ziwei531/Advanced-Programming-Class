/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mygarage;

/**
 *
 * @author ziwei
 */
public class SportsCar extends Car {

    private int speed;

    public SportsCar(String carName, int carPrice, int speed) {
        super(carName, carPrice);
        this.speed = speed;
    }

    //polymorphism in action. this is so that speed can be an optional input
    //AKA overloading
    //if parameters are exactly the same as the last one, it will result in an error
    public SportsCar(String carName, int carPrice) {
        super(carName, carPrice);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public double afterInsurance(double carPrice) {
        return carPrice *= 1.06;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Car: " + getCarName());
        System.out.println("Car's Price: " + getCarPrice());
        System.out.println("Car Insurance's Percentage: 6%");
        System.out.p rintln("Car's Price after Insurance: " + afterInsurance(getCarPrice()));
        if (getSpeed() <= 0) {
            System.out.println("Car's Speed: Unknown\n");
        } else {
            System.out.println("Car's Speed: " + getSpeed() + "km/h" + "\n");
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mygarage;

/**
 *
 * @author ziwei
 */
public class FamilyCar extends Car {

    private int year;

    public FamilyCar(String carName, double carPrice, int year) {
        super(carName, carPrice);
        this.year = year; 
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //override
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Year: " + getYear() + "\n");
    }
}

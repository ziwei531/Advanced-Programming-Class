/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfatherbank;

/**
 *
 * @author ziwei
 */
public class Savings extends Accounts {

    private double yearlyRate;

    Savings(String acc, double b, double y) {
        super(acc, b);
        yearlyRate = y;
    }

    Savings(String acc, double b) {
        super(acc, b);
        yearlyRate = -1;
    }

    public double getYearlyRate() {
        return yearlyRate;
    }

    public void setYearlyRate(double yearlyRate) {
        this.yearlyRate = yearlyRate;
    }
    
    public void rollYear() {
        super.setInitBal(super.getInitBal() + (super.getInitBal() * yearlyRate));
    }

    public void displayDetails() {
        System.out.println("===== Savings =====");
        super.displayDetails();
        if (yearlyRate >= 0) {
            System.out.println("Yearly Rate: " + getYearlyRate());
                
        } else {
            System.out.println("Yearly Rate: Awaiting Decision");
        }
    }
}

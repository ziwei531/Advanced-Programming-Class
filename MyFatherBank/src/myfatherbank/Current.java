/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfatherbank;

/**
 *
 * @author ziwei
 */
public class Current extends Accounts {

    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    Current(String acc, double b, double o) {
        super(acc, b);
        overdraft = o;
    }

    public void withdraw(double amt) {
        double balance = super.getInitBal();
        if ((balance + overdraft) < amt) {
            System.out.println("Insufficient Balance. AccNo: " + super.getAccNo());
            
        } else {
            balance -= amt;
        }
        super.setInitBal(balance);
    }

    public void displayDetails() {
        System.out.println("===== Current =====");
        super.displayDetails();
        System.out.println("Overdraft : RM" + getOverdraft());
    }
}

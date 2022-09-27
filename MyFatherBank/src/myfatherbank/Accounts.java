/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfatherbank;

/**
 *
 * @author ziwei
 */
public class Accounts {

    private String accNo;
    private double initBal;

    Accounts(String acc, double b) {
        accNo = acc;
        initBal = b;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getInitBal() {
        return initBal;
    }

    public void setInitBal(double initBal) {
        this.initBal = initBal;
    }

    public void deposit(double amt) {
        initBal += amt;
    }

    public void withdraw(double amt) {
        if (initBal < amt) {
            System.out.println("Insufficient Balance. AccNo: " + accNo);
        } else {
            initBal -= amt;
        }
    }

    public void displayDetails() {
        System.out.println("Account No: " + getAccNo());
        System.out.println("Balance: RM" + getInitBal());
    }
}

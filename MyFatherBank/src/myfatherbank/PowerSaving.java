/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfatherbank;

/**
 *
 * @author ziwei
 */
public class PowerSaving extends Accounts {

    private double yearlyRate;
    private double EOTL;

    PowerSaving(String a, double b, double y, double e) {
        super(a, b);
        yearlyRate = y;
        EOTL = e;
    }

    public double getYearlyRate() {
        return yearlyRate;
    }

    public void setYearlyRate(double yearlyRate) {
        this.yearlyRate = yearlyRate;
    }

    public double getEOTL() {
        return EOTL;
    }

    public void setEOTL(double EOTL) {
        this.EOTL = EOTL;
    }

    public void withdraw(double amt) {
        if ((super.getInitBal() + EOTL) < amt) {
            System.out.println("Insufficient Balance. AccNo: " + super.getAccNo());
        } else {
            super.setInitBal(super.getInitBal() - amt);
        }
    }

    public void displayDetails() {
        System.out.println();
        super.displayDetails();

        if (yearlyRate >= 0) {
            System.out.println("Yearly Rate: " + getYearlyRate());

        } else {
            System.out.println("Yearly Rate: Awaiting Decision");
        }
        System.out.println("EOTL: RM" + getEOTL());
    }
}

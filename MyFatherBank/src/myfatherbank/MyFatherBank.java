/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfatherbank;

/**
 *
 * @author ziwei
 */
public class MyFatherBank {

    public static void main(String[] args) {
        Savings s1 = new Savings("010001", 2000.00, 0.06);
        Savings s2 = new Savings("010002", 2000.00, 0.03);
        Savings s3 = new Savings("010003", 1000.00);

        Current c1 = new Current("020001", 4000.00, 5000.00);
        Current c2 = new Current("020002", 10000.00, 8000.00);
        PowerSaving p1 = new PowerSaving("030001", 2200.00, 0.05, 3000.00);
        PowerSaving p2 = new PowerSaving("030002", 1900.00, 0.04, 2000.00);

//        s1.displayDetails();
//        s2.displayDetails();
//        s3.displayDetails();
//        c1.displayDetails();
//        c2.displayDetails();
//
//        s1.deposit(200);
//        s1.displayDetails();
//
//        s1.withdraw(4000);
//        c1.withdraw(200);
//        s2.withdraw(12000);
//        c1.withdraw(12000);
//        c2.withdraw(12000);
//
//        s1.displayDetails();
//        s2.displayDetails();
//        s3.displayDetails();
//        c1.displayDetails();
//        c2.displayDetails();
//        s1.rollYear();
//        s2.rollYear();
//        s3.rollYear();
//
//        s1.displayDetails();
//        s2.displayDetails();
//        s3.displayDetails();
//        p1.displayDetails();
//        p2.displayDetails();

        p2.deposit(100);
        p1.withdraw(5000);
        p2.withdraw(5000);

        p1.displayDetails();
        p2.displayDetails();

    }

}

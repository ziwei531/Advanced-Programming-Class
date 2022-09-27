/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompanythree;

/**
 *
 * @author ziwei
 */
public class Officer extends EmployeeThree {

    private double petrol;

    public Officer(String n, double s, int a, double p) {
        super(n, s, a);
        petrol = p;
    }

    public double getPetrol() {
        return petrol;
    }

    public void displayDetail() {
        super.displayDetail();
        System.out.println("PETROL : " + petrol);
    }

}

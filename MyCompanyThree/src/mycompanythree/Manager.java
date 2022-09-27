/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompanythree;

/**
 *
 * @author ziwei
 */
public class Manager extends EmployeeThree {

    private String car;

    public Manager(String n, double s, int a, String c) {
        super(n, s, a);
        car = c;
    }

    public String getCar() {
        return car;
    }

    public void displayDetail() {
        super.displayDetail();
        System.out.println("CAR : " + car);
    }
}

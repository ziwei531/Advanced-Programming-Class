/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompanythree;

/**
 *
 * @author ziwei
 */
public class EmployeeThree {

    private String name;
    private double salary;
    private boolean status;
    private int yearBorn;

    EmployeeThree(String n, double s, int a) {
        name = n;
        salary = s;
        status = true;
        yearBorn = a;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        if (s < 25000) {
            salary = s;
        }
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int a) {
        yearBorn = a; 
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status ? "active" : "resigned";
    }

    public void resigned() {
        status = false;
    }

    public void displayDetail() {
        System.out.println("==========================");
        System.out.println("NAME : " + name);
        System.out.println("SALARY : RM" + salary);
        System.out.println("STATUS : " + getStatus());
        System.out.println("YEAR BORN: " + getYearBorn() + "\nAGE: " + (2014 - getYearBorn()));
    }
}

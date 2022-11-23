/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author ziwei
 */
public class Employee {

    private String name;
    private double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetail() {
        System.out.println("==========================");
        System.out.println("NAME : " + name);
        System.out.println("SALARY : " + salary);
    }
}

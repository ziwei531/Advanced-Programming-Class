/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author ziwei
 */
public class Manager extends Employee {

    private String car;

    public Manager(String n, double s, String c) {
        super(n, s);
        car = c;
    }

    public Manager(Employee e, String c) {
        super(e.getName(), e.getSalary());
        car = c;
    }

    public void displayDetail() {
        super.displayDetail();
        System.out.println("CAR : " + car);
    }
}

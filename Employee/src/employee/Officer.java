/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author ziwei
 */
public class Officer extends Employee {

    private double petrol;

    public Officer(String n, double s, double p) {
        super(n, s);
        petrol = p;
    }
    
    public Officer(Employee e, double d) {
        super(e.getName(), e.getSalary() - d);
    }

    public void displayDetail() {
        super.displayDetail();
        System.out.println("PETROL : " + petrol);
    }
}

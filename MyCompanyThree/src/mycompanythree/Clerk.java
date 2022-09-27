/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompanythree;

/**
 *
 * @author ziwei
 */
public class Clerk extends EmployeeThree {
    
    private double COLA; 
    public Clerk(String n, double s, int a, double c) {
        super(n, s, a);
        COLA = c;
    }

    public double getCOLA() {
        return COLA;
    }
    
    public void setCOLA(double c) {
        COLA = c;
    }
    
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Cost of Allowance : RM" + getCOLA());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author ziwei
 */
public class MyCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee staff1 = new Officer("Joyah", 3000, 300);
        Employee staff2 = new Manager("Minah", 8000, "Honda Accord");
        staff2 = new Officer(staff2, 1000); 
        staff1.displayDetail();
        staff2.displayDetail();
    }

}

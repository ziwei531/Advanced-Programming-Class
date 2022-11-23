/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mygarage;

/**
 *
 * @author ziwei
 */
public class MyGarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FamilyCar car1 = new FamilyCar("Honda Civic 1.8", 25000, 2018);
        FamilyCar car2 = new FamilyCar("Toyota Camry 2.0", 35000, 2019);

        SportsCar car3 = new SportsCar("Honda NSX", 75000, 305);
        SportsCar car4 = new SportsCar("Nissan GTR", 65000, 315);
        
        SportsCar car5 = new SportsCar("Tesla Roadster Coupe", 95000); 

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
        car4.displayDetails(); 
        car5.displayDetails(); 
    }

}

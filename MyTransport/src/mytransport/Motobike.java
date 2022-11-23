/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytransport;

/**
 *
 * @author ziwei
 */
public class Motobike extends Vehicle implements Engine, WheelSystem, Registration {

    public Motobike(String t, int s) {
        super(t, s);
    }

    public void startEngine() {
        System.out.println("Motobike engine starts - vroom...vroom...");
    }

    public void displayTotWheel() {
        System.out.println("Motobike has 2 wheels");
    }

    public void displayRegistration() {
        System.out.println("Motobike's Registration Number is 00002");
    }
}

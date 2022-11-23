/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytransport;

/**
 *
 * @author ziwei
 */
public class Aircraft extends Vehicle implements Engine, WheelSystem, FlightSystem, Registration {

    public Aircraft(String t, int s) {
        super(t, s);
    }

    public void startEngine() {
        System.out.println("Aircraft engine starts - viuuuuu.");
    }

    public void displayTotWheel() {
        System.out.println("Aircraft has 3 wheels");
    }

    public void displayMaxAltitude() {
        System.out.println("Aircraft altitude is 15000m");
    }
    
    public void displayRegistration() {
        System.out.println("Aircraft's Registration Number is 00001");
    }
}

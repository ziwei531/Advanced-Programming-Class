/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytransport;

/**
 *
 * @author ziwei
 */
public class Glider extends Vehicle implements FlightSystem, WheelSystem {

    public Glider(String t, int s) {
        super(t, s);
    }

    public void displayMaxAltitude() {
        System.out.println("Glider altitude is 3000m");
    }

    public void displayTotWheel() {
        System.out.println("Glider has 3 wheels");
    }
}

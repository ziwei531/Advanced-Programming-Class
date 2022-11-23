/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytransport;

/**
 *
 * @author ziwei
 */
public class Bicycle extends Vehicle implements WheelSystem {

    public Bicycle(String t, int s) {
        super(t, s);
    }

    public void displayTotWheel() {
        System.out.println("Bicycle has 2 wheels");
    }
}

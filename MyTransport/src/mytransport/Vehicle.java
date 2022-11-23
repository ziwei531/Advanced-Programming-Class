/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytransport;

/**
 *
 * @author ziwei
 */
public class Vehicle {

    private String type;
    private int speed;

    public Vehicle(String t, int s) {
        type = t;
        speed = s;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }
}

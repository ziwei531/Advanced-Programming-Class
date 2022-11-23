/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytransport;

/**
 *
 * @author ziwei
 */
public class JetSki extends Vehicle implements Engine {

    public JetSki(String t, int s) {
        super(t, s);
    }

    public void startEngine() {
        System.out.println("JetSki engine starts - vroosh...vroosh...");
    }
}

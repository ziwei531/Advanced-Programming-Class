/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycountdownr;

/**
 *
 * @author ziwei
 */
public class MyCountdownR {

    public static void main(String args[]) {
        CountdownR cd1 = new CountdownR(1, 2);
        CountdownR cd2 = new CountdownR(2, 1);
        cd1.start();
        cd2.start();
        
        cd1.join();
        cd2.join();

        System.out.println("END");
    }
}

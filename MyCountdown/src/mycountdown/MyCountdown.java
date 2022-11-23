/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycountdown;

/**
 *
 * @author ziwei
 */
public class MyCountdown {

    public static void main(String args[]) {
        Countdown cd1 = new Countdown(1, 2); //second parameter is delay. delays 2 second.
        Countdown cd2 = new Countdown(2, 1); //delays 1 second
        cd1.start();
        cd2.start();
        try {
            cd1.join();
            cd2.join();
        } catch (Exception e) {

        }

        System.out.println("END");
    }
}

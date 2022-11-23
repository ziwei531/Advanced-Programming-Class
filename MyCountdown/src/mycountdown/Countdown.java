package mycountdown;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziwei
 */
public class Countdown extends Thread {

    int idx, sec;

    public Countdown(int i, int s) {
        idx = i;
        sec = s;
    }

    public void run() {
        for (int k = 5; k >= 0; k--) {
            System.out.println("Index " + idx + " Countdown " + k);
            try {
                Thread.sleep(sec * 1000); //1000ms = 1second
            } catch (InterruptedException e) {
            }
        }
    }
}

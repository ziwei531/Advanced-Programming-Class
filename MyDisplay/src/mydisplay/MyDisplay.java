/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mydisplay;

/**
 *
 * @author ziwei
 */
import javax.swing.*;

public class MyDisplay extends Thread {

    private JLabel lab;
    private int speed, track;

    public MyDisplay(JLabel lx, int s, int t) {
        lab = lx;
        speed = s;
        track = t;
    }

    public void run() {
        int x = 25;
        int d = 5;

        do {
            try {
                x = x + d;
                if (x >= 300) {
                    d = -5;
                }
                Thread.sleep(speed * 100);
                lab.setBounds(x, track, 25, 25);
            } catch (InterruptedException e) {
            }
        } while (x >= 25);

    }
}

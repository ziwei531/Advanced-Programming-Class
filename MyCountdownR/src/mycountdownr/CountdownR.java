/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycountdownr;

/**
 *
 * @author ziwei
 */
public class CountdownR implements Runnable {

    int idx, sec;
    Thread myt;

    public CountdownR(int i, int s) {
        idx = i;
        sec = s;
        myt = new Thread(this);
    }

    public void start() {
        myt.start();
    }

    public void join() {
        try {
            myt.join();
        } catch (Exception e) {

        }
    }

    public void run() {
        for (int k = 5; k >= 0; k--) {
            System.out.println("IndexR " + idx + " Countdown " + k);
            try {
                Thread.sleep(sec * 1000);
            } catch (InterruptedException e) {
            }
        }
    }

}

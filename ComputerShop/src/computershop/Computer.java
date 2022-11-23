/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computershop;

/**
 *
 * @author ziwei
 */
public class Computer {

    private String model;
    private static final int QTY = 0;

    public Computer(String m) {
        model = m;
        qty++;
    }

    public static int getQty() {
        return qty;
    }

    public void showDetail() {
        System.out.println("\n");
        System.out.println("MODEL :" + model);
    }
}

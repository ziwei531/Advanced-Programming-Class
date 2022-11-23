/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computershop;

/**
 *
 * @author ziwei
 */
public class ComputerShop {

    /**
     * @param args the command line arguments
     */
    Notebook nb1, nb2;

    public void runProgram() {
        nb1 = new Notebook("Dell 3300", 2.2);
        nb2 = new Notebook("Acer 1810", 1.5);
        nb1.showDetail();
        nb2.showDetail();
        System.out.println("QTY1 : " + nb1.getQty());
        System.out.println("QTY2 : " + Computer.getQty());
        nb1.showComputerType();
    }

    public static void main(String[] args) {

        ComputerShop css = new ComputerShop();
        css.runProgram();

    }

}

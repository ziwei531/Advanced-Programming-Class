/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mytransport;

/**
 *
 * @author ziwei
 */
public class MyTransport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JetSki js = new JetSki("water", 40);
        Bicycle b = new Bicycle("land", 20);
        Motobike mb = new Motobike("land", 200);
        Aircraft a = new Aircraft("air", 1000);
        js.startEngine();
        b.displayTotWheel();
        mb.startEngine();
        mb.displayTotWheel();
        a.startEngine();
        a.displayTotWheel();
        a.displayMaxAltitude();
    }

}

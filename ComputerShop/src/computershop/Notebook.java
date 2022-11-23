package computershop;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ziwei
 */
public class Notebook extends Computer {

    private double weight;
    private double price;

    public Notebook(String m, double w) {
        super(m);
        weight = w;
    }

    public void showComputerType() {
        System.out.println("This is a notebook");
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("WEIGHT :" + weight);
        System.out.println("PRICE :" + price);
    }
}

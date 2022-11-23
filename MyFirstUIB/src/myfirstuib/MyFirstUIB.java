/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstuib;

/**
 *
 * @author ziwei
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class MyFirstUIB implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JFrame f;
    JPanel p;
    JButton btnExit;
    JButton btnOut;

    public MyFirstUIB() {
        f = new JFrame();
        p = new JPanel();
    }

    public void init() {
        f.setTitle("My First GUI");
        f.setSize(800, 300);
        p.setLayout(null);
        JLabel labName = new JLabel("Minah oh Minah");
//        labName.setFont(new Font("Serif", Font.PLAIN, 18));

        labName.setBounds(350, 50, 100, 50); //(int x-coordinate, int y-coordinate, int width, int height)
        p.add(labName);
//        labName.setFont(new Font("Serif", Font.PLAIN, 14));
        btnOut = new JButton("OUT");
        btnOut.setBounds(350, 20, 150, 35);
        btnOut.addActionListener(this);
        btnExit = new JButton("EXIT");
        btnExit.setBounds(20, 200, 750, 40);
        btnExit.addActionListener(this);
        p.add(btnExit);
        p.add(btnOut);
        f.add(p);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnExit || e.getSource() == btnOut) {
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFirstUIB mfui = new MyFirstUIB();
        mfui.init();
    }
}

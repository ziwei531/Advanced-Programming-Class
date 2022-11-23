/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstui;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

/**
 *
 * @author ziwei
 */
public class MyFirstUI implements ActionListener {

    JFrame f;
    JPanel p;
    JButton btnExit;

    public MyFirstUI() {
        f = new JFrame();
        p = new JPanel();
    }

    public void init() {
        f.setTitle("My First GUI");
        f.setSize(400, 300);
        p.setLayout(null);
        JLabel labName = new JLabel("Minah oh Minah");
        labName.setBounds(100, 50, 100, 50); //(int x-coordinate, int y-coordinate, int width, int height)
        p.add(labName);
        btnExit = new JButton("EXIT");
        btnExit.setBounds(20, 200, 350, 40);
        btnExit.addActionListener(this);
        p.add(btnExit);
        f.add(p);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFirstUI mfui = new MyFirstUI();
        mfui.init();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mydisplay;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ziwei
 */
public class MyGraphicThread implements ActionListener {

    JFrame f;
    JPanel mainP, subP;
    JLabel labX, labY, labZ, labB;
    JButton btnStart, btnExit;
    MyDisplay mdx, mdy, mdz, mdb;

    public MyGraphicThread() {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainP = new JPanel();
        subP = new JPanel();
    }

    public void init() {
        f.setTitle("My Graphic Thread");
        f.setSize(400, 300);
        mainP.setLayout(null);
        subP.setLayout(null);
        
        labX = new JLabel("X");
        labX.setBounds(25, 25, 25, 25);
        subP.add(labX);
        
        labY = new JLabel("Y");
        labY.setBounds(25, 50, 25, 25);
        subP.add(labY);
        
        labZ = new JLabel("Z");
        labZ.setBounds(25, 75, 25, 25);
        subP.add(labZ);
        subP.setBounds(25, 25, 350, 100);

        labB = new JLabel("B");
        labB.setBounds(25, 100, 25, 25);
        subP.add(labB);
        subP.setBounds(25, 25, 350, 125); //(x, y, width, height)

        subP.setBackground(Color.YELLOW);
        mainP.add(subP);
        btnStart = new JButton("START");
        btnStart.setBounds(200, 200, 90, 25);
        btnStart.addActionListener(this);
        mainP.add(btnStart);
        btnExit = new JButton("EXIT");
        btnExit.setBounds(300, 200, 90, 25);
        btnExit.addActionListener(this);
        mainP.add(btnExit);
        f.add(mainP);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnStart) {
            mdx = new MyDisplay(labX, 2, 25);
            mdy = new MyDisplay(labY, 3, 50);
            mdz = new MyDisplay(labZ, 1, 75);
            mdb = new MyDisplay(labB, 4, 100);
            
            mdx.start();
            mdy.start();
            mdz.start();
            mdb.start();
        }
        if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        MyGraphicThread mgt = new MyGraphicThread();
        mgt.init();
    }
}

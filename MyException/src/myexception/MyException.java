/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myexception;

import java.io.*;
import java.util.Scanner;

public class MyException {
    
    public void process() throws Exception {
        int a = 50;
        int b = 10;
        int c = 0;
        String d = "";
        Scanner f = new Scanner(new File("file.txt"));
        c = a/c;
        d = "Result is " + c;
        System.out.println(d);
//        try {
//            Scanner f =  new Scanner(new File("file.txt"));
//            c = a/c;
//            d = "Result is " + c;   
//            System.out.println(d);
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("File Not Found");
//        }
//        catch(ArithmeticException e) {
//            System.out.println("Don't divide by 0");
//        }
//        catch(Exception e) {
//            d = "GENERAL ERROR: " + e;
//            System.out.println(d);
//        }
//        finally {
//            System.out.println(d);
//        }
    }
    
    public static void main(String args[]) {
        String d = "";
        System.out.println("== START ==");
        MyException me = new MyException();
        try {
            me.process();
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        catch(ArithmeticException e) {
            System.out.println("Don't divide by 0");
        }
        catch(Exception e) {
            d = "GENERAL ERROR: " + e;
            System.out.println(d);
        }
        finally {
            System.out.println(d);
        }
        System.out.println("=== END ===");
    }
}

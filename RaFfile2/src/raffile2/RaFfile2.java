/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raffile2;

import java.io.*;
import java.util.*;

public class RaFfile2 {

    private static final int REC_SIZE = 36;
    private static final int NAME_SIZE = 10;
    private static int stuPos = 0;
    private static String stuName;
    private static int stuAge;
    private static double stuHeight;

    public static void main(String[] args) throws IOException {
        RandomAccessFile rafFile = new RandomAccessFile("student2.dat", "rw");
        String reply = "N";
        Scanner input = new Scanner(System.in);
        long numOfRecords = rafFile.length() / REC_SIZE;
        displayRecords(rafFile);
        do {
            stuPos++;
            System.out.print("Enter Student Position >> ");
            stuPos = input.nextInt();
            input.nextLine();
            while (stuPos < 1 || stuPos > numOfRecords) {
                System.out.println("Invalid student position, enter again!");
                System.out.println("Position must be up to " + numOfRecords);
                stuPos = input.nextInt();
                input.nextLine();
            }
            displayRecordPos(rafFile);
            System.out.print("Enter new Age >> ");
            stuAge = input.nextInt();

            System.out.print("Enter new Height >>");
            stuHeight = input.nextDouble();
            input.nextLine();

            input.nextLine();
            long filePosition = rafFile.getFilePointer();
            rafFile.seek(filePosition - 12);
            rafFile.writeInt(stuAge);
            rafFile.writeDouble(stuHeight);
            displayRecordPos(rafFile);
            System.out.print("Edit Age and Height Again (Y/N) ? ");
            reply = (input.nextLine()).toUpperCase();
        } while (reply.equals("Y"));
        displayRecords(rafFile);
        rafFile.close();
    }

    public static void saveRecord(RandomAccessFile file) throws IOException {
        int filePosition = (stuPos - 1) * REC_SIZE;
        file.seek(filePosition);
        file.writeInt(stuPos);
        writeString(file, stuName, NAME_SIZE);
        file.writeInt(stuAge);
        file.writeDouble(stuHeight);
    }

    public static void writeString(RandomAccessFile file, String text, int fixedSize) throws IOException {
        int size = text.length();
        if (size <= fixedSize) {
            file.writeChars(text);
            for (int i = size; i < fixedSize; i++) {
                file.writeChar(' ');
            }
        } else {
            file.writeChars(text.substring(0, fixedSize));
        }
    }

    public static void displayRecords(RandomAccessFile file) throws IOException {
        long numRecords = file.length() / REC_SIZE;
        file.seek(0);
        for (int i = 0; i < numRecords; i++) {
            stuPos = file.readInt();
            stuName = readString(file, NAME_SIZE);
            stuAge = file.readInt();
            stuHeight = file.readDouble();
            System.out.println("POS : " + stuPos + " NAME : " + stuName + " AGE : " + stuAge + " Height : " + stuHeight);
        }
    }

    public static String readString(RandomAccessFile file, int fixedSize) throws IOException {
        String value = "";
        for (int i = 0; i < fixedSize; i++) {
            value += file.readChar();
        }
        return value;
    }

    public static void displayRecordPos(RandomAccessFile file) throws IOException {
        file.seek((stuPos - 1) * REC_SIZE);
        stuPos = file.readInt();
        stuName = readString(file, NAME_SIZE);
        stuAge = file.readInt();
        stuHeight = file.readDouble();
        System.out.println("NAME : " + stuName + " AGE : " + stuAge + " Height : " + stuHeight);
    }

}

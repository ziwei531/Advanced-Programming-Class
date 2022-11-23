/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package com.mycompany.mywriteread;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.*;
import java.util.Scanner;
import java.time.LocalDate;

public class MyWriteRead extends Application {
   
    private Label labResult;
    private TextField txtName, txtAge, txtCountry;
    private Button btnAdd, btnRead;
    private Pane p1;
    private Scene mainScene;
    private File myf = new File("./data", "student.txt");

   
    public void start(Stage mainStage) {
        mainStage.setTitle("My WriteRead");
      
        Label labName = new Label("Enter Name ");
        labName.setLayoutX(50);
        labName.setLayoutY(25);
        txtName = new TextField();
        txtName.setLayoutX(200);
        txtName.setLayoutY(25);

        Label labAge = new Label("Enter Age ");
        labAge.setLayoutX(50);
        labAge.setLayoutY(50);
        txtAge = new TextField();
        txtAge.setLayoutX(200);
        txtAge.setLayoutY(50);
        
        Label labCountry = new Label("Enter Country ");
        labCountry.setLayoutX(50);
        labCountry.setLayoutY(75);
        txtCountry = new TextField();
        txtCountry.setLayoutX(200);
        txtCountry.setLayoutY(75);
      
        btnAdd = new Button("Save");
        btnAdd.setLayoutX(50);
        btnAdd.setLayoutY(100);
        
        btnRead = new Button("Read");
        btnRead.setLayoutX(125);
        btnRead.setLayoutY(100);
      
        Label labResultLabel = new Label("R E S U L T ");
        labResultLabel.setLayoutX(50);
        labResultLabel.setLayoutY(150);
        labResult = new Label();
        labResult.setLayoutX(150);
        labResult.setLayoutY(150);     

        btnAdd.setOnAction(e -> {
            saveToFile();
            labResult.setText("Saving data " + txtName.getText());
        });
        
        btnRead.setOnAction(e -> {
            readFromFile();
        });
      
      
        p1 = new Pane();
        p1.getChildren().add(labName);
        p1.getChildren().add(txtName);
        p1.getChildren().add(labAge);
        p1.getChildren().add(txtAge);
        p1.getChildren().add(labCountry);
        p1.getChildren().add(txtCountry);
        p1.getChildren().add(btnAdd);
        p1.getChildren().add(btnRead);
        p1.getChildren().add(labResultLabel);
        p1.getChildren().add(labResult);
        mainScene = new Scene(p1, 500, 250);
        mainStage.setScene(mainScene);
        mainStage.show();
    }
    
    public void saveToFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(myf, true));
            pw.println();
            pw.print(txtName.getText() + ",");
            pw.print(txtAge.getText() + ",");
            pw.print(txtCountry.getText());
            pw.close();
        }
        catch(IOException e) {
        }
    }
    
    public int getBirthYear(int a) {
        int curYear = LocalDate.now().getYear();
        return curYear - a;
    }
    
    public void readFromFile() {
        Scanner sfile;
        String name;
        String country;
        int birthYear;
        int age;
        try{
            sfile = new Scanner(myf);
            String allData = "";
            while (sfile.hasNextLine()) {
                String aLine = sfile.nextLine();
                Scanner sline = new Scanner(aLine);
                sline.useDelimiter(",");
                while (sline.hasNext()) {
                    name = sline.next();
                    age = Integer.parseInt(sline.next());
                    birthYear = getBirthYear(age);
                    country = sline.next();
                    labResult.setText(labResult.getText() + "\n"
                    + "Name: " + name + " Birth Year: " + birthYear + " Country: " + country);
//                    allData = allData + "\n"
//                    + "Name: " + name + " Birth Year: " + birthYear + " Country: " + country;
                }
                sline.close();
            }
            sfile.close();
            System.out.println(allData);
        }
        catch(FileNotFoundException e) {
            labResult.setText("File to read " + myf + " not found!");
        } 
    }

   
    public static void main(String args[]) {
        Application.launch(args);
    }
}

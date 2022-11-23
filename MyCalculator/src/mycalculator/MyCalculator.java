/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MyCalculator extends Application {

    public void start(Stage mainStage) {

        Label labNum1 = new Label("Enter First Number ");
        labNum1.setLayoutX(50);
        labNum1.setLayoutY(25);
        
        TextField txtNum1 = new TextField();
        txtNum1.setLayoutX(200);
        txtNum1.setLayoutY(25);

        Label labNum2 = new Label("Enter Second Number ");
        labNum2.setLayoutX(50);
        labNum2.setLayoutY(57);
        TextField txtNum2 = new TextField();
        txtNum2.setLayoutX(200);
        txtNum2.setLayoutY(55);

        Label labResult = new Label();
        labResult.setLayoutX(130);
        labResult.setLayoutY(250);

        Button btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            int add = n1 + n2;
            labResult.setText("Result: " + Integer.toString(add));
        });

        btnAdd.setLayoutX(55);
        btnAdd.setLayoutY(200);

        Button btnMultiply = new Button();
        btnMultiply.setText("Multiply");
        btnMultiply.setOnAction(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            int multiply = n1 * n2;
            labResult.setText("Result: " + Integer.toString(multiply));
        });

        btnMultiply.setLayoutX(110);
        btnMultiply.setLayoutY(200);

        Button btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            int s = n1 - n2;
            labResult.setText("Result: " + Integer.toString(s));
        });

        btnSubtract.setLayoutX(190);
        btnSubtract.setLayoutY(200);

        Pane p1 = new Pane();
        p1.getChildren().add(labResult);
        p1.getChildren().add(labNum1);
        p1.getChildren().add(txtNum1);
        p1.getChildren().add(btnAdd);
        p1.getChildren().add(txtNum2);
        p1.getChildren().add(labNum2);
        p1.getChildren().add(btnMultiply);
        p1.getChildren().add(btnSubtract);


        Scene myScene = new Scene(p1, 600, 400);
        mainStage.setTitle("My Calculator");
        mainStage.setScene(myScene);
        mainStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}

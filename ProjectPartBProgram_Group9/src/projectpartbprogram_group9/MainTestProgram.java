/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpartbprogram_group9;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.image.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class MainTestProgram extends Application {

    private File myf = new File("./data", "questions.txt");
    private int totQues = 0;
    private int activeQ = 1;
    private Label labQuesNo, labQues, labName;
    private ImageView imgQues;
    private Label labA, labB, labC;
    private RadioButton radChoice1, radChoice2, radChoice3;
    private ToggleGroup grpChoices;
    private Button btnPrev, btnNext, btnSubmit;
    private Pane mainPane;
    private Pane paneC;
    private Scene mainScene;

//    private MyGreeting winGreeting;
//    private MyFarewell winFarewell;
//    private LinkedList<Question> quesList = new LinkedList<Question>();
    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 650, 650);

        stage.setScene(scene);
        // stage.setFullScreen(true);

        stage.setTitle(
                "Citizenship Test");

        Label labelName = new Label();
        Label labelCountry = new Label();
        
        mainPane = new Pane();
        mainPane.getChildren().add(labelName); 
        mainPane.getChildren().add(labelCountry); 

        // add all the children
        
        stage.show();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }

}

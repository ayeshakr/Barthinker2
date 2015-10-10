/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barthinker2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Ayesha
 */
public class Barthinker2 extends Application {
    Stage window;
    Scene scene1, scene2; 
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        //Label 1
        Label label1 = new Label("Welcome to Barthinker! Click the button to start.");
        
        //Button 1
        Button button1 = new Button("Start quiz");
        button1.setOnAction(e -> window.setScene(scene2));
        
        //Layout 1
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);
        
        //Label 2
        Label label2 = new Label("Which drink has these ingredients?");
        
        //Radio Buttons 2
        RadioButton rb1 = new RadioButton();
        RadioButton rb2 = new RadioButton();
        RadioButton rb3 = new RadioButton();
        RadioButton rb4 = new RadioButton();
        
        //Layout 2
        VBox layout2 = new VBox(20);
        
        layout2.getChildren().addAll(label2, rb1, rb2, rb3, rb4);
        scene2 = new Scene(layout2, 600, 300);
 
        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}

package com.mycompany.week06_lab2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class App extends Application {
    Label label;
    TextField tf, tf2;
    @Override
    public void start(Stage stage) {
        
        tf = new TextField("Enter in the number");
        tf.setLayoutX(50); tf.setLayoutY(250);
        tf2 = new TextField("Enter in the number");
        tf2.setLayoutX(50); tf.setLayoutY(250);
        
        //method call
        Button btn= new Button("Button");
        btn.setLayoutX(250);
        btn.setLayoutY(50);
        btn.setOnAction(this::processBttn);
       
         label = new Label(" ");

        Group gp = new Group(label, btn, tf,tf2);
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("GUI Demo2");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void processBttn(ActionEvent arg0) {
        String cntnt = tf.getText().trim();
        int nm = Integer.parseInt(cntnt);
        tf.setText( "" + (nm));
        tf2.setText( "" + (nm));
        
        label.setText( "" + (nm + nm));
    }

}

package com.example.sihha19;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.*;
import java.util.*;

import static javafx.fxml.FXMLLoader.load;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
          //  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),800,600);
//            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

       // System.out.println("java version: "+System.getProperty("java.version"));
      //  System.out.println("javafx.version: " + System.getProperty("javafx.version"));
        launch();
    }
}
package com.example.sihha19;

import ConnectionDB.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Parent;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;

import static javafx.fxml.FXMLLoader.load;

public class DoctorController {


    @FXML
    private  Button button_login;
    @FXML
    private TextField tf_doctor_username;

    @FXML
    private PasswordField pf_doctor_password;


    private Stage stage;
    private Scene scene;

    private BreakIterator message;



    @FXML
    public void ButtonlogOnAction(ActionEvent event) {
        if(!tf_doctor_username.getText().isBlank() && !pf_doctor_password.getText().isBlank()){
            doc_login(event);
            //System.out.println("you try to login");
            //message.setText("you try to login");
        }
        else {
            System.out.println("enter your Username and Password");
        }

    }

    public void doc_login(ActionEvent event){
        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();
        String sql= "select count(1) from doctor where d_username='"+ tf_doctor_username.getText() +"'and d_password='"+ pf_doctor_password.getText() +"'";
        try{
            Statement stt = con.createStatement();
            ResultSet rst= stt.executeQuery(sql);

            while(rst.next()){
                if(rst.getInt(1)==1){
                    System.out.println("Welcome");
                    //   message.setText("welcome");
                    Parent root = load(getClass().getResource("Doctor_logged_in.fxml"));
                    stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();





                }else{
                    System.out.println("login failed");
                }
            }
        }catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchToScene1(ActionEvent event) throws IOException {
    //    Parent root = load(getClass().getResource("Scene1.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
    //    scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void View_appointments(ActionEvent event) throws IOException {
      //  Parent root = load(getClass().getResource("View_pat_app.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("View_pat_app.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void Doctor_logged_in(ActionEvent event) throws IOException {
       // Parent root = load(getClass().getResource("Doctor_logged_in.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Doctor_logged_in.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }






}

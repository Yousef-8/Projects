package com.example.sihha19;
import ConnectionDB.*;
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

import ConnectionDB.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

import java.io.*;
import java.sql.*;
import java.text.*;

import static javafx.fxml.FXMLLoader.load;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;

import static javafx.fxml.FXMLLoader.load;

import ConnectionDB.*;
import javafx.scene.*;
import javafx.event.ActionEvent;

import java.io.*;
import java.sql.*;


import ConnectionDB.*;
import javafx.scene.*;
import javafx.event.ActionEvent;

import java.io.*;
import java.sql.*;


import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.text.*;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.sql.Connection;


import java.sql.ResultSet;

import javafx.stage.*;


import static javafx.fxml.FXMLLoader.load;


import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.text.*;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.sql.Connection;


import java.sql.ResultSet;

import javafx.stage.*;


import static javafx.fxml.FXMLLoader.load;


public class AppointmentSchedulerController {






    @FXML
    private Button button_login;


    @FXML
    private PasswordField pf_app_sched_password;

    @FXML
    private TextField tf_app_sched_username;


    private BreakIterator message;

    private Stage stage;
    private Scene scene;


    @FXML
    void ButtonlogOnAction(ActionEvent event) {

        if(!tf_app_sched_username.getText().isBlank() && !pf_app_sched_password.getText().isBlank()){
           login(event);
            //System.out.println("you try to login");
            //message.setText("you try to login");
        }
        else {
            System.out.println("enter your Username and Password");
        }


    }


    public void  login(ActionEvent event){
        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();
        String sql= "select count(1) from appointment_scheduler where a_s_username='"+ tf_app_sched_username.getText() +"'and a_s_password='"+ pf_app_sched_password.getText() +"'";
        try{
            Statement stt = con.createStatement();
            ResultSet rst= stt.executeQuery(sql);

            while(rst.next()){
                if(rst.getInt(1)==1){
                    System.out.println("Welcome");
                    //   message.setText("welcome");
                    Parent root = load(getClass().getResource("Appointment_scheduler.fxml"));
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


    @FXML
    void doc_pat_app(ActionEvent event) throws IOException {
       // Parent root = load(getClass().getResource("Doctor_patient_app.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Doctor_patient_app.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void test_pat_app(ActionEvent event)  throws IOException{
      //  Parent root = load(getClass().getResource("Test_patient_app.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Test_patient_app.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void view_pat_doc_req(ActionEvent event)  throws IOException{
      //  Parent root = load(getClass().getResource("view_pat_doc_req.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view_pat_doc_req.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void view_pat_test_req(ActionEvent event)  throws IOException{
        Parent root = load(getClass().getResource("view_pat_test_req.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    public void switchToScene1(ActionEvent event) throws IOException {
        //Parent root = load(getClass().getResource("Scene1.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
     //   scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }












}

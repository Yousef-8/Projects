package com.example.sihha19;



import ConnectionDB.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;
import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;



import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableRow;


import static javafx.fxml.FXMLLoader.load;





import javafx.fxml.*;

import javax.print.*;

public class HelloController {

    @FXML
    private TextField tf_admin_username;

    @FXML
    private PasswordField pf_admin_password;


    private Stage stage;
    private Scene scene;

    private BreakIterator message;



    public void Admin_login(ActionEvent event) throws IOException {
       // Parent root = load(getClass().getResource("AdminLogin.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void ButtonlogOnAction(ActionEvent event) {
        if(tf_admin_username.getText().isBlank()==false && pf_admin_password.getText().isBlank()==false){
            login(event);
            //System.out.println("you try to login");
            //message.setText("you try to login");
        }
        else {
            System.out.println("enter your Username and Password");
        }

    }

    public void login(ActionEvent event){
        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();
        String sql= "select count(1) from admin where admin_username='"+ tf_admin_username.getText() +"'and admin_password='"+ pf_admin_password.getText() +"'";
        try{
            Statement stt = con.createStatement();
            ResultSet rst= stt.executeQuery(sql);

            while(rst.next()){
                if(rst.getInt(1)==1){
                    System.out.println("Welcome");
                 //   message.setText("welcome");
                 //   Parent root = load(getClass().getResource("Admin_logged_in.fxml"));
                    stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin_logged_in.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(),800,500);
                  //  scene = new Scene(root);
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
    void doctor_management(ActionEvent event) throws IOException {
        Parent root = load(getClass().getResource("Admin_manage_doctor.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void lab_management(ActionEvent event) {

    }

    @FXML
    void staff_management(ActionEvent event) throws IOException {

        Parent root = load(getClass().getResource("Admin_manage_staff.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }




    @FXML
    private Button button_add;

    @FXML
    private Button button_delete;

    @FXML
    private Button button_edit;


    @FXML
    private TableView<Doctor>table;

    @FXML
    private TableColumn<Doctor, String> col_age;

    @FXML
    private TableColumn<Doctor, String> col_department;

    @FXML
    private TableColumn<Doctor, String> col_email;

    @FXML
    private TableColumn<Doctor, String> col_fullname;

    @FXML
    private TableColumn<Doctor, String> col_gender;

    @FXML
    private TableColumn<Doctor, String> col_password;

    @FXML
    private TableColumn<Doctor, String> col_phone;

    @FXML
    private TableColumn<Doctor, String> col_qualification;

    @FXML
    private TableColumn<Doctor, String> col_username;

    @FXML
    private PasswordField pf_password;



    @FXML
    private TextField tf_age;

    @FXML
    private TextField tf_department;

    @FXML
    private TextField tf_email;

    @FXML
    private TextField tf_fullname;

    @FXML
    private TextField tf_gender;

    @FXML
    private TextField tf_phone;

    @FXML
    private TextField tf_qualification;

    @FXML
    private TextField tf_username;



















    public void switchToScene1(ActionEvent event) throws IOException {
       // Parent root = load(getClass().getResource("Scene1.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }





    public void Patient_page(ActionEvent event) throws IOException{
      //  Parent root = load(getClass().getResource("PatientPage.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }






    public void Patient_logged_in(ActionEvent event) throws IOException{
      //  Parent root = load(getClass().getResource("Patient_logged_in.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Patient_logged_in.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();





    }














    public void Appointmentscheduler_logged_in(ActionEvent event) throws IOException{
        Parent root = load(getClass().getResource("Appointment_scheduler.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Appointment_scheduler_login(ActionEvent event) throws IOException{
     //   Parent root = load(getClass().getResource("AppointSchedulerLogin.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AppointSchedulerLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
    //    scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Staffloginoptions(ActionEvent event) throws IOException{
      //  Parent root = FXMLLoader.load(getClass().getResource("Staff_login_options.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Staff_login_options.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Pharmacy_login(ActionEvent event) throws IOException{
        //Parent root = load(getClass().getResource("PharmacystaffLogin.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PharmacystaffLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Doctor_login(ActionEvent event) throws IOException{
       // Parent root = load(getClass().getResource("DoctorLogin.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DoctorLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pharmacy_staff_logged_in(ActionEvent event) throws IOException{
      //  Parent root = load(getClass().getResource("Pharmacy_staff.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Pharmacy_staff.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }










}
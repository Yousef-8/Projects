package com.example.sihha19;


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


public class PatientController {




        @FXML
        private Button button_login;
        @FXML
        private TextField tf_patient_username;

        @FXML
        private PasswordField pf_patient_password;



    @FXML
    private TextField tf_patient_signup_fullname;

    @FXML
    private TextField tf_patient_signup_age;

    @FXML
    private RadioButton tf_gender;

    @FXML
    private TextField tf_patient_signup_phone;

    @FXML
    private TextField tf_patient_signup_email;


    @FXML
    private TextField tf_patient_signup_username;

    @FXML
    private PasswordField pf_patient_signup_password;



        private Stage stage;
        private Scene scene;

        private BreakIterator message;



        @FXML
        public void ButtonlogOnAction(ActionEvent event) {
            if(!tf_patient_username.getText().isBlank() && !pf_patient_password.getText().isBlank()){
                pat_login(event);
                //System.out.println("you try to login");
                //message.setText("you try to login");
            }
            else {
                System.out.println("enter your Username and Password");
            }

        }

        public void pat_login(ActionEvent event){
            DatabaseConnection dBconnect= new DatabaseConnection();
            Connection con = dBconnect.getConnection();
            String sql= "select count(1) from patient where p_username='"+ tf_patient_username.getText() +"'and p_password='"+ pf_patient_password.getText() +"'";
            try{
                Statement stt = con.createStatement();
                ResultSet rst= stt.executeQuery(sql);

                while(rst.next()){
                    if(rst.getInt(1)==1){
                        System.out.println("Welcome");
                        //   message.setText("welcome");
                        Parent root = load(getClass().getResource("Patient_logged_in.fxml"));
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

/*


    public void ButtonsignupOnAction(ActionEvent event) {
        if(!tf_patient_signup_fullname.getText().isBlank()  && !tf_patient_signup_age.getText().isBlank() && !tf_patient_signup_email.getText().isBlank()
        && !tf_patient_signup_phone.getText().isBlank() && !tf_patient_signup_username.getText().isBlank() && !pf_patient_signup_password.getText().isBlank()){
            try {
                pat_signup(event);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            //System.out.println("you try to login");
            //message.setText("you try to login");
        }
        else {
            System.out.println("enter your Username and Password");
        }

    }

    public void pat_signup(ActionEvent event) throws SQLException {
        DatabaseConnection dBconnect = new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        String fullname=tf_patient_signup_fullname.getText();
        String age=tf_patient_signup_age.getText();
        String email=tf_patient_signup_email.getText();
        String phone=tf_patient_signup_phone.getText();
        String username=tf_patient_signup_username.getText();
        String password=pf_patient_signup_password.getText();


try{
    PreparedStatement pst= con.prepareStatement("insert into patient(p_username,p_password,p_fullname, p_age,p_phone,p_email) values (?,?,?,?,?,?)");
    pst.setString(1,username);
    pst.setString(2,password);
    pst.setString(3,fullname);
    pst.setString(4,age);
    pst.setString(5,phone);
    pst.setString(6,email);

    int status= pst.executeUpdate();

    if(status==1){
        System.out.println("registered");
    }
    else{
        System.out.println("try again");
    }

}
catch (Exception e){}

    }

*/



    @FXML
    private TextField tf_withoutlogin_app_date;

    @FXML
    private TextField tf_withoutlogin_app_doctor;



    @FXML
    private TextField tf_withoutlogin_app_fullname;



    @FXML
    private TextField tf_withoutlogin_app_phone;

    @FXML
    private TextField tf_withoutlogin_app_time;



    public void app_without_login(ActionEvent event) {
        if(!tf_withoutlogin_app_fullname.getText().isBlank()
                && !tf_withoutlogin_app_phone.getText().isBlank()  &&  !tf_withoutlogin_app_doctor.getText().isBlank() && !tf_withoutlogin_app_date.getText().isBlank()
                && !tf_withoutlogin_app_time.getText().isBlank()){
            try {
                System.out.println("loading....");
                confirm_app_withoutlogin(event);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            //System.out.println("you try to login");
            //message.setText("you try to login");
        }
        else {
            System.out.println("Please enter all the details");
        }

    }

    public void confirm_app_withoutlogin(ActionEvent event) throws SQLException {
        DatabaseConnection dBconnect = new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        String fullname=tf_withoutlogin_app_fullname.getText();
        String phone=tf_withoutlogin_app_phone.getText();
        String doctor=tf_withoutlogin_app_doctor.getText();
        String date=tf_withoutlogin_app_date.getText();
        String time=tf_withoutlogin_app_time.getText();



        try{
            PreparedStatement pst= con.prepareStatement("insert into patient_makes_appointment_without_login(p_fullname ,p_phone,doctor,preferred_date,preferred_time) values (?,?,?,?,?)");
            pst.setString(1,fullname);
            pst.setString(2,phone);
            pst.setString(3,doctor);

            pst.setString(4,date);
            pst.setString(5,time);

            int s= pst.executeUpdate();

            if(s==1){
                System.out.println("appointment confirmed");
                tf_withoutlogin_app_fullname.setText("");
                tf_withoutlogin_app_phone.setText("");
                tf_withoutlogin_app_doctor.setText("");
                tf_withoutlogin_app_date.setText("");
                tf_withoutlogin_app_time.setText("");
                tf_withoutlogin_app_fullname.requestFocus();
            }
            else{
                System.out.println("try again");
            }

        }
        catch (Exception e){}

    }















    public void Patient_logged_in(ActionEvent event) throws IOException{
        Parent root = load(getClass().getResource("Patient_logged_in.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();





    }








    public void Patient_signup(ActionEvent event) throws IOException{
        Parent root = load(getClass().getResource("Patient_signup.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void PatientLogin(ActionEvent event) throws IOException{
        Parent root = load(getClass().getResource("PatientLogin.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    public void PatientApp(ActionEvent event) throws IOException{
       // Parent root = load(getClass().getResource("PatientApp.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void Patient_page(ActionEvent event) throws IOException{
       // Parent root = load(getClass().getResource("PatientPage.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

        public void switchToScene1(ActionEvent event) throws IOException {
       //     Parent root = load(getClass().getResource("Scene1.fxml"));
            stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),800,600);
       //     scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }


    public void View_doctors(ActionEvent event) throws IOException {
       // Parent root = load(getClass().getResource("Doctors_table.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Doctors_table.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void View_tests(ActionEvent event) throws IOException {
      //  Parent root = load(getClass().getResource("Tests_table.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Tests_table.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }





}



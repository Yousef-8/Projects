package com.example.sihha19;

import ConnectionDB.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

import java.io.*;
import java.sql.*;
import java.util.logging.*;
import ConnectionDB.*;
import javafx.scene.*;
import javafx.event.ActionEvent;

import java.io.*;
import java.sql.*;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;


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


import static javafx.fxml.FXMLLoader.load;

public class DoctorsTableController {

    private Stage stage;
    private Scene scene;

    private BreakIterator message;

    ObservableList<Doctor>dataList;

    PreparedStatement sql;
    int id,myIndex;



    @FXML
    private TableColumn<Doctor, String> col_days;

    @FXML
    private TableColumn<Doctor, String> col_department;

    @FXML
    private TableColumn<Doctor, String> col_email;

    @FXML
    private TableColumn<Doctor, String> col_fullname;

    @FXML
    private TableColumn<Doctor, String> col_qualification;

    @FXML
    private TableColumn<Doctor, String> col_time;

    @FXML
    private TableView<Doctor> table;





    public void table() throws SQLException {
        ObservableList<Doctor> doctors = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try{
            //

            sql=con.prepareStatement("select d_fullname ,d_email,d_qualification,d_department,d_days,d_time from doctor");
            ResultSet rst= sql.executeQuery();
            while (rst.next()){
                Doctor doctor= new Doctor();

                doctor.setFullname(rst.getString("d_fullname"));
                doctor.setEmail(rst.getString("d_email"));
                doctor.setQualification(rst.getString("d_qualification"));
                doctor.setDepartment(rst.getString("d_department"));
                doctor.setDays(rst.getString("d_days"));
                doctor.setTime(rst.getString("d_time"));


                doctors.add(doctor);
            }

            table.setItems(doctors);
            //column name to display the value

            col_fullname.setCellValueFactory(f->f.getValue().fullnameProperty());
            col_email.setCellValueFactory(f->f.getValue().emailProperty());
            col_qualification.setCellValueFactory(f->f.getValue().qualificationProperty());
            col_department.setCellValueFactory(f->f.getValue().departmentProperty());
            col_days.setCellValueFactory(f->f.getValue().daysProperty());
            col_time.setCellValueFactory(f->f.getValue().timeProperty());



        }catch (SQLException e){
            Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE,null,e);
        }
        table.setRowFactory(tv->{
            TableRow<Doctor> myrow= new TableRow<>();
            myrow.setOnMouseClicked(event->
            {
                if (event.getClickCount()==1 && (myrow.isEmpty())){

                    myIndex= table.getSelectionModel().getSelectedIndex();

                    //    id= Integer.parseInt(String.valueOf(table.getItems().get(myIndex).getId()));


                /*    tf_fullname.setText(table.getItems().get(myIndex).getFullname());
                    tf_email.setText(table.getItems().get(myIndex).getEmail());
                    tf_qualification.setText(table.getItems().get(myIndex).getQualification());
                    tf_department.setText(table.getItems().get(myIndex).getDepartment());
                    tf_days.setText(table.getItems().get(myIndex).getDays());
                    tf_time.setText(table.getItems().get(myIndex).getTime());
*/


                }
            });
            return myrow;
        });
    }




    public void initialize() throws SQLException {

        DatabaseConnection dBconnect= new DatabaseConnection();

        try {
            dBconnect.getConnection();
            table();
            // searchFor();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void Patient_page(ActionEvent event) throws IOException{
       // Parent root = load(getClass().getResource("PatientPage.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



    public void PatientApp(ActionEvent event) throws IOException{
      //  Parent root = load(getClass().getResource("PatientApp.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void switchToScene1(ActionEvent event) throws IOException {
       // Parent root = load(getClass().getResource("Scene1.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }






}

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


import ConnectionDB.*;
import javafx.collections.*;
import javafx.event.*;
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
import javafx.fxml.FXML;
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

public class PatientTableController {

    private Stage stage;
    private Scene scene;

    private BreakIterator message;

    ObservableList<Patient>dataList;

    PreparedStatement sql;
    int id,myIndex;

    @FXML
    private TableColumn<Patient, String> col_date;

    @FXML
    private TableColumn<Patient, String> col_pat;

    @FXML
    private TableColumn<Patient, String> col_pho;

    @FXML
    private TableColumn<Patient, String> col_time;

    @FXML
    private TableView<Patient> table2;




    public void table2() throws SQLException {
        ObservableList<Patient> patients = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try{
            //

            sql=con.prepareStatement("select p_name, p_phone,apt_date,apt_time from apt_scheduler_makes_appointment ");
            ResultSet rst= sql.executeQuery();
            while (rst.next()){
                Patient patient= new Patient();

                patient.setPat(rst.getString("p_name"));
                patient.setPho(rst.getString("p_phone"));
                patient.setDate(rst.getString("apt_date"));
                patient.setTime(rst.getString("apt_time"));



                patients.add(patient);
            }

            table2.setItems(patients);
            //column name to display the value

            col_pat.setCellValueFactory(f->f.getValue().patProperty());
            col_pho.setCellValueFactory(f->f.getValue().phoProperty());
            col_date.setCellValueFactory(f->f.getValue().dateProperty());
            col_time.setCellValueFactory(f->f.getValue().timeProperty());



        }catch (SQLException e){
            Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE,null,e);
        }
        table2.setRowFactory(tv->{
            TableRow<Patient> myrow= new TableRow<>();
            myrow.setOnMouseClicked(event->
            {
                if (event.getClickCount()==1 && (myrow.isEmpty())){

                    myIndex= table2.getSelectionModel().getSelectedIndex();

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
            table2();
            // searchFor();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Doctor_logged_in(ActionEvent event) throws IOException {
        Parent root = load(getClass().getResource("Doctor_logged_in.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void switchToScene1(ActionEvent event) throws IOException {
      //  Parent root = load(getClass().getResource("Scene1.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }











}

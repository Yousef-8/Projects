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


import static javafx.fxml.FXMLLoader.load;

public class ViewDocPatAppReqController {


    private Stage stage;
    private Scene scene;

    private BreakIterator message;

    ObservableList<DocPatAppReq>dataList;

    PreparedStatement sql;
    int id,myIndex;



    @FXML
    private TableColumn<DocPatAppReq, String> col_date;

    @FXML
    private TableColumn<DocPatAppReq, String> col_doc;

    @FXML
    private TableColumn<DocPatAppReq, String> col_pat;

    @FXML
    private TableColumn<DocPatAppReq, String> col_pho;

    @FXML
    private TableColumn<DocPatAppReq, String> col_time;

    @FXML
    private TableView<DocPatAppReq> table;













    public void table() throws SQLException {
        ObservableList<DocPatAppReq> dpars = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try{
            //

            sql=con.prepareStatement("select p_fullname ,p_phone ,doctor ,preferred_date ,preferred_time  from patient_makes_appointment_without_login");
            ResultSet rst= sql.executeQuery();
            while (rst.next()){
                DocPatAppReq dpar= new DocPatAppReq();
                dpar.setPat(rst.getString("p_fullname"));
                dpar.setPho(rst.getString("p_phone"));
                dpar.setDoc(rst.getString("doctor"));
                dpar.setDate(rst.getString("preferred_date"));
                dpar.setTime(rst.getString("preferred_time"));




                dpars.add(dpar);
            }

            table.setItems(dpars);
            //column name to display the value
            col_pat.setCellValueFactory(f->f.getValue().patProperty());
            col_pho.setCellValueFactory(f->f.getValue().phoProperty());
            col_doc.setCellValueFactory(f->f.getValue().docProperty());
            col_date.setCellValueFactory(f->f.getValue().dateProperty());
            col_time.setCellValueFactory(f->f.getValue().timeProperty());




        }catch (SQLException e){
            Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE,null,e);
        }
        table.setRowFactory(tv->{
            TableRow<DocPatAppReq> myrow= new TableRow<>();
            myrow.setOnMouseClicked(event->
            {
                if (event.getClickCount()==1 && (myrow.isEmpty())){

                    myIndex= table.getSelectionModel().getSelectedIndex();

                    //    id= Integer.parseInt(String.valueOf(table.getItems().get(myIndex).getId()));


                }
            });
            return myrow;
        });
    }

















    public void Appointment_scheduler(ActionEvent event) throws IOException{
       // Parent root = load(getClass().getResource("Appointment_scheduler.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Appointment_scheduler.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
        //scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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





    public void switchToScene1(ActionEvent event) throws IOException {
     //   Parent root = load(getClass().getResource("Scene1.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
     //   scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}

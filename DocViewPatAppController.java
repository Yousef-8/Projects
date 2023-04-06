package com.example.sihha19;
import ConnectionDB.*;
import javafx.collections.*;
import javafx.collections.transformation.*;
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

import com.example.sihha19.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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

import javafx.event.ActionEvent;
import javafx.scene.Parent;

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
public class DocViewPatAppController {

    private Stage stage;
    private Scene scene;

    private BreakIterator message;

    PreparedStatement sql;
    int id,myIndex;


    ObservableList<DocPatApp>dataList;




@FXML
private TextField tf_search;

@FXML
private  Button btn_search;



    @FXML
    private TableColumn<DocPatApp, String> col_date;

    @FXML
    private TableColumn<DocPatApp, String> col_pat;

    @FXML
    private TableColumn<DocPatApp, String> col_pho;

    @FXML
    private TableColumn<DocPatApp, String> col_time;

    @FXML
    private TableColumn<DocPatApp, String> col_doc;

    @FXML
    private TableView<DocPatApp> table;




    public void table() throws SQLException {
        ObservableList<DocPatApp> patients = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try{
            //

            sql=con.prepareStatement("select d_name ,p_name, p_phone,apt_date,apt_time from apt_scheduler_makes_appointment");
            ResultSet rst= sql.executeQuery();
            while (rst.next()){
                DocPatApp patient= new DocPatApp();

                patient.setDoc(rst.getString("d_name"));
                patient.setPat(rst.getString("p_name"));
                patient.setPho(rst.getString("p_phone"));
                patient.setDate(rst.getString("apt_date"));
                patient.setTime(rst.getString("apt_time"));



                patients.add(patient);
            }

            table.setItems(patients);
            //column name to display the value
            col_doc.setCellValueFactory(f->f.getValue().docProperty());
            col_pat.setCellValueFactory(f->f.getValue().patProperty());
            col_pho.setCellValueFactory(f->f.getValue().phoProperty());
            col_date.setCellValueFactory(f->f.getValue().dateProperty());
            col_time.setCellValueFactory(f->f.getValue().timeProperty());



        }catch (SQLException e){
            Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE,null,e);
        }
        table.setRowFactory(tv->{
            TableRow<DocPatApp> myrow= new TableRow<>();
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



    @FXML
    public void Searchf(ActionEvent event ) throws  SQLException{


        col_doc.setCellValueFactory(f->f.getValue().docProperty());
        col_pat.setCellValueFactory(f->f.getValue().patProperty());
        col_pho.setCellValueFactory(f->f.getValue().phoProperty());
        col_date.setCellValueFactory(f->f.getValue().dateProperty());
        col_time.setCellValueFactory(f->f.getValue().timeProperty());



        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        dataList=dBconnect.getDatadocpatapp();


        table.setItems(dataList);

        FilteredList<DocPatApp> filteredData= new FilteredList<>(dataList, b->true);
        tf_search.textProperty().addListener((observable, oldValue,newValue)->{
            filteredData.setPredicate(docpatapp -> {
                if (newValue==null || newValue.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                if (docpatapp.getDoc().toLowerCase().indexOf(lowerCaseFilter) !=-1){
                    return  true;// Filter matches username
                }
                else if (docpatapp.getPat().toLowerCase().indexOf(lowerCaseFilter) !=-1)
                    return  true;
                /* {
                    return true; // Filter matches passWord
                } else if (String.valueof(person.getEmail()).indexof(lowerCaseFilter) !=-1) */
                    // Filter matches email

                else

                    return false; //does not matches.



            });
        });
        SortedList<DocPatApp> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(table.comparatorProperty());
        table.setItems(sortedData);

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






    public void Doctor_logged_in(ActionEvent event) throws IOException {
     //   Parent root = load(getClass().getResource("Doctor_logged_in.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Doctor_logged_in.fxml"));
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
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
    public void Appointment_scheduler(ActionEvent event) throws IOException{
      //  Parent root = load(getClass().getResource("Appointment_scheduler.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Appointment_scheduler.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

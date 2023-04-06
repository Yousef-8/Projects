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
import java.text.*;
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

public class TestsTableController {

    private Stage stage;
    private Scene scene;

    private BreakIterator message;

    ObservableList<Test>dataList;

    PreparedStatement sql;
    int id,myIndex;
    @FXML
    private TableColumn<Test, String> col_days;

    @FXML
    private TableColumn<Test, String> col_notes;

    @FXML
    private TableColumn<Test, String> col_price;

    @FXML
    private TableColumn<Test, String> col_test;

    @FXML
    private TableColumn<Test, String> col_time;

    @FXML
    private TableView<Test> table;




    public void table() throws SQLException {
        ObservableList<Test> tests = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try{
            //

            sql=con.prepareStatement("select t_name ,t_price,t_days,t_time,t_notes from test");
            ResultSet rst= sql.executeQuery();
            while (rst.next()){
                Test test= new Test();

                test.setTest(rst.getString("t_name"));
                test.setPrice(rst.getString("t_price"));
                test.setDate(rst.getString("t_days"));
                test.setTime(rst.getString("t_time"));
                test.setNotes(rst.getString("t_notes"));



                tests.add(test);
            }

            table.setItems(tests);
            //column name to display the value

            col_test.setCellValueFactory(f->f.getValue().testProperty());
            col_price.setCellValueFactory(f->f.getValue().priceProperty());
            col_days.setCellValueFactory(f->f.getValue().dateProperty());
            col_time.setCellValueFactory(f->f.getValue().timeProperty());
            col_notes.setCellValueFactory(f->f.getValue().notesProperty());



        }catch (SQLException e){
            Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE,null,e);
        }
        table.setRowFactory(tv->{
            TableRow<Test> myrow= new TableRow<>();
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


    public void PatientApp(ActionEvent event) throws IOException {
        Parent root = load(getClass().getResource("PatientApp.fxml"));
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
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



    public void Patient_page(ActionEvent event) throws IOException{
     //   Parent root = load(getClass().getResource("PatientPage.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
    //    scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}

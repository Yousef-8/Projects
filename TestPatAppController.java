package com.example.sihha19;

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


public class TestPatAppController {


    private Stage stage;
    private Scene scene;

    @FXML
    private Button btn_add;

    @FXML
    private Button btn_delete;

    @FXML
    private Button btn_edit;

    @FXML
    private Button btn_search;

    @FXML
    private TableColumn<Test, String> col_date;

    @FXML
    private TableColumn<Test, String> col_pat;

    @FXML
    private TableColumn<Test, String> col_pho;

    @FXML
    private TableColumn<Test, String> col_price;

    @FXML
    private TableColumn<Test, String> col_test;

    @FXML
    private TableColumn<Test, String> col_time;

    @FXML
    private TableView<Test> table;

    @FXML
    private TextField tf_date;

    @FXML
    private TextField tf_pat;

    @FXML
    private TextField tf_pho;

    @FXML
    private TextField tf_price;

    @FXML
    private TextField tf_search;

    @FXML
    private TextField tf_test;

    @FXML
    private TextField tf_time;


    ObservableList<Test> dataList;

    PreparedStatement sql;
    int id, myIndex;

    @FXML
    void Addf(ActionEvent event) throws SQLException {

        String test = tf_test.getText();
        String pat = tf_pat.getText();
        String pho = tf_pho.getText();
        String date = tf_date.getText();
        String time = tf_time.getText();
        String price = tf_price.getText();


        //connecter//

        DatabaseConnection dBconnect = new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try {
            //Statement stt= con.createStatement();
            sql = con.prepareStatement("insert into apt_scheduler_makes_test (test_name ,test_pat ,test_pho ,test_date ,test_time,test_price ) " +
                    "values(?,?,?,?,?,?)");
            // sql.setInt(1, Integer.parseInt(id));
            sql.setString(1, test);
            sql.setString(2, pat);
            sql.setString(3, pho);

            sql.setString(4, date);
            sql.setString(5, time);
            sql.setString(6, price);


            sql.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Doctor patient appointment");
            alert.setHeaderText("Doctor-patient appointment");
            alert.setContentText("Appointment successful");

            alert.showAndWait();

            table();
            tf_test.setText("");
            tf_pat.setText("");
            tf_pho.setText("");

            tf_date.setText("");
            tf_time.setText("");
            tf_price.setText("");

            tf_test.requestFocus();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

    public void table() throws SQLException {
        ObservableList<Test> tpas = FXCollections.observableArrayList();

        DatabaseConnection dBconnect = new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try {
            //

            sql = con.prepareStatement("select  test_name ,test_pat ,test_pho ,test_date ,test_time,test_price from apt_scheduler_makes_test");
            ResultSet rst = sql.executeQuery();
            while (rst.next()) {
                Test tpa = new Test();
                tpa.setTest(rst.getString("test_name"));
                tpa.setPat(rst.getString("test_pat"));
                tpa.setPho(rst.getString("test_pho"));
                tpa.setDate(rst.getString("test_date"));
                tpa.setTime(rst.getString("test_time"));
                tpa.setPrice(rst.getString("test_price"));

                tpas.add(tpa);
            }

            table.setItems(tpas);
            //column name to display the value
            col_test.setCellValueFactory(f -> f.getValue().testProperty());
            col_pat.setCellValueFactory(f -> f.getValue().patProperty());
            col_pho.setCellValueFactory(f -> f.getValue().phoProperty());
            col_date.setCellValueFactory(f -> f.getValue().dateProperty());
            col_time.setCellValueFactory(f -> f.getValue().timeProperty());
            col_price.setCellValueFactory(f -> f.getValue().priceProperty());


        } catch (SQLException e) {
            Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE, null, e);
        }
        table.setRowFactory(tv -> {
            TableRow<Test> myrow = new TableRow<>();
            myrow.setOnMouseClicked(event ->
            {
                if (event.getClickCount() == 1 && (myrow.isEmpty())) {

                    myIndex = table.getSelectionModel().getSelectedIndex();

                    //    id= Integer.parseInt(String.valueOf(table.getItems().get(myIndex).getId()));

                    tf_test.setText(table.getItems().get(myIndex).getTest());
                    tf_pat.setText(table.getItems().get(myIndex).getPat());
                    tf_pho.setText(table.getItems().get(myIndex).getPho());
                    tf_date.setText(table.getItems().get(myIndex).getDate());
                    tf_time.setText(table.getItems().get(myIndex).getTime());
                    tf_price.setText(table.getItems().get(myIndex).getPrice());

                }
            });
            return myrow;
        });
    }







    @FXML
    public void getSelected(MouseEvent event){
        myIndex= table.getSelectionModel().getSelectedIndex();
        if (myIndex<=-1){
            return;
        }
        //  f_id.setText(f_col_id.getCellData(myIndex).toString());
        tf_test.setText(col_test.getCellData(myIndex).toString());
        tf_pat.setText(col_pat.getCellData(myIndex).toString());
        tf_pho.setText(col_pho.getCellData(myIndex).toString());
        tf_date.setText(col_date.getCellData(myIndex).toString());
        tf_time.setText(col_time.getCellData(myIndex).toString());
        tf_price.setText(col_price.getCellData(myIndex).toString());



    }




    @FXML
    public void Searchf(ActionEvent event ) throws  SQLException{


        col_test.setCellValueFactory(f->f.getValue().testProperty());
        col_pat.setCellValueFactory(f->f.getValue().patProperty());
        col_pho.setCellValueFactory(f->f.getValue().phoProperty());
        col_date.setCellValueFactory(f->f.getValue().dateProperty());
        col_time.setCellValueFactory(f->f.getValue().timeProperty());
        col_price.setCellValueFactory(f->f.getValue().priceProperty());



        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        dataList=dBconnect.getDatatestpatapp();


        table.setItems(dataList);

        FilteredList<Test> filteredData= new FilteredList<>(dataList, b->true);
        tf_search.textProperty().addListener((observable, oldValue,newValue)->{
            filteredData.setPredicate(test -> {
                if (newValue==null || newValue.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                if (test.getTest().toLowerCase().indexOf(lowerCaseFilter) !=-1){
                    return  true;// Filter matches username
                } else if (test.getPat().toLowerCase().indexOf(lowerCaseFilter) !=-1) /* {
                    return true; // Filter matches passWord
                } else if (String.valueof(person.getEmail()).indexof(lowerCaseFilter) !=-1) */
                    return true; // Filter matches email

                else

                    return false; //does not matches.



            });
        });
        SortedList<Test> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(table.comparatorProperty());
        table.setItems(sortedData);

    }




    @FXML
    public void Editf(ActionEvent event )throws SQLException{



        DatabaseConnection dBconnect= new DatabaseConnection();

        try{

            Connection con = dBconnect.getConnection();
            //Connection con= dBconnect.getConnection();


            String test=tf_test.getText();
            String pat= tf_pat.getText();
            String pho=tf_pho.getText();
            String date=tf_date.getText();
            String time=tf_time.getText();
            String price=tf_price.getText();





            String sq="update apt_scheduler_makes_test set test_name='"+test+"',test_pat='"+pat+"'" +
                    ",test_pho='"+pho+"',test_date='"+date+"',test_time='"+time+
                    "',test_price='"+price+"' where test_name='"+test+"'";

            sql = con.prepareStatement(sq);
            sql.executeUpdate();


            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Update Data");
            alert.setContentText("Are you sure you want to update this data?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                // user clicked OK button, update data here
            } else {
                // user clicked CANCEL button, do nothing
            }
            initialize();

        }catch (Exception e){}
    }




    @FXML
    void Deletef(ActionEvent event)throws SQLException{
        //connecter//

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();

        String ql="delete from apt_scheduler_makes_test where test_name=?";

        try{
            PreparedStatement stt= con.prepareStatement(ql);
            stt.setString(1,tf_test.getText());
            stt.execute();


            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Delete Data");
            alert.setContentText("Are you sure you want to delete this data?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                // user clicked OK button, update data here
            } else {
                // user clicked CANCEL button, do nothing
            }
            initialize();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }





    public void switchToScene1(ActionEvent event) throws IOException {
   //     Parent root = load(getClass().getResource("Scene1.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
     //   scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void initialize () throws SQLException {

        DatabaseConnection dBconnect = new DatabaseConnection();

        try {
            dBconnect.getConnection();
            table();
            // searchFor();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public void Appointment_scheduler(ActionEvent event) throws IOException{
      //  Parent root = load(getClass().getResource("Appointment_scheduler.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Appointment_scheduler.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
   //     scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

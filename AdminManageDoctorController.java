package com.example.sihha19;


import ConnectionDB.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.event.ActionEvent;

import java.io.*;
import java.sql.*;
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



import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
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


public class AdminManageDoctorController {

    private Stage stage;
    private Scene scene;

    private BreakIterator message;

    @FXML
    private Button button_add;

    @FXML
    private Button button_delete;

    @FXML
    private Button button_edit;

    @FXML
    private Button button_search;

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
    private TableColumn<Doctor, String> col_days;

    @FXML
    private TableColumn<Doctor, String> col_time;

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
   private  TextField tf_gend;

    @FXML
    private TextField tf_phone;

    @FXML
    private TextField tf_qualification;

    @FXML
    private TextField tf_username;

    @FXML
    private TextField tf_days;


    @FXML
    private TextField tf_time;


    @FXML
    private TextField tf_search;


    ObservableList<Doctor>dataList;

    PreparedStatement sql;
    int id,myIndex;



    @FXML
    void Addf(ActionEvent event) throws SQLException {
        //create variable//

        String username=tf_username.getText();
        String password= pf_password.getText();
        String fullname=tf_fullname.getText();
        String gender=tf_gend.getText();
        String age=tf_age.getText();
        String phone=tf_phone.getText();
        String email= tf_email.getText();
        String qualification=tf_qualification.getText();
        String department=tf_department.getText();
        String days=tf_days.getText();
        String time=tf_time.getText();




        //connecter//

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try{
            //Statement stt= con.createStatement();
            sql=con.prepareStatement("insert into doctor (d_username ,d_password ,d_fullname ,d_gender ,d_age,d_phone,d_email,d_qualification,d_department,d_days,d_time ) " +
                    "values(?,?,?,?,?,?,?,?,?,?,?)");
           // sql.setInt(1, Integer.parseInt(id));
            sql.setString(1,username);
            sql.setString(2,password);
            sql.setString(3,fullname);

            sql.setString(4,gender);
            sql.setString(5,age);
            sql.setString(6,phone);
            sql.setString(7,email);
            sql.setString(8,qualification);
            sql.setString(9,department);
            sql.setString(10,days);
            sql.setString(11,time);

            sql.executeUpdate();

            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Doctor management");
            alert.setHeaderText("Doctor management");
            alert.setContentText("Doctor added");

            alert.showAndWait();

           table();
            tf_username.setText("");
            tf_fullname.setText("");
            pf_password.setText("");
            tf_gend.setText("");
            tf_age.setText("");
            tf_phone.setText("");
            tf_email.setText("");
            tf_qualification.setText("");
            tf_department.setText("");
            tf_days.setText("");
            tf_time.setText("");

            tf_username.requestFocus();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void table() throws SQLException {
        ObservableList<Doctor> doctors = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        try{
            //

            sql=con.prepareStatement("select d_username ,d_password ,d_fullname ,d_gender ,d_age,d_phone,d_email,d_qualification,d_department,d_days,d_time from doctor");
            ResultSet rst= sql.executeQuery();
            while (rst.next()){
                Doctor doctor= new Doctor();

                doctor.setUsername(rst.getString("d_username"));
                doctor.setPassword(rst.getString("d_password"));
                doctor.setFullname(rst.getString("d_fullname"));
                doctor.setGender(rst.getString("d_gender"));
                doctor.setAge(rst.getString("d_age"));
                doctor.setPhone(rst.getString("d_phone"));
                doctor.setEmail(rst.getString("d_email"));
                doctor.setQualification(rst.getString("d_qualification"));
                doctor.setDepartment(rst.getString("d_department"));
                doctor.setDays(rst.getString("d_days"));
                doctor.setTime(rst.getString("d_time"));


                doctors.add(doctor);
            }

            table.setItems(doctors);
            //column name to display the value
            col_username.setCellValueFactory(f->f.getValue().usernameProperty());
            col_password.setCellValueFactory(f->f.getValue().passwordProperty());
            col_fullname.setCellValueFactory(f->f.getValue().fullnameProperty());
            col_gender.setCellValueFactory(f->f.getValue().genderProperty());
            col_age.setCellValueFactory(f->f.getValue().ageProperty());
            col_phone.setCellValueFactory(f->f.getValue().phoneProperty());
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

                    tf_username.setText(table.getItems().get(myIndex).getUsername());
                    pf_password.setText(table.getItems().get(myIndex).getPassword());
                    tf_fullname.setText(table.getItems().get(myIndex).getFullname());
                    tf_gend.setText(table.getItems().get(myIndex).getGender());
                    tf_age.setText(table.getItems().get(myIndex).getAge());
                    tf_phone.setText(table.getItems().get(myIndex).getPhone());
                    tf_email.setText(table.getItems().get(myIndex).getEmail());
                    tf_qualification.setText(table.getItems().get(myIndex).getQualification());
                    tf_department.setText(table.getItems().get(myIndex).getDepartment());
                    tf_days.setText(table.getItems().get(myIndex).getDays());
                    tf_time.setText(table.getItems().get(myIndex).getTime());

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
        tf_username.setText(col_username.getCellData(myIndex).toString());
        pf_password.setText(col_password.getCellData(myIndex).toString());
        tf_fullname.setText(col_fullname.getCellData(myIndex).toString());
        tf_gend.setText(col_gender.getCellData(myIndex).toString());
        tf_age.setText(col_age.getCellData(myIndex).toString());
        tf_phone.setText(col_phone.getCellData(myIndex).toString());
        tf_email.setText(col_email.getCellData(myIndex).toString());
        tf_qualification.setText(col_qualification.getCellData(myIndex).toString());
        tf_department.setText(col_department.getCellData(myIndex).toString());
        tf_days.setText(col_days.getCellData(myIndex).toString());
        tf_time.setText(col_time.getCellData(myIndex).toString());


    }




    @FXML
    public void Searchf(ActionEvent event ) throws  SQLException{


        col_username.setCellValueFactory(f->f.getValue().usernameProperty());
        col_password.setCellValueFactory(f->f.getValue().passwordProperty());
        col_fullname.setCellValueFactory(f->f.getValue().fullnameProperty());
        col_gender.setCellValueFactory(f->f.getValue().genderProperty());
        col_age.setCellValueFactory(f->f.getValue().ageProperty());
        col_phone.setCellValueFactory(f->f.getValue().phoneProperty());
        col_email.setCellValueFactory(f->f.getValue().emailProperty());
        col_qualification.setCellValueFactory(f->f.getValue().qualificationProperty());
        col_department.setCellValueFactory(f->f.getValue().departmentProperty());
        col_days.setCellValueFactory(f->f.getValue().daysProperty());
        col_time.setCellValueFactory(f->f.getValue().timeProperty());


        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();


        dataList=dBconnect.getData();


        table.setItems(dataList);

        FilteredList<Doctor> filteredData= new FilteredList<>(dataList, b->true);
       tf_search.textProperty().addListener((observable, oldValue,newValue)->{
            filteredData.setPredicate(doctor -> {
                if (newValue==null || newValue.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                if (doctor.getUsername().toLowerCase().indexOf(lowerCaseFilter) !=-1){
                    return  true;// Filter matches username
                } else if (doctor.getDepartment().toLowerCase().indexOf(lowerCaseFilter) !=-1) /* {
                    return true; // Filter matches passWord
                } else if (String.valueof(person.getEmail()).indexof(lowerCaseFilter) !=-1) */
                    return true; // Filter matches email

                else

                    return false; //does not matches.



            });
        });
        SortedList<Doctor> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(table.comparatorProperty());
        table.setItems(sortedData);

       }




@FXML
    public void Edit(ActionEvent event )throws SQLException{



    DatabaseConnection dBconnect= new DatabaseConnection();

        try{

            Connection con = dBconnect.getConnection();
            //Connection con= dBconnect.getConnection();
           //   if (con!=null){
            //   System.out.println("get connected");}


            String username=tf_username.getText();
            String password= pf_password.getText();
            String fullname=tf_fullname.getText();
            String gender=tf_gend.getText();
            String age=tf_age.getText();
            String phone=tf_phone.getText();
            String email= tf_email.getText();
            String qualification=tf_qualification.getText();
            String department=tf_department.getText();
            String days=tf_days.getText();
            String time=tf_time.getText();



            String sq="update doctor set d_username='"+username+"',d_password='"+password+"'" +
                    ",d_fullname='"+fullname+"',d_gender='"+gender+"',d_age='"+age+"',d_phone='"+phone+"'," +
                    "d_email='"+email+"',d_qualification='"+qualification+"',d_department='"+department+"',d_days='"+days+"'" +
                    ",d_time='"+time+"' where d_username='"+username+"'";

            if (con!=null) {
                System.out.println("sql query");
            }

            sql = con.prepareStatement(sq);
            sql.executeUpdate();
            if (con!=null) {
                System.out.println("Statement");
            }

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

        String ql="delete from doctor where d_username=?";

        try{
            PreparedStatement stt= con.prepareStatement(ql);
            stt.setString(1,tf_username.getText());
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
      //  Parent root = load(getClass().getResource("Scene1.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
        //scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }





    public void Admin_logged_in(ActionEvent event) throws IOException {
//        Parent root = load(getClass().getResource("Admin_logged_in.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin_logged_in.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
      //  scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }















}


package com.example.sihha19;

import ConnectionDB.*;
import javafx.collections.*;
import javafx.collections.transformation.*;
import javafx.event.*;
import javafx.fxml.*;
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



import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.stage.*;

import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;

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


import static javafx.fxml.FXMLLoader.load;




public class AdminManageStaffController {






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
        private TableView<AppointmentScheduler>table;

        @FXML
        private TableColumn<AppointmentScheduler, String> col_age;



        @FXML
        private TableColumn<AppointmentScheduler, String> col_email;

        @FXML
        private TableColumn<AppointmentScheduler, String> col_fullname;

        @FXML
        private TableColumn<AppointmentScheduler, String> col_gender;

        @FXML
        private TableColumn<AppointmentScheduler, String> col_password;

        @FXML
        private TableColumn<AppointmentScheduler, String> col_phone;


        @FXML
        private TableColumn<AppointmentScheduler, String> col_username;

        @FXML
        private PasswordField pf_password;



        @FXML
        private TextField tf_age;



        @FXML
        private TextField tf_email;

        @FXML
        private TextField tf_fullname;

        @FXML
        private  TextField tf_gend;

        @FXML
        private TextField tf_phone;



        @FXML
        private TextField tf_username;

        @FXML
        private TextField tf_search;


        ObservableList<AppointmentScheduler> dataList;

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





            //connecter//

            DatabaseConnection dBconnect= new DatabaseConnection();
            Connection con = dBconnect.getConnection();


            try{
                //Statement stt= con.createStatement();
                sql=con.prepareStatement("insert into appointment_scheduler (a_s_username ,a_s_password ,a_s_fullname ,a_s_gender ,a_s_age,a_s_phone,a_s_email) " +
                        "values(?,?,?,?,?,?,?)");
                // sql.setInt(1, Integer.parseInt(id));
                sql.setString(1,username);
                sql.setString(2,password);
                sql.setString(3,fullname);

                sql.setString(4,gender);
                sql.setString(5,age);
                sql.setString(6,phone);
                sql.setString(7,email);


                sql.executeUpdate();

                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Staff management");
                alert.setHeaderText("Staff management");
                alert.setContentText("Staff added");

                alert.showAndWait();

                table();
                tf_username.setText("");
                tf_fullname.setText("");
                pf_password.setText("");
                tf_gend.setText("");
                tf_age.setText("");
                tf_phone.setText("");
                tf_email.setText("");

                tf_username.requestFocus();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


        public void table() throws SQLException {
            ObservableList<AppointmentScheduler> apps = FXCollections.observableArrayList();

            DatabaseConnection dBconnect= new DatabaseConnection();
            Connection con = dBconnect.getConnection();


            try{
                //

                sql=con.prepareStatement("select a_s_username ,a_s_password ,a_s_fullname ,a_s_gender ,a_s_age,a_s_phone,a_s_email from appointment_scheduler");
                ResultSet rst= sql.executeQuery();
                while (rst.next()){
                    AppointmentScheduler app= new AppointmentScheduler();
                    app.setUsername(rst.getString("a_s_username"));
                    app.setPassword(rst.getString("a_s_password"));
                    app.setFullname(rst.getString("a_s_fullname"));
                    app.setGender(rst.getString("a_s_gender"));
                    app.setAge(rst.getString("a_s_age"));
                    app.setPhone(rst.getString("a_s_phone"));
                    app.setEmail(rst.getString("a_s_email"));

                    apps.add(app);
                }

                table.setItems(apps);
                //column name to display the value
                col_username.setCellValueFactory(f->f.getValue().usernameProperty());
                col_password.setCellValueFactory(f->f.getValue().passwordProperty());
                col_fullname.setCellValueFactory(f->f.getValue().fullnameProperty());
                col_gender.setCellValueFactory(f->f.getValue().genderProperty());
                col_age.setCellValueFactory(f->f.getValue().ageProperty());
                col_phone.setCellValueFactory(f->f.getValue().phoneProperty());
                col_email.setCellValueFactory(f->f.getValue().emailProperty());


            }catch (SQLException e){
                Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE,null,e);
            }
            table.setRowFactory(tv->{
                TableRow<AppointmentScheduler> myrow= new TableRow<>();
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



        }




        @FXML
        public void Searchf(ActionEvent event) throws  SQLException{


            col_username.setCellValueFactory(f->f.getValue().usernameProperty());
            col_password.setCellValueFactory(f->f.getValue().passwordProperty());
            col_fullname.setCellValueFactory(f->f.getValue().fullnameProperty());
            col_gender.setCellValueFactory(f->f.getValue().genderProperty());
            col_age.setCellValueFactory(f->f.getValue().ageProperty());
            col_phone.setCellValueFactory(f->f.getValue().phoneProperty());
            col_email.setCellValueFactory(f->f.getValue().emailProperty());



            DatabaseConnection dBconnect= new DatabaseConnection();
            Connection con = dBconnect.getConnection();


            dataList=dBconnect.getDataApp();


            table.setItems(dataList);

            FilteredList<AppointmentScheduler> filteredData= new FilteredList<>(dataList, b->true);
            tf_search.textProperty().addListener((observable, oldValue,newValue)->{
                filteredData.setPredicate(person -> {
                    if (newValue==null || newValue.isEmpty()){
                        return true;
                    }
                    String lowerCaseFilter = newValue.toLowerCase();

                    if (person.getFullname().toLowerCase().indexOf(lowerCaseFilter) !=-1){
                        return  true;// Filter matches username
                    } else if (person.getUsername().toLowerCase().indexOf(lowerCaseFilter) !=-1) /* {
                    return true; // Filter matches passWord
                } else if (String.valueof(person.getEmail()).indexof(lowerCaseFilter) !=-1) */
                        return true; // Filter matches email

                    else

                        return false; //does not matches.



                });
            });
            SortedList<AppointmentScheduler> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(table.comparatorProperty());
            table.setItems(sortedData);

        }




        @FXML
        public void Editf(ActionEvent event)throws SQLException{



            DatabaseConnection dBconnect= new DatabaseConnection();

            try{

                Connection con = dBconnect.getConnection();
                //Connection con= dBconnect.getConnection();


                String username=tf_username.getText();
                String password= pf_password.getText();
                String fullname=tf_fullname.getText();
                String gender=tf_gend.getText();
                String age=tf_age.getText();
                String phone=tf_phone.getText();
                String email= tf_email.getText();





                String sq="update appointment_scheduler set a_s_username='"+username+"',a_s_password='"+password+"'" +
                        ",a_s_fullname='"+fullname+"',a_s_gender='"+gender+"',a_s_age='"+age+"',a_s_phone='"+phone+"'," +
                        "a_s_email='"+email+"' where a_s_username='"+username+"'";

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

            String ql="delete from appointment_scheduler where a_s_username=?";

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


    public void Admin_logged_in(ActionEvent event) throws IOException {
     //   Parent root = load(getClass().getResource("Admin_logged_in.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin_logged_in.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800,600);
       // scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

        public void switchToScene1(ActionEvent event) throws IOException {
         //   Parent root = load(getClass().getResource("Scene1.fxml"));
            stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),800,600);
          //  scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }










    }





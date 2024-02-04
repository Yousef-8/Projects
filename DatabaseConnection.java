package ConnectionDB;

import com.example.sihha19.*;
import javafx.collections.*;

import javax.print.*;
import java.sql.*;

public class DatabaseConnection {

    public Connection connection;


    public static ObservableList<Doctor> getData() {
        ObservableList<Doctor> list = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();

        try{
            PreparedStatement pst =con.prepareStatement("select *from doctor");
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
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
                list.add(doctor);
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public static ObservableList<AppointmentScheduler> getDataApp() {
        ObservableList<AppointmentScheduler> list = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();

        try{
            PreparedStatement pst =con.prepareStatement("select *from appointment_scheduler");
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
                AppointmentScheduler app= new AppointmentScheduler();



                app.setUsername(rst.getString("a_s_username"));
                app.setPassword(rst.getString("a_s_password"));
                app.setFullname(rst.getString("a_s_fullname"));
                app.setGender(rst.getString("a_s_gender"));
                app.setAge(rst.getString("a_s_age"));
                app.setPhone(rst.getString("a_s_phone"));
                app.setEmail(rst.getString("a_s_email"));

                list.add(app);
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }







    public static ObservableList<DocPatApp> getDatadocpatapp() {
        ObservableList<DocPatApp> list = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();

        try{
            PreparedStatement pst =con.prepareStatement("select *from apt_scheduler_makes_appointment");
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
                DocPatApp dpa= new DocPatApp();




                dpa.setPat(rst.getString("p_name"));
                dpa.setPho(rst.getString("p_phone"));
                dpa.setDoc(rst.getString("d_name"));
                dpa.setDate(rst.getString("apt_date"));
                dpa.setTime(rst.getString("apt_time"));
                dpa.setPrice(rst.getString("apt_price"));


                list.add(dpa);
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }


    public static ObservableList<Test> getDatatestpatapp() {
        ObservableList<Test> list = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();

        try{
            PreparedStatement pst =con.prepareStatement("select *from apt_scheduler_makes_test");
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
                Test tpa= new Test();



                tpa.setTest(rst.getString("test_name"));
                tpa.setPat(rst.getString("test_pat"));
                tpa.setPho(rst.getString("test_pho"));
                tpa.setDate(rst.getString("test_date"));
                tpa.setTime(rst.getString("test_time"));
                tpa.setPrice(rst.getString("test_price"));

                list.add(tpa);
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }


    public static ObservableList<Patient> getDatapat() {
        ObservableList<Patient> list = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();

        try{
            PreparedStatement pst =con.prepareStatement("select *from apt_scheduler_makes_test");
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
                Patient patient= new Patient();



                patient.setPat(rst.getString("test_pat"));
                patient.setPho(rst.getString("test_pho"));
                patient.setDate(rst.getString("test_date"));
                patient.setTime(rst.getString("test_time"));


                list.add(patient);
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }



    public static ObservableList<DocPatAppReq> getDatadocpatappreq() {
        ObservableList<DocPatAppReq> list = FXCollections.observableArrayList();

        DatabaseConnection dBconnect= new DatabaseConnection();
        Connection con = dBconnect.getConnection();

        try{
            PreparedStatement pst =con.prepareStatement("select *from patient_makes_appointment_without_login");
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
                DocPatAppReq dpar= new DocPatAppReq();



                dpar.setPat(rst.getString("p_fullname"));
                dpar.setPho(rst.getString("p_pho"));
                dpar.setDoc(rst.getString("doctor"));
                dpar.setDate(rst.getString("preferred_date"));
                dpar.setTime(rst.getString("preferred_time"));


                list.add(dpar);
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }




    public Connection getConnection() {
        String Dbname="sihha_database";
        String Username="admin";
        String Password="123;
        String url="jdbc:mysql://localhost:3306/"+Dbname;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection= DriverManager.getConnection(url,Username,Password);
        }catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
            //System.out.println("error");
        }

        return connection;
    }


}

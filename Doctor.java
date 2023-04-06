package com.example.sihha19;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Doctor {


    private StringProperty username;
    private StringProperty password;
    private StringProperty  fullname;
    private  StringProperty  gender;
    private  StringProperty age;
    private  StringProperty phone;
    private StringProperty email;
    private StringProperty qualification;

    private StringProperty department;

    private StringProperty days;

    private StringProperty time;



    public Doctor(/*String username,String password,  String  fullname, String  gender,String  age, String phone, String  email, String  qualification, String  department, String  days, String time*/)
    {
        username = new SimpleStringProperty(this,"username");
        password = new SimpleStringProperty(this,"password");
        fullname = new SimpleStringProperty(this,"fullname");
        gender = new SimpleStringProperty(this,"gender");
        age = new SimpleStringProperty(this,"age");
        phone = new SimpleStringProperty(this,"phone");
        email = new SimpleStringProperty(this,"email");
        qualification = new SimpleStringProperty(this,"qualification");
        department = new SimpleStringProperty(this,"department");
        days = new SimpleStringProperty(this,"date");
        time = new SimpleStringProperty(this,"time");


    }

    public String getUsername() {
        return username.get();
    }
    public StringProperty usernameProperty() {
        return username;
    }
    public void setUsername(String username) {
        this.username.set(username);
    }



    public String getPassword() {return password.get();}
    public StringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {this.password.set(password);}


    public String getFullname() {return fullname.get();}

    public StringProperty fullnameProperty() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname.set(fullname);
    }





    public String getGender() {
        return gender.get();
    }

    public StringProperty genderProperty() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }





    public String getAge() {
        return age.get();
    }

    public StringProperty ageProperty() {
        return age;
    }

    public void setAge(String age) {
        this.age.set(age);
    }




    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }





    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }





    public String getQualification() {
        return qualification.get();
    }

    public StringProperty qualificationProperty() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification.set(qualification);
    }






    public String getDepartment() {
        return department.get();
    }

    public StringProperty departmentProperty() {
        return department;
    }

    public void setDepartment(String department) {
        this.department.set(department);
    }




    public String getDays() {
        return days.get();
    }

    public StringProperty daysProperty() {
        return days;
    }

    public void setDays(String days) {
        this.days.set(days);
    }



    public String getTime() {
        return time.get();
    }

    public StringProperty timeProperty() {
        return time;
    }

    public void setTime(String time) {
        this.time.set(time);
    }




}



package com.example.sihha19;

import javafx.beans.property.*;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AppointmentScheduler {




        private StringProperty username;
        private StringProperty password;
        private StringProperty  fullname;
        private  StringProperty  gender;
        private  StringProperty age;
        private  StringProperty phone;
        private StringProperty email;




        public AppointmentScheduler(/*String username,String password,  String  fullname, String  gender,String  age, String phone, String  email*/)
        {
            username = new SimpleStringProperty(this,"username");
            password = new SimpleStringProperty(this,"password");
            fullname = new SimpleStringProperty(this,"fullname");
            gender = new SimpleStringProperty(this,"gender");
            age = new SimpleStringProperty(this,"age");
            phone = new SimpleStringProperty(this,"phone");
            email = new SimpleStringProperty(this,"email");



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






    }







package com.example.sihha19;

import javafx.beans.property.*;

public class Patient {

    private StringProperty pat;
    private StringProperty pho;
    private StringProperty  date;
    private  StringProperty  time;





    public Patient(/*String username,String password,  String  fullname, String  gender,String  age, String phone, String  email, String  qualification, String  department, String  days, String time*/)
    {
        pat = new SimpleStringProperty(this,"pat");
        pho = new SimpleStringProperty(this,"pho");
        date = new SimpleStringProperty(this,"date");
        time = new SimpleStringProperty(this,"time");


    }

    public String getPat() {
        return pat.get();
    }
    public StringProperty patProperty() {
        return pat;
    }
    public void setPat(String pat) {
        this.pat.set(pat);
    }



    public String getPho() {return pho.get();}
    public StringProperty phoProperty() {
        return pho;
    }

    public void setPho(String pho) {this.pho.set(pho);}



    public String getDate() {return date.get();}

    public StringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
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

package com.example.sihha19;

import javafx.beans.property.*;

public class Test {


    private StringProperty test;
    private StringProperty pat;
    private StringProperty  pho;
    private  StringProperty date ;
    private  StringProperty time;
    private  StringProperty price;

    private  StringProperty notes;





    public Test(/*String username,String password,  String  fullname, String  gender,String  age, String phone, String  email, String  qualification, String  department, String  days, String time*/)
    {
        test = new SimpleStringProperty(this,"test");
        pat = new SimpleStringProperty(this,"pat");
        pho = new SimpleStringProperty(this,"pho");
        date = new SimpleStringProperty(this,"date");
        time = new SimpleStringProperty(this,"time");
        price = new SimpleStringProperty(this,"price");
        notes = new SimpleStringProperty(this,"notes");



    }

    public String getTest() {
        return test.get();
    }
    public StringProperty testProperty() {
        return test;
    }
    public void setTest(String test) {
        this.test.set(test);
    }



    public String getPat() {return pat.get();}
    public StringProperty patProperty() {
        return pat;
    }

    public void setPat(String pat) {this.pat.set(pat);}



    public String getPho() {return pho.get();}

    public StringProperty phoProperty() {
        return pho;
    }

    public void setPho(String pho) {
        this.pho.set(pho);
    }





    public String getDate() {
        return date.get();
    }

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




    public String getPrice() {
        return price.get();
    }

    public StringProperty priceProperty() {
        return price;
    }

    public void setPrice(String price) {
        this.price.set(price);
    }


    public String getNotes() {
        return notes.get();
    }

    public StringProperty notesProperty() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }







}

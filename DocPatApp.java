package com.example.sihha19;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class DocPatApp {



    private StringProperty doc;
    private StringProperty pat;
    private StringProperty  pho;
    private  StringProperty  date;
    private  StringProperty time;
    private  StringProperty price;




    public DocPatApp(/*String username,String password,  String  fullname, String  gender,String  age, String phone, String  email, String  qualification, String  department*/)
    {
        doc = new SimpleStringProperty(this,"d_name");
        pat = new SimpleStringProperty(this,"p_name");
        pho = new SimpleStringProperty(this,"p_phone");
        date = new SimpleStringProperty(this,"apt_date");
        time = new SimpleStringProperty(this,"apt_time");
       price = new SimpleStringProperty(this,"apt_price");



    }

    public String getDoc() {
        return doc.get();
    }
    public StringProperty docProperty() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc.set(doc);
    }



    public String getPat() {return pat.get();}
    public StringProperty patProperty() {
        return pat;
    }

    public void setPat(String pat) {this.pat.set(pat);}




    public String getPho() {return pho.get();}

    public StringProperty  phoProperty() {
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






}




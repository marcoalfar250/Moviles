package mobile.una.com.lab2.model;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by dcortes on 19/3/18.
 */

public class Payment extends SugarRecord<Payment> implements Serializable {

    String card_number, expiration, cvc, name, location, address;

    public Payment(){

    }

    public Payment(String card_number, String expiration, String cvc,
                   String name, String location, String address) {
        this.card_number = card_number;
        this.expiration = expiration;
        this.cvc = cvc;
        this.name = name;
        this.location = location;
        this.address = address;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

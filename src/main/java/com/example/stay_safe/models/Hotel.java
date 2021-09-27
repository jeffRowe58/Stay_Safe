package com.example.stay_safe.models;

import javax.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long hotel_id;

    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false, length = 15)
    private String phone;

    @Column(nullable = false, length = 60)
    private String address;

    @Column(nullable = false, length = 40)
    private String city;

    @Column(nullable = false, length = 2)
    private String state;

    @Column(nullable = false, length = 5)
    private String zip_code;

    public Hotel() {
    }

    public String getName() {
        return name;
    }

    public Hotel(String name, String phone, String address, String city, String state, String zip_code) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
}

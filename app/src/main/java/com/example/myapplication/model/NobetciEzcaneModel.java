package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NobetciEzcaneModel {
    @SerializedName("Sehir")
    public String city;
    @SerializedName("ilce")
    public String town;
    @SerializedName("EczaneAdi")
    public String name;
    @SerializedName("Adresi")
   public String address;
    @SerializedName("Telefon")
    public String phone;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


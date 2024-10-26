package com.company.model.ex_1;

public class People {
    private String first_name;
    private String last_name;
    private String middle_name;
    private String date_birthday;
    private String number_phone;
    private String city;
    private String country;
    private String address;

    public People() {
        this.first_name = "";
        this.last_name = "";
        this.middle_name = "";
        this.date_birthday = "";
        this.city = "";
        this.number_phone = "";
        this.country = "";
        this.address = "";
    }

    public People(String first_name, String last_name, String middle_name, String date_birthday, String city, String number_phone, String country, String address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.date_birthday = date_birthday;
        this.city = city;
        this.number_phone = number_phone;
        this.country = country;
        this.address = address;
    }

    @Override
    public String toString() {
        return "People{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", date_birthday='" + date_birthday + '\'' +
                ", number_phone='" + number_phone + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getDate_birthday() {
        return date_birthday;
    }

    public void setDate_birthday(String date_birthday) {
        this.date_birthday = date_birthday;
    }

    public String getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


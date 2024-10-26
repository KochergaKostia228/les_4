package com.company.model.ex_2;

public class City {
    private String name_city;
    private String name_region;
    private String name_country;
    private int count_people;
    private int mail_index;
    private String phone_code;

    public City() {
        this.name_city = "";
        this.name_region = "";
        this.name_country = "";
        this.mail_index = 0;
        this.count_people = 0;
        this.phone_code = "";
    }

    public City(String name_city, String name_region, String name_country, int mail_index, int count_people, String phone_code) {
        this.name_city = name_city;
        this.name_region = name_region;
        this.name_country = name_country;
        this.mail_index = mail_index;
        this.count_people = count_people;
        this.phone_code = phone_code;
    }

    @Override
    public String toString() {
        return "City{" +
                "name_city='" + name_city + '\'' +
                ", name_region='" + name_region + '\'' +
                ", name_country='" + name_country + '\'' +
                ", count_people=" + count_people +
                ", mail_index=" + mail_index +
                ", phone_code='" + phone_code + '\'' +
                '}';
    }

    public String getName_city() {
        return name_city;
    }

    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

    public String getName_region() {
        return name_region;
    }

    public void setName_region(String name_region) {
        this.name_region = name_region;
    }

    public String getName_country() {
        return name_country;
    }

    public void setName_country(String name_country) {
        this.name_country = name_country;
    }

    public int getCount_people() {
        return count_people;
    }

    public void setCount_people(int count_people) {
        this.count_people = count_people;
    }

    public int getMail_index() {
        return mail_index;
    }

    public void setMail_index(int mail_index) {
        this.mail_index = mail_index;
    }

    public String getPhone_code() {
        return phone_code;
    }

    public void setPhone_code(String phone_code) {
        this.phone_code = phone_code;
    }
}

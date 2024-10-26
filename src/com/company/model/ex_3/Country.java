package com.company.model.ex_3;

import com.company.model.ex_2.City;

import java.util.Arrays;

public class Country {
    private String name_country;
    private String contingent_country;
    private int count_people;
    private String phone_code;
    private String name_capital;
    private City[] cities;

    public Country() {
        this.name_country = "";
        this.contingent_country = "";
        this.count_people = 0;
        this.phone_code = "";
        this.name_capital = "";
    }

    public Country(String name_country, String contingent_country, int count_people, String phone_code, String name_capital, City[] cities1) {
        this.name_country = name_country;
        this.contingent_country = contingent_country;
        this.count_people = count_people;
        this.phone_code = phone_code;
        this.name_capital = name_capital;
        this.cities = cities1;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name_country='" + name_country + '\'' +
                ", contingent_country='" + contingent_country + '\'' +
                ", count_people=" + count_people +
                ", phone_code='" + phone_code + '\'' +
                ", name_capital='" + name_capital + '\'' +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }

    public String getName_country() {
        return name_country;
    }

    public void setName_country(String name_country) {
        this.name_country = name_country;
    }

    public String getContingent_country() {
        return contingent_country;
    }

    public void setContingent_country(String contingent_country) {
        this.contingent_country = contingent_country;
    }

    public int getCount_people() {
        return count_people;
    }

    public void setCount_people(int count_people) {
        this.count_people = count_people;
    }

    public String getPhone_code() {
        return phone_code;
    }

    public void setPhone_code(String phone_code) {
        this.phone_code = phone_code;
    }

    public String getName_capital() {
        return name_capital;
    }

    public void setName_capital(String name_capital) {
        this.name_capital = name_capital;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}

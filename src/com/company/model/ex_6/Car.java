package com.company.model.ex_6;

public class Car {
    private String name_car;
    private String name_manufacturer;
    private String year_release;
    private double engine_capacity;

    public Car(String name_car, String name_manufacturer, String year_release, double engine_capacity) {
        this.name_car = name_car;
        this.name_manufacturer = name_manufacturer;
        this.year_release = year_release;
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name_car='" + name_car + '\'' +
                ", name_manufacturer='" + name_manufacturer + '\'' +
                ", year_release='" + year_release + '\'' +
                ", engine_capacity=" + engine_capacity +
                '}';
    }

    public String getName_car() {
        return name_car;
    }

    public void setName_car(String name_car) {
        this.name_car = name_car;
    }

    public String getName_manufacturer() {
        return name_manufacturer;
    }

    public void setName_manufacturer(String name_manufacturer) {
        this.name_manufacturer = name_manufacturer;
    }

    public String getYear_release() {
        return year_release;
    }

    public void setYear_release(String year_release) {
        this.year_release = year_release;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }
}

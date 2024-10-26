package com.company.model.ex_5;

public class Book {
    private String name_book;
    private FIO fio;
    private String year_release;
    private String name_publishing_house;
    private String genre;
    private int count_pages;

    public Book(String name_book, FIO fio, String year_release, String genre, String name_publishing_house, int count_pages) {
        this.name_book = name_book;
        this.fio = fio;
        this.year_release = year_release;
        this.genre = genre;
        this.name_publishing_house = name_publishing_house;
        this.count_pages = count_pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name_book='" + name_book + '\'' +
                ", fio=" + fio.getFirst_name() + " " + fio.getLast_name() + " " + fio.getMiddle_name() +
                ", year_release='" + year_release + '\'' +
                ", name_publishing_house='" + name_publishing_house + '\'' +
                ", genre='" + genre + '\'' +
                ", count_pages=" + count_pages +
                '}';
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public FIO getFio() {
        return fio;
    }

    public void setFio(FIO fio) {
        this.fio = fio;
    }

    public String getYear_release() {
        return year_release;
    }

    public void setYear_release(String year_release) {
        this.year_release = year_release;
    }

    public String getName_publishing_house() {
        return name_publishing_house;
    }

    public void setName_publishing_house(String name_publishing_house) {
        this.name_publishing_house = name_publishing_house;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCount_pages() {
        return count_pages;
    }

    public void setCount_pages(int count_pages) {
        this.count_pages = count_pages;
    }
}

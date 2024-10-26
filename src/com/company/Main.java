package com.company;

import com.company.model.ex_2.City;
import com.company.model.ex_3.Country;
import com.company.model.ex_4.Fraction;
import com.company.model.ex_5.Book;
import com.company.model.ex_5.FIO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Country country = new Country("122", "123", 123, "123", "123", new City[]{
                new City("123", "123", "123", 123, 123, "123"),
                new City("222", "222", "222", 222, 222, "222"),
        });
        System.out.print(country.toString());
    }
}
package com.company.model.ex_4;

public class Fraction {
    private int numerical;
    private int denominator;

    public Fraction(int numerical, int denominator) {
        if(denominator != 0){
            this.numerical = numerical;
            this.denominator = denominator;
            simplify(); // спростити дріб при створенні
        }
    }

    // Метод для спрощення дробу
    private void simplify() {
        int gcd = gcd(numerical, denominator);
        numerical /= gcd;
        denominator /= gcd;
    }

    // Метод для обчислення найбільшого спільного дільника
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public Fraction dodateFractions(Fraction other){
        int newNumerator = this.numerical * other.denominator + other.numerical * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minusFractions(Fraction other){
        int newNumerator = this.numerical * other.denominator - other.numerical * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiplyFractions(Fraction other){
        int newNumerator = this.numerical * other.numerical;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divisionFractions(Fraction other){
        int newNumerator = this.numerical * other.denominator;
        int newDenominator = this.denominator * other.numerical;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return "Fraction{ " +
                numerical + "/"+
                denominator +
                " }";
    }

    public int getNumerical() {
        return numerical;
    }

    public void setNumerical(int numerical) {
        this.numerical = numerical;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}

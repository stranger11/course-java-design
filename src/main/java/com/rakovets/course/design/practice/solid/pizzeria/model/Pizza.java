package com.rakovets.course.design.practice.solid.pizzeria.model;

public class Pizza {
    private int number;
    private String name;
    private String cheese;
    private String meat;
    private String vegetables;
    private String dough;
    private String sause;
    private String additionally;
    private double price;

    public Pizza(int number, String name, String cheese, String meat, String vegetables,
                 String dough, String sause, String additionally, double price) {
        this.number = number;
        this.name = name;
        this.cheese = cheese;
        this.meat = meat;
        this.vegetables = vegetables;
        this.dough = dough;
        this.sause = sause;
        this.additionally = additionally;
        this.price = price;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSause() {
        return sause;
    }

    public void setSause(String sause) {
        this.sause = sause;
    }

    @Override
    public String toString() {
        return "\n pizza " + number + ": " + name + ", ingredients: " + cheese + ", " + meat + ", " + vegetables +
                "\n" + "        " + dough + ", " + sause + ", " + additionally + ", price: " + price;
    }

    public String getAdditionally() {
        return additionally;
    }

    public void setAdditionally(String additionally) {
        this.additionally = additionally;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
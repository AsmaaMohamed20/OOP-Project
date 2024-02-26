/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invoice;

public abstract class FootballShop {
    String brand;
    double price;
    int quantity;

    public FootballShop() {
    }

    public FootballShop(String brand, double price, int quantity) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public abstract void display();
    public abstract double calcPrice();

}

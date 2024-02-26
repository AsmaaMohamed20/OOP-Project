/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invoice;

public class Boots extends FootballShop implements DiscConsiderable{
    int size;
    public Boots() {
    }

    public Boots( String brand, double price, int quantity ,int size) {
        super(brand, price, quantity);
        this.size = size;
    }

    @Override
    public double calcDisc() {
        double tot=price*(double)quantity;
        return tot-RATE*tot ;
    }
    
    @Override
    public double calcPrice() {
        return calcDisc();     
    }

    @Override
    public void display() {
        System.out.println("SOCCER BOOTS");
        System.out.println("Brand: "+brand);
        System.out.println("Price: $"+price+" for size "+size);
        System.out.println("Discount: 17.0%");
        System.out.println("Quantity: "+quantity);
        System.out.println("Subtotal: $"+ calcPrice()); 
        System.out.println(" ");
    } 
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invoice;

import java.util.Scanner;


public class SoccerBall extends FootballShop{
    int ballType;
    public SoccerBall() {
    }

    public SoccerBall( String brand, double price, int quantity,int ballType ) {
        super(brand, price, quantity);
        this.ballType = ballType;
    }

    String Type;
    Scanner scan=new Scanner(System.in);
    
    
    @Override
    public double calcPrice() {
        switch(ballType){
            case 1 ->  {price=200; break; }
            case 2 ->  {price=80; break;}
            case 3 ->  {price=50; break;}
            case 4 ->  {price=20; break;}   
        }
        return price*quantity ;
    }
    
    @Override
    public void display()throws NotBallTypeException {
        NotBallTypeException problem=new NotBallTypeException( "Not a valid soccer ball type, Changing ball type to training ball");
       while(ballType >4){
        try{
                throw problem;
            }
        catch(NotBallTypeException ex){  
            System.out.println("SOCCER BALL");
            System.out.println("Brand :"+brand);
            System.out.println(ballType +" "+ex.getMessage());
            ballType=scan.nextInt();
            }
       }
       switch(ballType){
            case 1 ->  {price=200; Type="Professional Match"; break;}
            case 2 ->  {price=80; Type="Match"; break;}
            case 3 ->  {price=50; Type="Traning"; break;}
            case 4 ->  {price=20; Type="Recreational"; break; }
        }
       
        System.out.println("SOCCER BALL");
        System.out.println("Brand :"+brand);
        System.out.println("Type :"+Type);
        System.out.println("Price :$"+price);
        System.out.println("No Discount!");
        System.out.println("Quantity :"+quantity);
        System.out.println("Subtotal: $"+ calcPrice());
        System.out.println(" ");
        
    }
    
    
}
    


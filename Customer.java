/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invoice;
import java.util.ArrayList;


public class Customer {
    String custName;
    ArrayList <FootballShop> itemList;
    int numOfItems=1;
    double totalPay;

    public Customer(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void buy (FootballShop product){
            itemList =new ArrayList <>();
            itemList.add(product);
            System.out.println("Item "+ numOfItems);
            numOfItems++;
            product.display();
            totalPay += product.calcPrice();  
    }

    @Override
    public String toString() {
        return "Welcome "+custName+"\n \n List of Football Items Bought \n \n " ;
    }
    
    public void print(){
        System.out.println("Total= $"+totalPay );
    }
     
}


/*
    FootballShop[] itemList;
    public void buy (FootballShop product){
        itemList=new FootballShop[10] ;
        itemList[numOfItems]=product;
        System.out.println("Item "+ numOfItems);
        numOfItems++;
        product.display();
        totalPay += product.calcPrice();
    }
*/

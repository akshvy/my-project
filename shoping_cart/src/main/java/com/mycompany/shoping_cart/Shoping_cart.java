/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoping_cart;

/**
 *
 * @author akshay
 */
import java.util.Scanner;

public class Shoping_cart {

    public static void main(String[] args) {
        
        // SHOPING CART PROGRAM
            Scanner scan = new Scanner(System.in);
            String item;
            double price;
            int quantity;
            char currency = '$';
            double total;
            
            System.out.print("What item would you like to buy? : ");
            item = scan.nextLine();
            
            System.out.print("What is the price for each? : ");
            price = scan.nextDouble();
            
            System.out.print("what's the quantity you purchased? : ");
            quantity = scan.nextInt();
            
            total = price * quantity;
            
            System.out.println("\nYou have bought " + quantity + " " + item + "/s");
            System.out.println("Your total is " + currency + total);
            
            
            scan.close();
        }    
      
    }


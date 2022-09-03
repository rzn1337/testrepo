/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itpassignment.pkg1;

import java.util.Scanner;

/**
 *
 * @author Syed Ali Rizwan
 */
public class ITPAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
       Scanner input = new Scanner (System.in);
        
       System.out.print("Please enter the nine digit code: ");

       int x = input.nextInt();
       
        int d2 = x % 10;
        int d3 = (x % 100) / 10;
        int d4 = (x % 1000) / 100;
        int d5 = (x % 10000) / 1000;
        int d6 = (x % 100000) / 10000;
        int d7 = (x % 1000000) / 100000;
        int d8 = (x % 10000000) / 1000000;
        int d9 = (x % 100000000) / 10000000;
        int d10 =(x % 1000000000) / 100000000;        
       
        int y = (d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9)+(d10*10);
        
        int remainder = y%11;
        
        int d1 = 11 - remainder;
        
        System.out.println("The ISBN-10 code is: " + d10 + d9 + d8 + d7 + d6 + d5 + d4 + d3 + d2 + d1 );
        
        
        
        
        
    }
    }
        
        

        
        
        
        
        
        
        
        
        
        
        
       
    
    


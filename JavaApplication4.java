/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a denary positive digit: ");
        int denary = input.nextInt();
        int binary = 0;
        int count;
        
        for (count = 128;count>=1;count/=2){
            if (denary/count>0) {
                binary = binary*10 + 1;
                denary = denary%count;
            } else {
                binary = binary*10;
            }
        }
        
    
        System.out.println("Your number in binary is: " + binary);
            
            
        
        
        }
        
        
    }
    


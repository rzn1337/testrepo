/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi.calculator;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        
        if (age < 16) {
            System.out.println("BMI cannot be calculated for children below 16");
            System.exit(1);
        }    
        
        
        System.out.print("Enter your Weight: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your Height: ");
        double height = input.nextDouble();
        
        double bmi = (weight/(Math.pow(height, height)));
        
        if ( bmi < 18.5) {
           System.out.print("You are Underweight");
        }
        else if ((bmi >= 18.5) && (bmi <= 25.0)) {
                System.out.println("You are Normal");         
        }  
        else if ((bmi >= 25.0)&&(bmi <= 30.0)) {
                System.out.println("You are Overweight");
        }
        else if ( bmi > 30.0) {
                System.out.println("You are Obese");
        }
            
            
    
        
        
        
        
        
        
    }
    }
    


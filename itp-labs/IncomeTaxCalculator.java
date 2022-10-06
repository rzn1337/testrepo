/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package income.tax.calculator;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class IncomeTaxCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Single filer: S, Married filing Jointly: J, Married filing Separately: M, Head of Household filer: H");
        System.out.println("Please enter your status: " );
        char status = input.next().charAt(0);
        
        
        System.out.println("Please Enter your annual income: ");
        double income = input.nextDouble();
        double netincome = 1;
        
        switch (status) 
        {
            case 's': case 'S':
            {
                if (income > 0 && income <= 8350){
                netincome = income*0.90;   
                }
                else if (income > 8350 && income <= 33950){
                netincome = income*0.85;
                }
                else if (income > 33951 && income <= 82250){
                netincome = income*0.75; 
                }
                else if (income > 82250 && income <= 171550){
                netincome = income*0.72;  
                }
                else if (income > 171550 && income <= 372950){
                netincome = income*0.67;
                }
                else if (income > 372950){
                netincome = income*0.65; 
                }
            }
                break;
                
            
            case 'j': case 'J':
            {    
                if (income > 0 && income <= 16700){
                netincome = income*0.90;   
                }
                else if (income > 16700 && income <= 67900){
                netincome = income*0.85;
                }
                else if (income > 67900 && income <= 137050){
                netincome = income*0.75; 
                }
                else if (income > 137050 && income <= 208850){
                netincome = income*0.72;  
                }
                else if (income > 208850 && income <= 372950){
                netincome = income*0.67;
                }
                else if (income > 372950){
                netincome = income*0.65; 
                } 
                break;
            }
            case 'm': case 'M':
            {   if (income > 0 && income <= 8350){
                netincome = income*0.90;   
                }
                else if (income > 8350 && income <= 33950){
                netincome = income*0.85;
                }
                else if (income > 33950 && income <= 68525){
                netincome = income*0.75; 
                }
                else if (income > 68525 && income <= 104425){
                netincome = income*0.72;  
                }
                else if (income > 104425 && income <= 186475){
                netincome = income*0.67;
                }
                else if (income > 186475){
                netincome = income*0.65; 
                } 
                break;
            }
            case 'h': case 'H':
            {   
                if (income > 0 && income <= 11950){
                netincome = income*0.90;   
                }
                else if (income > 11950 && income <= 45500 ){
                netincome = income*0.85;
                }
                else if (income > 45500 && income <= 117450){
                netincome = income*0.75; 
                }
                else if (income > 117450 && income <= 190200){
                netincome = income*0.72;  
                }
                else if (income > 190200 && income <= 372950){
                netincome = income*0.67;
                }
                else if (income > 372950){
                netincome = income*0.65; 
                }
                break;
            }
            
            
            
            
            
          
            
        }   
               
            
            
           
        
         
        System.out.println("Your Net Salary is: " + netincome);
        
        
       
        
        
        
        
        
    }
    
}

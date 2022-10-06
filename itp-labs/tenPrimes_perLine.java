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
        int x = 2;
        int c = 0;
        for(int i = 1; i<=50; )
        {
            boolean notprime = false;
            for (int j = 2; j<x; j++)
            {
                if(x%j == 0)
                {
                    notprime = true;
                    break;
                    
                }
            }
            if (notprime != true)
            {
                i++;
                System.out.print(x + ", ");
                c++;
                
                
            }
            x++;
            if (c%10==0)
            {
                System.out.println();
            }
           
                
            }
 
        
        }
        
        
            
            
            
            
            
            
        }
        
    
    


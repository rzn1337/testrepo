/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        char ch;
        do{
        int number = (int) (Math.random()*101); //when multiplied by 101, 100 can also be a number but not in the case of multiplied by 100
        
        int attempt = 1;
        
        System.out.println(number);
       
        
        while (attempt<6){
           
            System.out.print("Guess the number: ");
            int guess = input.nextInt();
            if (guess<number){
                System.out.println("Low!");
            }else if (guess>number){
                System.out.println("High!");
            }else{
                System.out.println("You guessed it right!The number was: " + number);
                break;
            }
            attempt++;
            }
            if (attempt>5){
            System.out.println("You have used all the five attempts!");
            }
            System.out.println("Do you want to restart the game? Press Y to restart and N to exit: ");
            ch = input.next().charAt(0);
        }while(ch=='y'||ch=='Y');
        
        
        }
        
            
            
           
           
       
        }

        
        
        
        
    
    


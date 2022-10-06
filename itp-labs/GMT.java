/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Syed Ali Rizwan
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
    
    long totalMilliseconds = System.currentTimeMillis();
    
    long timeinsecs = totalMilliseconds/1000;
    
    long secs = ((timeinsecs)%60);
    
    long mins = ((timeinsecs/60)%60);
    
    long hrs = ((timeinsecs/3600)%24);
    
    System.out.println(hrs+":"+mins+":"+secs);
    }
    
}

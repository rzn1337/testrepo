/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ramanujan;

import java.util.*;

/**
 *
 * @author Ali
 */
public class Ramanujan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();

    int a;
    int b; 
    int c; 
    int d; 
    int cubea;
    int cubeb;
    int cubec;
    int cubed;

    for (a = 1; a <= num; a++) {
      cubea = (int) Math.pow(a,3);
      if (cubea > num) break;

      for (b = a; b <= num; b++) {
        cubeb = (int) Math.pow(b,3);
        if (cubea + cubeb > num) break;

          for (c = a + 1; b <= num; c++) {
            cubec = (int) Math.pow(c,3);
            if (cubec > cubea + cubeb) break;

            for (d = c; d <= num; d++) {
              cubed = (int) Math.pow(d,3);
              if (cubec + cubed > cubea + cubeb) break;

              if (cubea + cubeb == cubed + cubec) {
                  System.out.println(cubea+cubeb);
                  System.out.println(a+","+b+","+c+","+d);
              }
            }
          }
      }
    }
  }
}

        
        
        
        
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    


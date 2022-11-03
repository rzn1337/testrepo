package javaapplication1;
public class JavaApplication1 {    
    public static void main(String[] args) {        
        char [] arrnew = new char[100];
        arrnew = randomchar();
        int [] count = new int [26];
        int cunt = 0;
        for (int i = 0; i < 26; i++) {
            cunt = 0;
            for (int j = 0; j < 100; j++) {
                if ((int)arrnew[j] - 97 == i) {
                   cunt++;                                 
                }         
                count[i] = cunt;
            }    
            System.out.println("number of " + ((char) (i + 97)) + " is " + count[i]);
        }             
    }    
    public static char[] randomchar() {
            char[] arr = new char[100];
                for (int i = 0; i < 100; i++) {
                    arr[i] = (char)(97+Math.random()*26);
                }                      
    return arr;
    }    
}

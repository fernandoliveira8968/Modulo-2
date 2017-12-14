
package fatorial;

import java.util.Scanner;


public class Fatorial {

    
    public static void main(String[] args) {
    int n, fat=1;
    Scanner lerS = new Scanner (System.in);
    System.out.print("Digite um numero inferior a 32");
    n = lerS.nextInt();
    for (int m=n; m>=1; m--)
        fat*=m;
    System.out.printf(" %d! = %d ", n, fat);
             
    }
 
}

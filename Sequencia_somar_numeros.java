
package javaapplication5;
import java.util.Scanner;
import java.util.scanner;
public class JavaApplication5 {

    public static void main(String[] args) {
       Scanner Ler =  new Scanner (System.in);
    int soma=0;
    int numeros;
    System.out.print("Quantos o numeros  quer somar ?");
    numeros =Ler.nextInt();
    
    for (int I=1;I<=numeros; I++){
        soma += I;
        
    }
    
System.out.print(soma);

     
             
    }
    
}


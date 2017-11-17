
package javaapplication1;



import java.io.InputStream;
import java.util.Scanner;

public class JavaApplication1 {
private static Scanner ler;
    
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
       double q,w,e;
       double max=0;
       System.out.print("Qual o primeiro número?");
               q = ler.nextDouble ();
       System.out.print("Qual o segundo número?");
               w = ler.nextDouble();
       System.out.print("Qual o segundo numero?");
                e = ler.nextDouble(); 
       
        if (q>w && q>e)
        max = q;
        if (w>q && w>e)
        max = w;
        if (e>w && e>q)
        max = e;

        System.out.print("O maior numero é:"+max);                 
               
               
               
    }

    private static Scanner newScanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

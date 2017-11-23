
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

    
public class JavaApplication2 {

    
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);
        Scanner ler2 = new Scanner (System.in);
        double nota1, nota2;
        double notafinal;
        
        
        
        System.out.print("Qual o nome do aluno?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nome = in.readLine();
        System.out.print("Qual a primeira nota?");
        nota1 = ler.nextDouble ();  
        System.out.print("Qual a segunda nota?");
        nota2 = ler.nextDouble ();
        notafinal = nota2*0.40+0.6*nota1;
        
        if (notafinal<0)
        System.out.print("Nota inválida");
        if (notafinal>20)
        System.out.print("Nota inválida");    
        else
        if (notafinal<10)
        System.out.println("A nota final da "+nome+" é "+notafinal+" e está reprovada");
         else
        System.out.println("A nota final da " +nome+" é "+notafinal+" e está aprovada");
        
         
        
        
        
    
    }

    private static double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static string next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

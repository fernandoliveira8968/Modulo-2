package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double n1;
        double n2;
        double total=0;
        String operacoes;

        System.out.println(" CALCULADORA ");
        System.out.print("Digite o primeiro numero");
        n1 = Ler.nextDouble();

        System.out.print("Digite o segundo numero");
        n2 = Ler.nextDouble();

        System.out.print("Digite a operção que quer:");
        operacoes = Ler.next();
        switch (operacoes) {
            case "+":
                total = n1 + n2;
                break;
            case "-":
                total = n1 - n2;
                break;
            case "*":
                total = n1 * n2;
                break;
            case "/":
                total = n1 / n2;
                break;
        }
                System.out.print("O Resultado é: " + total);
        
    }
}

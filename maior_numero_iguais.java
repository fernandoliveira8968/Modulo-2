package PSII;

import java.util.Scanner;

public class maior_numero_iguais {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		double numero_1, numero_2;
		System.out.println("..:Maior Numero ou Iguais:..");
		System.out.println("Qual o primeiro numero?");
		numero_1 = dados.nextDouble();
		System.out.println("Qual o segundo numero?");
		numero_2 = dados.nextDouble();
		if (numero_1 > numero_2) 
			System.out.print("Maior Numero = " + numero_1);
		else if (numero_2 > numero_1) 
			System.out.print("Maior Numero = " + numero_2);
			else
		System.out.print("Os numeros são iguais!");	
	}	
}

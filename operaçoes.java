import java.util.Scanner;

public class operaçoes {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double numero_1, numero_2, total = 0;
		String operador;
		System.out.println("Qual o Operando 1?");
		numero_1 = dados.nextDouble();
		System.out.println("Qual o Operando 2?");
		numero_2 = dados.nextDouble();
		System.out.println("Qual o Operador?");
		operador = dados.next();		
		switch (operador) {
		case "-" :  total = numero_1 - numero_2;
		break;
		case "+" : total = numero_1 + numero_2;
		break;
		case "/" : total = numero_1 / numero_2;
		break;
		case "*" : total = numero_1 * numero_2;
		break;
		}
		System.out.println("Total = " + total);
		
	}

}

package Pacote1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaReatangulo {

	public static void main(String[] args) throws IOException {
		
		String largura = "";
		System.out.println("Digite a largura:");
		InputStreamReader LerS = new InputStreamReader (System.in);
		BufferedReader GuardaS = new BufferedReader (LerS);
		largura = GuardaS.readLine();
		
		String comprimento = "";
		System.out.println("Digite o comprimento:");
		InputStreamReader LerS1 = new InputStreamReader (System.in);
		BufferedReader GuardaS1 = new BufferedReader (LerS1);
		comprimento = GuardaS1.readLine();
		System.out.printf("A área do retângulo é: %d", Integer.valueOf(largura) * Integer.valueOf(comprimento));
	}

}

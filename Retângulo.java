package Pacote1;

import java.io.*;

public class Retângulo {

	public static void main(String[] args) throws IOException {
		System.out.println("Qual o Comprimento?");
			String C = "";
			InputStreamReader LerS = new InputStreamReader (System.in);
			BufferedReader GuardaS = new BufferedReader (LerS);
			C = GuardaS.readLine();
		System.out.println("Qual a Largura?");
			String L = "";
			InputStreamReader LerSL = new InputStreamReader (System.in);
			BufferedReader GuardaSL = new BufferedReader (LerSL);
			L = GuardaSL.readLine();
		System.out.printf("A Área é %d.", Integer.valueOf(C)*Integer.valueOf(L));

	}
}



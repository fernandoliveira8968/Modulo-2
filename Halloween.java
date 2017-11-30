package pacote1;
import java.io.*;
public class Halloween {

	public static void main(String[] args) throws IOException 
	{String C="";
System.out.println(" ||||Halloween||||");
System.out.println (" ||||Doce ou Travessura ?||||");
InputStreamReader LerS = new InputStreamReader (System.in);
BufferedReader GuardaS = new BufferedReader (LerS);
C = GuardaS.readLine();
System.out.printf("O utilizador escolheu: "+ C,args);
	}

}

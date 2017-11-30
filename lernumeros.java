package pacoteum;
import java.io.*;
public class lernumeros {

	public static void main(String[] args) throws IOException
	{String C=""; 	
	System.out.printf("Digite o numero:");
	InputStreamReader LerS = new InputStreamReader (System.in);
	BufferedReader GuardaS = new BufferedReader (LerS);
	C = GuardaS.readLine();
	System.out.printf("Digitou :%d",Integer.valueOf (C) );}}
	

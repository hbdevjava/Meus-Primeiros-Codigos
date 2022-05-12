package Controle;

import java.util.Scanner;



public class DoWhile {
	public static void main(String[] args) {
		/**
		 * ******** ANATOMIAS *******
		 * 
		 * IF ( V OU F) SENTEN�A; OU {} (BLOCO) IF DE FINE SE VAI EXECUTAR OU NAO UMA DETERMINADA SENTEN�A DE 
		 * CODIGOS
		 * WHILE ( V OU F) SENTEN�A; OU {} (BLOCO) SE A EXPRESSAO FOR VDD REPETE A SENTEN�A OU BLOCO DE COD
		 * FOR ( AS 3 PARTES)
		 * DO {} WHILE (); A UNICA QUE TERMINA COM ;
		 * 
		 * DAS 3 ESTRUTURAS DE REPETI�OES A MAIS USADA � FOR -> WHILE -> DOWHILE;
		 * 
		 * */
		Scanner entrada = new Scanner(System.in);
		 String txt = "";
		 
		do {
			System.out.print("Digite a palavra magica: ");
		
			txt = entrada.nextLine();
		} while (! txt.equalsIgnoreCase("please"));
		
		
		System.out.println("Obridado!");
		entrada.close();
	}
}

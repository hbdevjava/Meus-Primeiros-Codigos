package Controle;

import java.util.Scanner;



public class DoWhile {
	public static void main(String[] args) {
		/**
		 * ******** ANATOMIAS *******
		 * 
		 * IF ( V OU F) SENTENÇA; OU {} (BLOCO) IF DE FINE SE VAI EXECUTAR OU NAO UMA DETERMINADA SENTENÇA DE 
		 * CODIGOS
		 * WHILE ( V OU F) SENTENÇA; OU {} (BLOCO) SE A EXPRESSAO FOR VDD REPETE A SENTENÇA OU BLOCO DE COD
		 * FOR ( AS 3 PARTES)
		 * DO {} WHILE (); A UNICA QUE TERMINA COM ;
		 * 
		 * DAS 3 ESTRUTURAS DE REPETIÇOES A MAIS USADA É FOR -> WHILE -> DOWHILE;
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

package Controle;

import java.util.Scanner;

public class IfElseTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a sua Nota: ");
		int media = entrada.nextInt();
		
	
		boolean criterioAprovacao = media <= 10 && media >= 7;
		if(criterioAprovacao) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Repovado");
		}
		
		
		
		
		
		
		
		entrada.close();
		
		
		
	}
}

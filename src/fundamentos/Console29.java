package fundamentos;

import java.util.Scanner;

public class Console29 {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!\n");
		
		System.out.printf("MegaSena: %d %d %d %d", 1, 2, 3, 4);
		// %d: VALOR INTEIRO e %s: STRING;
		
		Scanner entrada = new Scanner(System.in);
		//ENTRADA OU SEJA MANDA O USUARIO DIGITAR...
		//System.out SAIDA ;
		//System.in ENTRADA;
		//Scanner VAI MONITORAR O QUE O USUARIO VAI DIGITAR;
		//entrada.close(); FECHA O PROGRAMA SEMPRE TEM QUE USAR APOS O SCANNER;
		// CTRL + AUMENTA A FONTE E CTRL - DIMINUE A FONTE;
		
		System.out.print("\nDigite seu Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua Idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.\n", nome, sobrenome, idade);
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package Controle;

import java.util.Scanner;

public class iF {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// IF NECESSARIAMENTE RETORNA VDD OU FALSO;
		System.out.print("Informa a media: ");
		double media = entrada.nextDouble();
		boolean criterioAprovacaoAtingido = media <= 10 && media >= 7.0;
		if (criterioAprovacaoAtingido) {
			System.out.println("Aprovado");
			System.out.println("Parabens");
		}
		boolean criterioRecupera�aoAtingido = media <= 6.9 && media >= 4.9;
		if (criterioRecupera�aoAtingido) {
			System.out.println("Recupera�ao");

		}
		boolean criterioDereprova�ao = media <= 4.9;
		if (criterioDereprova�ao) {
			System.out.println("Reprovado");
		}

		entrada.close();

	}

}

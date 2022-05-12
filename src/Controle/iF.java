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
		boolean criterioRecuperaçaoAtingido = media <= 6.9 && media >= 4.9;
		if (criterioRecuperaçaoAtingido) {
			System.out.println("Recuperaçao");

		}
		boolean criterioDereprovaçao = media <= 4.9;
		if (criterioDereprovaçao) {
			System.out.println("Reprovado");
		}

		entrada.close();

	}

}

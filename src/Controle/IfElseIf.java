package Controle;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a note: ");
		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) { // IF INICIAL É OBRIGATORIO;
			System.out.println("Nota Invalida!");
		} else if (nota >= 8.1) { // ELSE OBRIGATORIAMENTE TEM QUE TA ASSOCIADO A UM IF
			System.out.println("Conceito A!");
			System.out.println("PARABENS");

		} else if (nota >= 6.1) {
			System.out.println("Conceito B!");
		} else if (nota >= 4.1) {
			System.out.println("Conceito C!");
		} else if (nota >= 2.1) {
			System.out.println("Conceito D!");
		} else {
			System.out.println("Nota Valida!");
		}

//QUANDO USO O ELSE NAO PRECISA REPETIR OU CRIA COD ALGUM É APENAS O ELSE E LOGO NO BLOCO
//O System.out.println COM A AFIRMAÇAO CONTRARIA DO IF EX:IF ("Nota Invalida!") -> ELSE("Nota Valida!");

		System.out.println("FIM");

		entrada.close();

	}
}

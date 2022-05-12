package Arrays;

import java.util.Scanner;



public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("São quantos alunos? ");
		int qtAlunos = entrada.nextInt();
		 System.out.print("Quantas notas por aluno? ");
		int qtNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double [qtAlunos][qtNotas];//MATRIZ É BIDIMENCIONAL;
		
		
		
		double total = 0;
	    for ( int a = 0; a < notasDaTurma.length; a++ ) {
	    	for ( int n = 0; n < notasDaTurma[a].length; n++ ) {
	    		
	    		System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a);
	    		notasDaTurma [a] [n] = entrada.nextDouble();
	    		total += notasDaTurma [a] [n];
	    		
	    	}
	    }
	    double media = total / (qtAlunos * qtNotas);
	    System.out.println("Media da Turma é: " + media);
	    entrada.close();
 		
		
		
		
		
		
		
	}
}

package Arrays;

import java.util.Scanner;





public class ArrayDesafio {
	 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Quantas notas?: ");
	int QuantNotas = entrada.nextInt();
	
	double[] notas = new double[QuantNotas];
	
	
    for ( int i = 0; i <  notas.length; i++ ) {
        System.out.print("informe a nota:" + (i + 1) + ": ");
        notas[i] = entrada.nextDouble();
    }
	
	double total = 0;
	for (double nota:  notas) {
		total += nota;
	}
	
	
	
	
	
	double media = total / notas.length;
    System.out.println("A media é?:  " + media);
    
	entrada.close();
	
	}
}

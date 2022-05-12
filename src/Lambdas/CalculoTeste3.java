package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		

		BinaryOperator<Double> somar = (a, b) -> a + b;//<Double>So PODE USAR TIPOS CLASSE, double, int, nao pode (nao pode tipos primitivos;
		System.out.println(somar.apply(2.0, 3.0));
		somar = (x, y) -> x * y;
		System.out.println(somar.apply(2.0, 3.0));
		
		
		BinaryOperator<Integer> somar2 = (a, b) -> a + b;//<Double>So PODE USAR TIPOS CLASSE, double, int, nao pode (nao pode tipos primitivos;
		System.out.println(somar2.apply(2, 3));
		somar = (x, y) -> x * y;
		System.out.println(somar2.apply(2, 3));
		
		
		//Represents a function that accepts two arguments and produces a result
		//Representa uma funcao que aceita 2 argumentos e produz um resultado
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}

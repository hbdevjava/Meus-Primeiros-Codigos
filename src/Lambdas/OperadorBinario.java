package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;



public class OperadorBinario {
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(Double n1, Double n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));		
		
		BiFunction<Double, Double, String> resultado =
				(Double n1, Double n2) -> ((n1 + n2) / 2) >= 7 ?
						"Aprovado" : "Reprovado";
		// ===> "Aprovado" : "Reprovado"; aprovado caso contrario (:) reprovado;
		
		System.out.println(resultado.apply(9.7, 3.1));
		
		Function<Double, String> conceito =
				m -> m >= 7? "Aprovado" : "Reprovado";
				
				System.out.println(media.andThen(conceito).apply(7.7, 9.1));
	
	}
}

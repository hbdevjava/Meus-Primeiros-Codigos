package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		
		Function<Produto, Double> precoFinal =
		Produto -> Produto.preco * (1 - Produto.desconto);
		UnaryOperator<Double> impostoMunicipal = 
		preco -> preco >= 2500? preco * 1.085 : preco;
		UnaryOperator<Double> frete =
		preco -> preco >= 3000? preco + 100 : preco + 50;
		UnaryOperator<Double> Arredondar = 
		preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",") ;
	
				Produto p = new Produto("iPad", 32456.89, 0.13);
				
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				//.andThen(Arredondar)
				.andThen(formatar)
				.apply(p);
	
		System.out.println("O preço final é: " + preco);
	
		
	}
}

package Lambdas;

import java.util.function.Predicate; // ESSA INTERFACE RETORNA VDD OU FALSE

public class Predicado {
	public static void main(String[] args) {
						//isCaro -> ÈCaro;
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto))>= 750;
		
		Produto produto = new Produto("Pc", 3500, 0.15);
		System.out.println("Esse produto È Caro?\n"+isCaro.test(produto));
		
		
		
		
		
		
		
		
		
		
		
	}
}

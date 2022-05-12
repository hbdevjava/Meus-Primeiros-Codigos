package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;// NAO TEM RETORNO ALGUM

public class Consumidor {// ACEITA UM UNICO PARAMETRO E NAO RETORNA NADA
	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.printf(p.nome);
		// + ", " + p.preco *
		// (1 - p.desconto)+ " ja com desconto!");

		Produto p1 = new Produto("caneta ", 12.34, 0.24);
		imprimirNome.accept(p1);// RECEBE UM UNICO PARAMETRO E NAO RETORNA NADA
		System.out.println();
		System.out.println();
		
		Produto p2 = new Produto("borracha ", 7.80 , 0.18);
		Produto p3 = new Produto("lapis ", 4.39 , 0.19);
		Produto p4 = new Produto("caderno ", 19.90 , 0.03);
		Produto p5 = new Produto("tv ", 2987.99 , 0.25);
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(p -> System.out.println(p.nome));
		System.out.println();
		produtos.forEach(System.out::println);

	}

}

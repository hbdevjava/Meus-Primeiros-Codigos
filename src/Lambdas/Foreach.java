package Lambdas;


import java.util.Arrays;
import java.util.List;

public class Foreach {// ==> PRA CADA
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("ana", "hbb", "son", "rrr");
		List<Integer> idade = Arrays.asList(23, 24, 55, 87); 
		
		
		
		System.out.println("Forma Tradicional usando, Foreach  "
				+ "....");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nForma Lambda#01");
		aprovados.forEach(nome -> System.out.println(nome + "..."));
		
		System.out.println("\nMethod Reference#01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nForma Lambda#02");
		aprovados.forEach(nome -> meuImprimir(nome));
		//PRA CADA APROVADO IMPRIMA NA SAIDA DO SISTEMA;
		
		System.out.println("\nMethod Reference#02...");
		aprovados.forEach(Foreach::meuImprimir);
		
		System.out.println("\nForma Lambda#03");
		idade .forEach(nome -> minhaIdade(nome));
		
		System.out.println("\nMethod Reference#03...");
		idade.forEach(Foreach::minhaIdade);
		
		
		
	}	// FUNCAO PERSONALIZADA DENTRO DA ESTRUTURA LAMBIDA
	    static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	    }
		
	    static void minhaIdade( Integer idade) {
	    	System.out.println("eu tenho " + idade + " de idade ...");
	}
}

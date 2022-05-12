package Lambdas;

import java.util.function.Function;

public class Funcao { // PROGRAMACAO FUNCIONAL
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
		 numero -> numero % 2 == 0 ? "Par" : "Impar";
		 // % 2 == 0 ? ==> cod pra saber se é par ou impar 
		 Function<String, String> oResultadoE =
				 valor -> "O Resultado é: " + valor;
				 
		 Function<String, String> empolgado =
				 valor -> valor + "!!!";
				 
		 String resultadoFinal = parOuImpar
				 .andThen(oResultadoE)
				 .andThen(empolgado)
				 .apply(3);	//UMA UNICA SENTENÇA DE CODIGO QUEBRADA EM LINHAS PRA MOSTRA O FLUXO;	 
				 
		 System.out.println(resultadoFinal);
		 System.out.println(parOuImpar.apply(32));
		 //A SAIDA DUM METODO É A ENTRADA DO OUTRO;
		 //ANDtHEN CONSIGO CONCATENAR UM METODO NO OUTRO (ENCADEAMENTO DE FUNCOES);
		 //ANDTHEN ==> E ENTAO CHAME...
		
		
		
		
		
		
		
		
		
		
		
	}
}

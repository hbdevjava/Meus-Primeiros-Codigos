package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoHeterogenio {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	// COLECIONS NAO ACEITA VALORES PRIMITIVOS ENTAO ELA AUTOMATICAMANTE FAZ A CONVERSAO PRA CLASSE EX:
	// COLECIONS NAO ACEITA PRIMITIVOS OU VC FAZ UM ARRAY OU UM WRAPPER;
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);//double -> DOUBLE;
		conjunto.add(true);// boolean -> BOOLEAN;
		conjunto.add("TESTE");// STRING JA É OBJETO;
		conjunto.add(1);// int -> INTEGER
		conjunto.add('x');// char -> CARACTERE
		System.out.println(" O tamnho é: " + conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('x');
		System.out.println(" O tamnho é: " + conjunto.size());
		
		
		System.out.println(conjunto.remove('x'));// remove (RETORNA TRUE OU FALSE)
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("TEsTE"));
		System.out.println(" O tamnho é: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));// VERIFICA SE O VALOR ESTA CONTIDO OU NAO DENTRO DO CONJUNTO
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		System.out.println(" O tamnho é: " + conjunto.size());
		
		Set numero = new HashSet();
		numero.add(1);
		numero.add(2);
		numero.add(3);
		
		System.out.println(numero);
		System.out.println(conjunto);
		
		conjunto.addAll(numero); // ADD.ALL FAZ A UNIAO ENTRE DOIS CONJUNTOS;
		System.out.println(conjunto);
		
		
		conjunto.retainAll(numero);//RETAINALL FAZ A INTERCEÇAO OU SEJA MOSTRA APENAS O VALOR COMUM ENTRE OS CONJUNTOS
		System.out.println(conjunto);
		
		conjunto.clear();// LIMPA
		System.out.println(conjunto);
		//@SuppressWarnings({ "rawtypes", "unchecked" }) -> SILENCIA ADIVERTENCIAS (CTRL + 1)
	}
}

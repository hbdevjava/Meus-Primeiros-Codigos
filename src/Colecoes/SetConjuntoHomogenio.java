package Colecoes;


import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;


public class SetConjuntoHomogenio {

	
	public static void main(String[] args) {
		
		//Set <String> listaDeAprovados = new HashSet();//CTRL + SHIFT + O PRA ADD OS IMPORTS
		// <> DIZ QUE TIPO DE DADOS EU QUERO AMARRAR PRA ADD A LISTA OU SEJA ELA SO ACEITA DADOS
		//TIPO STRING;
		SortedSet <String> listaDeAprovados = new TreeSet<>(); 
		listaDeAprovados.add("Hb");
		listaDeAprovados.add("Son");
		listaDeAprovados.add("Dorinha");
		 
		for (String candidado:listaDeAprovados ) {
			System.out.println(candidado);
		}
		
		
		
		Set <Integer> numeros = new HashSet <>();
		 numeros.add(1);
		 numeros.add(3);
		 numeros.add(5);
		
		for ( int nuns: numeros) {
			System.out.println(nuns);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

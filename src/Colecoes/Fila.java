package Colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList <>();
		//Offer e Add -> AMBOS ADD ELEMENTOS NA FILA;
		//DIFENÇA É O COMPORTAMENTO QUANDO A FILA ESTA CHEIA;
		fila.add("ana");//-> RETORNA UM ERRO;
		fila.offer("hb"); //->RETORNA FALSO;
		fila.offer("son"); 
		fila.offer("dora"); 
		fila.offer("xxxx"); 
		
		
		//FIFO O O PRIMEIRO QUE ENTROU É O PRIMEIRO A SAIR 
		System.out.println(fila.peek());
		System.out.println(fila.peek());//-> retorna null
		System.out.println(fila.element());// da erro
		// ESSES COMPORTAMENTO SO OCORRE QUANDO A FILA ESTA VAZIA;
		
		
	      
		        //fila.size();
				//fila.clear();
				//fila.contains();
				//fila.isEmpty();
				
		
		
		
		
		
		
		
		
		
	}
}

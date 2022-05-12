package OO.heranca.teste.encapsulamento;

import OO.heranca.desafio.Carro;
import OO.heranca.desafio.Civic;
import OO.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Carro civic = new Civic();
		Carro ferrari = new Ferrari();
		
		ferrari.acalerar();
		System.out.println(ferrari);
		
		ferrari.acalerar();
		System.out.println(ferrari);
		ferrari.acalerar();
		ferrari.acalerar();
		ferrari.acalerar();
		ferrari.acalerar();
		ferrari.acalerar();
		ferrari.acalerar();
		ferrari.acalerar();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.stop();
		System.out.println(ferrari);
		
		
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

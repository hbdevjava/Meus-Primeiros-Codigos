package Lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		
		Calculo somar = (double a, double b) ->  a + b;
		System.out.println(somar.executar(2, 3));
		// ESSA LAMBDA FUNCION TEM QUE BATER IGUAL COM O METODO CRIADO NA INTERFACE
		// CALCULO
		// PQ NESSE CASO ESSA LAMBDA ESTA LIGADA A CLASSE CALCULO;
		// FUNCAO ANONIMA;
		somar = (x, y) -> x * y;
		System.out.println(somar.executar(2, 3));
		System.out.println(somar.legal());
		System.out.println(Calculo.muitoLegal());
	
		
		/**
		 * 
		 * Calculo multiplicacao = (a, b) -> { return a * b; };
		 * 
		 * System.out.println(multiplicacao.executar(2, 3));
		 * 
		 **/
		
		
		


	}
}

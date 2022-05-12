package Lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		Calculo calcular = new Soma();
		System.out.println(calcular.executar(2, 3));
		
		calcular = new Multiplicar();
		System.out.println(calcular.executar(2, 3));
		
		calcular = new Dividir();
		System.out.println(calcular.executar(2, 3));
		
	}
	
}
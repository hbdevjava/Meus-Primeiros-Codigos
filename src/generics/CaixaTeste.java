package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.aguardar("SON");
		
		System.out.println(caixaA.abrir());
	
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.aguardar(4.1516);
		
		System.out.println(caixaB.abrir());
	
	
	
	
	}
	
}

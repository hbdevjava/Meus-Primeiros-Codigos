package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		
		CaixaNumero<Integer> caixaNumA = new CaixaNumero<>();
		caixaNumA.aguardar(24);
		System.out.println(caixaNumA.abrir());
	
		CaixaNumero<Double> caixaNumB = new CaixaNumero<>();
		caixaNumB.aguardar(2.4);
		System.out.println(caixaNumB.abrir());
	}
}

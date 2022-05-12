package generics;

public class ParesTeste {
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "HB");
		resultadoConcurso.adicionar(2, "rthrth");
		resultadoConcurso.adicionar(3, "Son");
		resultadoConcurso.adicionar(4, "hghhf");
		resultadoConcurso.adicionar(1, "FFF");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(1));
		
		
		
	}
}

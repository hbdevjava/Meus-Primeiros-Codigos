package fundamentos.Operadores;

public class ternario {
	public static void main(String[] args) {
		//OPERADOR TERNARIO � UMA ATRIBUI�AO CONDICIONAL;
		
		double media = 5.6;
	
		String resFinal = media >=  7.0 ? "Aprovado" : media >=  5.0 ? "Recupera�ao" : "Reprovado";
		System.out.println("O aluno esta " + resFinal);
	}
}

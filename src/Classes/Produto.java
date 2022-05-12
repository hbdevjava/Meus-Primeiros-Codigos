package Classes;

public class Produto {
	
	String nome;
	double valor;
	static double desconto = 0.25;
	
	Produto(String nomeInicial, double valorInical){ // CONSTRUTOR TEM AUSENCIA DE RETORNO
		// SE COLOCAR VOID ESTA CRIANDO UM METODO E NAO UM CONSTRUTOR;
		nome = nomeInicial;
		valor = valorInical;
		
	}
	Produto () {
		nome = "Hebert";
		valor = 2500.89;
		desconto = 0.25;
	}
	
	double valorComDesconto () {
		return  valor * ( 1 - desconto);
	}
	
	double valorComDesconto ( double valorComDescontoGerente) {
		return valor * ( 1 - desconto + valorComDescontoGerente);
	}
	
	
	
	
}

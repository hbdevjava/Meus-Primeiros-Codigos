package excecao.pesornalizadaA;

@SuppressWarnings("serial") // CTRL + 1;
public class NumeroForadoIntervaloException extends RuntimeException {// RunTimeExeption => TUDO ERRO DE RUNTIME O COMPILADOP
																// NAO IRA
// TE OBRIGAR A TRATAR O ERRO, E NEM MESMO DECLARAR NO METODO;	
	String nomeDoAtributo;

	public NumeroForadoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
		
	}
	@Override
		public String getMessage() {
		return String.format("O Atributo '%s' Está Fora do Intervalo", nomeDoAtributo);
			
		}
}

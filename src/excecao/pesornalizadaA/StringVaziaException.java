package excecao.pesornalizadaA;

@SuppressWarnings("serial") // CTRL + 1;
public class StringVaziaException extends RuntimeException {// RunTimeExeption => TUDO ERRO DE RUNTIME O COMPILADOP
																// NAO IRA
// TE OBRIGAR A TRATAR O ERRO, E NEM MESMO DECLARAR NO METODO;	
	String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
		
	}
	@Override
		public String getMessage() {
		return String.format("O Atributo '%s' esta vazio", nomeDoAtributo);
			
		}
}

package Classes;

public class Usuario {
	String nome;
	String email;
	
	
	

	public boolean equals(Object objeto) {
		
		Usuario outro = (Usuario) objeto; // MESMO CONCEITO DE CASH;
	
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emaiIgual = outro.email.equals(this.email);
		
		return  nomeIgual && emaiIgual;
		
	}
	
			
			
		
	
}

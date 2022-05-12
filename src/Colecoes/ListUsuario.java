package Colecoes;

import java.util.Objects;

public class ListUsuario {
	//PRA GERAR HASHCODE E EQUALS -> BOTAO DIREITO -> SOURCE -> GENERATE HASHCODO() AND EQUALS();
	String nome;
	
	ListUsuario(String nome){//OBRIGATORIAMENTE PRA CRIA UM USUARIO É PRECISO CHAMAR O CONSTRUTOR QUE 
		this.nome = nome;// RECEBE O NOME DELE;
	}

	
	@Override
	public String toString() {
		return "meu nome é " + this.nome + "!";
	}
	
	
	





	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListUsuario other = (ListUsuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}

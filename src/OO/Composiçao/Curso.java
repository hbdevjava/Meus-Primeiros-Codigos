package OO.Composiçao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	//FINEL DIZ QUE AGORA LIST É UMA CONSTANTE OU SEJA ELA FOI INSTANCIADA NA MEMORIA, VC NAO PODE
	// INSERIR UMA OUTRA LISTA MAS PODE MODIFICAR O QUE TEM DENTRO DA LISTA ( final List<Aluno> alunos = new ArrayList<Aluno>())
	 final String nome;
	 final List<Aluno> alunos = new ArrayList<Aluno>();
	 
	 Curso(String nome){
		 this.nome = nome;
		
	 }
	 void adiconarAluno(Aluno aluno) {
		 this.alunos.add(aluno);
		 aluno.cursos.add(this);
	 }
	 
		 
	 
	 
		public String toString() { // ELE CONVERTE OBJETO PARA STRING 
			return nome;
		}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

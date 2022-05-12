package OO.Composiçao;

import java.util.ArrayList;
import java.util.List;


public class Aluno {
		//BIDIRECIONAL
		//ARRAY NAS DUAS CLASSES
		// O QUE TIVER NUMA CLASS PRIMARIA TEM NA SEGUNDARIA
	 final String nome;
	 final List<Curso> cursos = new ArrayList<Curso>();
	 
	 Aluno(String nome){
		 this.nome = nome;
	 }
	void adicionarCurso(Curso curso) { //METODO
	 this.cursos.add(curso);
	 curso.alunos.add(this);
	 
	}
	 Curso obterCursoPorNome(String nome){ // FUNÇAO PRA PROCURAR UM CURSO A PARTIR DO NOME
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
			
		}
		return null;
		
	 }
		
	
	
	public String toString() { // ELE CONVERTE OBJETO PARA STRING 
		return nome;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

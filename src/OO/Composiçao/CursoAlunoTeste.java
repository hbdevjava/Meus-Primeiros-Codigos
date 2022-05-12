package OO.Composiçao;

//DE MUITOS PRA MUITOS 
public class CursoAlunoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("hb");
		Aluno aluno2 = new Aluno("son");
		Aluno aluno3 = new Aluno("dorinha");
		
		Curso curso1 = new Curso("java");
		Curso curso2 = new Curso("Poo");
		Curso curso3 = new Curso("logica");
		
		curso1.adiconarAluno(aluno1);
		curso1.adiconarAluno(aluno2);
		
		curso2.adiconarAluno(aluno1);
		curso2.adiconarAluno(aluno3);
		
		//curso3.adiconarAluno(aluno1);
		//curso3.adiconarAluno(aluno2);
		//curso3.adiconarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		
		for (Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso  " + curso1.nome + "...");
			System.out.println("....e meu nome é " + aluno.nome);
			System.out.println();
			
			
		}
		System.out.println(aluno1.cursos.get(0).alunos);
		
		System.out.println();
		for (Curso curso: aluno1.cursos) {
			System.out.println(curso);
			
		}
		
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("java");
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
			
		}
		
		
	}
		
}
		
		
		
		
		
		
		
		

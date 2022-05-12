package excecao.pesornalizadaA;

import excecao.Aluno;

public class TesteDeValidacoes { // CTRL + ALT + Z ==> try catch
	public static void main(String[] args) {
		
		try {
			Aluno aluno1 = new Aluno("", 45);
			Validar.aluno(aluno1);
		} catch (excecao.pesornalizadaA.StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForadoIntervaloException e) {
			System.out.println(e.getMessage());
		}
			
		
		System.out.println("Fim :)");
	}
}

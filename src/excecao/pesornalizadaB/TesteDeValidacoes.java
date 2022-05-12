package excecao.pesornalizadaB;

import excecao.Aluno;

public class TesteDeValidacoes { // CTRL + ALT + Z ==> try catch
	public static void main(String[] args) {
		
		try {
			Aluno aluno1 = new Aluno("", 7);
			try {
				Validar.aluno(aluno1);
			} catch (StringVaziaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} catch (excecao.pesornalizadaA.StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForadoIntervaloException e) {
			System.out.println(e.getMessage());
		}
			
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumeroForadoIntervaloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fim :)");
	}
}

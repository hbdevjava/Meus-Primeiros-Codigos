package excecao;



public class ChecadaVsNaoChecada {
	public static void main(String[] args) {// ABRUPTA
		
		try {
			geraErro1();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
	
	System.out.println("Fim :) ");
	}
	// EXCECAO NAO CHECADA OU NAO VERIFICADA
	static void geraErro1() {
	  throw	new RuntimeException("Ocorreu um erro bem legal #01");
	//LANCE UM NOVO ERRO COM ESSA MSG ("Ocorreu um erro bem legal #01");
	}
	// EXCECAO CHECADA OU VERIFICADA
	static void geraErro2() throws Exception	 {
		throw new Exception("Ocorreu um erro bem legal #02");
	}





}

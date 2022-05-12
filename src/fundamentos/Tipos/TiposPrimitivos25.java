package fundamentos.Tipos;

public class TiposPrimitivos25 {
	public static void main(String[] args) {
	// INFORMAÇOES FUNCIONARO	
		
	//TIPOS NUMERICOS INTEIROS	
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;// QUANDO PASSA O HANGE (CAPACIDADE DE UM INTEIRO) COLOCA UM L;
		
	//TIPOS DE NUMEROS REAIS	
		float salario = 11_445.48F;//FLOAT CABE NUM DOUBLE MAS SE QUISER EXPECIFICAR QUE ESSE NUMERO É FLOAT COLOCA UM F;
		double vendasAcumuladas = 2_991_997_103.01;
		
	//TIPOS BOOLEANO	
		boolean estaDeFerias = false;// ou true;
		
	//TIPO CARACTERE	
		char status = 'A';// APENAS 1 CARACTERE E SEMPRE DENTRP DE ASPAS SIMPLES;
		
		//DIAS DE EMPRESA
		System.out.println(anosDeEmpresa * 365  +  " Dias de Empresa ");
		//NUMERO DE VOOS
		System.out.println(numeroDeVoos / 2 );
		//PONTOS REAIS
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " : ganha ->" +  salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status " + status);
		
		String s = "bom dia X";
		s.replace("X","Senhora");
		s = s.replace("X","Senhora");//SUBSTITUE O X POR SENHORA;
		s = s.toUpperCase(); //MUDA PRA MAIUSCULA;
		s.concat("!!!!!!"); //CONCATENA;
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
	}
}

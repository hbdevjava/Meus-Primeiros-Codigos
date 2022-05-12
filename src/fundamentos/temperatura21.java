package fundamentos;

public class temperatura21 {
	public static void main(String[] args) {
		//(°F - 32) * 5/9 = °C (FORMULA DA CONVERSAO);
		// PRA COLOCAR (°) ALTgr + E;
		double fahrenheit = 86;
		final double AJUSTE = 32; 
	    final double FATOR = 5/9.0 ; 
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(" °F convertido para °c :  " + celsius + "°c");
		//ALT + PRA CIMA E PRA BAIXO MOVE A LINHA SELECIONADA;
		// CTRL + ALT + PRA BAIXO DUPLICA A LINHA SELECIONADA;
		
	
	}

}

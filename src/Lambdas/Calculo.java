package Lambdas;


@FunctionalInterface // ESSA MARCA�AO DIZ QUE ELE � FUNCIONAL E NAO DEVE SER ALTERADA;
public interface Calculo {
// A DEFINICAO DE UM METODO DENTRO DA INTERFACE OBRIGATORIAMENTE � PUBLICA;
// ABSTRACT ESTA IMPLISSITO;	
//@FunctionalInterface ===> FAZ COM QUE ESSA INTERFACA SO TENHA UM METODO SE TENCAR IMPLEMENTAR OUTRO VAI DA ERRO;
// INTERFACE FUNCIONAL � INTERFACE QUE TEM APENAS UM METODO;	
	//POR PADRAO ESSE METODO � public abstract
	public abstract double executar(double a, double b);
	
		default String legal() {
			return "legal";
		}
		
		
		static String muitoLegal() {
			return "muito Legal";
		}
		
		
		
		
		
		
		
		
}

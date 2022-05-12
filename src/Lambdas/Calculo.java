package Lambdas;


@FunctionalInterface // ESSA MARCAÇAO DIZ QUE ELE É FUNCIONAL E NAO DEVE SER ALTERADA;
public interface Calculo {
// A DEFINICAO DE UM METODO DENTRO DA INTERFACE OBRIGATORIAMENTE É PUBLICA;
// ABSTRACT ESTA IMPLISSITO;	
//@FunctionalInterface ===> FAZ COM QUE ESSA INTERFACA SO TENHA UM METODO SE TENCAR IMPLEMENTAR OUTRO VAI DA ERRO;
// INTERFACE FUNCIONAL É INTERFACE QUE TEM APENAS UM METODO;	
	//POR PADRAO ESSE METODO É public abstract
	public abstract double executar(double a, double b);
	
		default String legal() {
			return "legal";
		}
		
		
		static String muitoLegal() {
			return "muito Legal";
		}
		
		
		
		
		
		
		
		
}

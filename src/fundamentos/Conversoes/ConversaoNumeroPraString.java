package fundamentos.Conversoes;

public class ConversaoNumeroPraString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		//CONVERTEU O INTEGER PRA STRING USANDO O TOSTRING O .LENGTH � SO �RA MOSTRA QUE J� EST� ATV AS FUNCIONALIDADES DA STRING;
		
		int num2 = 1000000;
		System.out.println(Integer.toString(num2).length());
		//DA PRA FAZER TB DIRETAMENTE DA CLASS (iNTEGER NO CASO);
		//O .ToString TRANFORMA TUDO PARA STRING;
		//Long.toString(num2);
		//Double.toString(num2);
		//Short.toString(0);
		
	};
	
}

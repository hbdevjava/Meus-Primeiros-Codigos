package fundamentos.Conversoes;



public class ConversaoTiposPrimitivosNumericos34 {
	public static void main(String[] args) {
		double a = 1;
		//CONVERSAO IMPLICITA: FOI DE UM NUMERO INTEIRO (1) PARA UM DOUBLE NESSE CASO PODE PQ O DOUBLE ARMAZENA MAIS ;
		
		float b = 1.0F;
		System.out.println(b);
		//float b = 1.0; erro;
		//NESSE CASO ´PRA CONVERTER UM PONTO FLUTUANTE EM DOUBLE PRECISA COLOCAR UM F NO NUMERO PRA INDICAR UM FLOAT;
		//CONVERSAO EXPLICITA; OBS:QUANDO VC FAZ UMA CONVERSAO EXPLICITA VC TA CIENTE QUE PODE PEDER INFORMAÇAO;
		//CONVERSAO EXPLICITA CHAMA SE CAST;
		
		int c = 4;
		byte d = (byte) c; //CONVERSAO EXPLICITA;
	    System.out.println(d);

		
		
		
		
		
	}
}

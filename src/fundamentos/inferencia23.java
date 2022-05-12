package fundamentos;

public class inferencia23 {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		var b = 4.5;
		System.out.println(b);
		// POSSO USAR O VAR QUE O JAVA VAI ENTENDER QUE SE TRATA DE UM NUMERO DOUBLE,
		// OU SEJA ELE VAI INFERIR (ENTENDER) PELO TIPO DA VARIVEL QUE SE TRATA DE UM DOUBLE
		// NESSE CASO; VEJA EXEMPLOS COM STRING,
	
		var c = "txt";
		System.out.println(c);
		
		c = "outro txt";
		System.out.println(c);
		 
		double d = 123.65;//VARIAVEL FOI DECLARADA;
		d = 123.65;//VARIAVEL FOI INICIALIZADA;
		System.out.println(d);// VARIAVEL FOI USADA;
		
		var e = 125.25;
		e = 125.25;
		System.out.println(e);
		
		
		
		
		
		
		
		
	}
}

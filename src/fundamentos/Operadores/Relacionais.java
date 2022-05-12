package fundamentos.Operadores;

public class Relacionais {
	public static void main(String[] args) {
		System.out.println(3 > 4);// MAIOR;
		System.out.println(3 <= 3);// MENOS IGUAL;
		System.out.println(3 < 4);//MENOR;
		System.out.println(30 <= 7);//MENOR IGUAL;
		System.out.println(30 != 7);//DIREFENTE;
		System.out.println();
		double nota = 9.90;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Ele tem Desconto se passar por media? " + temDesconto );
	}
	
}

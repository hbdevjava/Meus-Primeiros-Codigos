package fundamentos.Tipos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		//QUANDO FOR COMPARAR STRINGS NAO USE (==) USE (.EQUALS);
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2" .equals(s1));
		
		
		Scanner teclado = new Scanner (System.in);
		String s2 = teclado.next();
		System.out.println("2" == s2);
		System.out.println("2" .equals(s2.trim()));
		
		teclado.close();
		
		
		
		
		
		
		
		
		
	}
}

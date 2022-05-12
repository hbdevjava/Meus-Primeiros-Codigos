package Controle;

import java.util.Scanner;

public class SwitchComBreak {
 public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	

	   String conceito = "";
	   System.out.print("Informe a Nota: ");
	   int nota = entrada.nextInt();
	   
	   switch (nota) {
	   case 10: case 9: case 8:
		   conceito = "A";
		   break;
	   case 7: case 6: case 5:
		   conceito = "B";
		   break;
	   case 4: case 3: case 2:
		   conceito = "C";
		   break;
		   
	   
	   }
	   System.out.println("Conceito é: "+ conceito);
	   entrada.close();
}
}

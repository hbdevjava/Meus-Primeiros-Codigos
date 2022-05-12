package fundamentos.Conversoes;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // ABRE O SCANNER;
        
		System.out.println("Informe o primeiro salario:");
        String valor1 = entrada.nextLine().replace(",",",");
        
        System.out.println("Informe o primeiro salario:");
        String valor2 = entrada.nextLine().replace(",",",");
        
        System.out.println("Informe o primeiro salario:");
        String valor3 = entrada.nextLine().replace(",",",");
        
        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);
        
        double media = (salario1 + salario2 +salario3) / 3;
        System.out.println("A media é: " + media);
		
		entrada.close();// FECHA O SCANNER;
	}
	
}

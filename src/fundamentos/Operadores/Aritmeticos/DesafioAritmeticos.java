package fundamentos.Operadores.Aritmeticos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		// PARA ELEVAR A POTENCIA;
		 int a = 3 * 4 - 10;
		 int b = (int) Math.pow(a, 3);//ELE DA VALOR DOUBLE SO FAZER UM CAST QUE ELE DA VALOR INT;
		//DENTRO DA CLASSE MATH TEM UMA FUNCIONALIDADE POW QUE ELEVA A POTENCIA;
		//.pow(a, 3) VARIAVEL + VALOR DA POTENCIA;
		 System.out.println(b);
		
		// ****** DESAFIO******
		 System.out.println();
		
		 double numA = Math.pow(6 * (2 + 3), 2);
		 double denA = 3 * 2;
		 
		 double numB = (1 - 5) * (2 - 7);
		 double denB = 2;
		 
		 double superiorA = numA / denA;
		 double superiorB = Math.pow(numB / denB , 2);
		 
		 double superior = Math.pow(superiorA - superiorB, 3);
		 double inferior = Math.pow(10, 3);
		 
		 double resultado = superior/inferior;
		 
		 System.out.println("o resultado é: " + resultado);
		 
		 
		  
		 
		 
		 
		 
		 
		 
		
		
	}
}

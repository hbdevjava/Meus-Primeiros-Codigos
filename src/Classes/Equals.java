package Classes;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro1660@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro1660@gmail.com";
		
		System.out.println(u1 == u2);// TESTE FALSO
		System.out.println(u1.equals(u2));// TESTE FALSO
		System.out.println(u2.equals(u1));// TESTE FALSO
		
		
	}	
}

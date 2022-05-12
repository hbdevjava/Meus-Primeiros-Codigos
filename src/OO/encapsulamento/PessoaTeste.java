package OO.encapsulamento;

public class PessoaTeste {
		public static void main(String[] args) {
			
			Pessoa p1 = new Pessoa("HB", "BRITO", 35);
			p1.setIdade(11);// ALTERA O VALOR;
					
			System.out.println(p1.toString());// LER O VALOR 
			System.out.println();// LER O VALOR 
			System.out.println(p1.getNomeCompleto());// LER O VALOR 
					
					
					
			
			
		}
}
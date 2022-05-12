package generics;

public class CaixaObjectTeste {
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguardar(2.3);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.aguardar("HB");
		
		Double coisaA = (Double) caixaA.abrir();
		String coisaB = (String) caixaB.abrir();
		
		
		System.out.println(coisaA);
		System.out.println(coisaB);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

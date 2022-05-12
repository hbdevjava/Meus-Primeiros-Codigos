package fundamentos.Operadores.logicos;

public class DesafioLogicos {
	public static void main(String[] args) {
		//TRABALHO NA TERÇA (V OU F);
		//TRABALHO NA QUINTA (V OU F);
		
		boolean work1 = true;
		boolean work2 = false;
		
		boolean comprouTV50 = work1 && work2;
		boolean comprouTV32 = work1 ^ work2;
		boolean comprouSorvete = work1 || work2;
		//OPRERADOR UNIARIO
		boolean maisSaudavel = !comprouSorvete;
		
		
		
		
		System.out.println("vc comprou uma TV50 ?: " + comprouTV50);
		System.out.println("vc comprou uma TV32 ?: " + comprouTV32);
		
		System.out.println("comprou uma TV32 " + "e comprou Sorvete ?: " + comprouSorvete);
		System.out.println("Mais saudavel: "
				+ "" + maisSaudavel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

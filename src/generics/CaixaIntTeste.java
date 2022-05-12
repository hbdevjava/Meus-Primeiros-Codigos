package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
	
		/**Caixa<String> caixaA = new CaixaInt<>();
		caixaA.aguardar("hb");
		System.out.println(caixaA.abrir());
		 * public class CaixaInt<X> extends Caixa<X>
		 * MESMO COM HERANÇA VC PODE MODIFICAR O TIPO GENERICO
		 * MAS QUANDO VC EXPLICIRA NA HERANCA TODO O CODIGO SEGUIRA
		 * O GENERIZ ESPECIFICADO
		 *EX: Caixa<string> TODO CODIGO SEGIRA O PADRAO STRING**/
		
		
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.aguardar(23);
		
		System.out.println(caixaA.abrir());
		
		
		
	}
}

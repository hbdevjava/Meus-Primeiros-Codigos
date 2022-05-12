package Classes;

public class ProdutoTeste {
	public static void main(String[] args) { // VOID (AUSENCIA DE RETORNO) NAO RETORNA NADA;
		// UMA CLASS DEFINE UM TIPO; SEMPRE QUE CHAMAR METODOS TEM QUE USAR () EX: Produto ();
		Produto p1 = new Produto ("celular: ", 3483.00);//INSTANCIOU A CLASSE PRODUTO ATRAVES DO METODO NEW;
		//p1.nome = "celular";
		//p1.valor = 3483.00;
		//p1.desconto = 0.15;
		var p2 = new Produto();
		p2.nome = "NoteBook: ";
		p2.valor = 7554.98;
		p2.desconto = 0.3;
		Produto.desconto = 0.50;// SEMPRE CODIFICAR DE UMA FORMA EXPLICITA (EX:Produto.desconto) AQUI EU TM PODERIA COLOCAR (EX: p2. ou p1.) 
		//E ALTERAR O VALOR DO DESCONTO MAIS POR BAIXO DUMA FORMA IMPLICITA O JAVA DARIA DESCONTO NO GERAL. JA QUE É PRA SER O DESCONTE
		//GERAL SE COMO COLCAR EXPLICITAMENTE (EX:Produto.desconto);
		var p3 = new Produto();
		p3.nome = "jjjj";
		p3.valor = 123;
		
		System.out.println(p1.nome + p1.valorComDesconto() );
		System.out.println(p2.nome + p2.valorComDesconto() );
		
		
		double precoFinal1 = p1.valorComDesconto();
		double precoFinal2 = p2.valorComDesconto();
		double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf( "Media Do Carrinho = R$:%.2f." ,  mediaDoCarrinho );//%.2f DIMINUI AS CASAS DECIMAIS EM NUMEROS DOUBLES
		
		
		
			
		
		
	}
}

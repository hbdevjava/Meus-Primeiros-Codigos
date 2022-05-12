package OO.Composiçao.desfio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<Item>();
	
	void adicionaritem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	void adicionaritem(String nome, int qtde, double preco) {
		var produto = new Produto (nome, preco);
		this.itens.add(new Item(produto, qtde));
		
	}
	
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
		  total += item.qtde * item.produto.preco;
		}
		
		
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

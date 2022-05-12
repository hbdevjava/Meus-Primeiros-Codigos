package OO.Composiçao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	// RELAÇAO DE 1 PRA VARIOS
	// QUANDO FOR NA RELAÇAO DE 1 PRA N VC TEM QUE FAZER UM ARRAYLIST DA CLASSE
	// PRIMARIA;
	// AQUI VC COLOCA O ARRAYLIST, OS METODOS E AS FUNÇOES (CASO HAJA);
	String cliente;
	List<Item> itens = new ArrayList<Item>();
	// METODO SEMPRA VAI TER OS PRIMITIVPS NA INICIO EX:double
	// obterValorTotal(),double total = 0;

	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}


	double valorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}

		return total;
	}

}

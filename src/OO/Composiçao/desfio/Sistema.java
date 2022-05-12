package OO.Composiçao.desfio;

public class Sistema {
	 public static void main(String[] args) {
			
			 
			 Compra compra1 = new Compra();
			 compra1.adicionaritem("hhghg", 1,100);
			 compra1.adicionaritem(new Produto("hhghg", 2000), 2);
			 
			 Compra compra2 = new Compra();
			 compra2.adicionaritem("hhghg", 10, 10);
			 compra2.adicionaritem(new Produto("hhghg", 1000), 1);
			 
			
			 Cliente cliente = new Cliente("hb");
			 cliente.compras.add(compra1);
			 cliente.compras.add(compra2);
			 
			 
			 
			 System.out.println(cliente.obterValorTotal());
	 } 
}

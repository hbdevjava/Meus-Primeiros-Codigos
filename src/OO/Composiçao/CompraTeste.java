package OO.Composiçao;



// A CLASSE PRINCIPAL COLOCA O METDO MAIN;
// ESTANCIA DA CLASSE SECUNDARIA (cOMPRAEX1PRA1) E CRIA NOVOS OBJETOS A PARTIR DA CLASSE INSTANCIADA;
public class CompraTeste {
     public static void main(String[] args) {
	
    	 Compra compra1 = new  Compra();
    	 compra1.cliente = "HB";
         compra1.adicionarItem("borracha", 20, 100);    	
         compra1.adicionarItem("lapis", 12, 78);    	
         compra1.adicionarItem("caneta", 3, 67);    	
    	 
    	 
    	 System.out.println(compra1.itens.size());
    	 System.out.println(compra1.valorTotal());
    	 
    	 
     }
    	 
}
    	 
    	 
    	 
    	 
    	 
    	 
    	 

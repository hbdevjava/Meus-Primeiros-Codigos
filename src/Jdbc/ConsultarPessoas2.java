package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException {
		  
		  Scanner entrada = new Scanner(System.in);
		  
		  Connection conexao = FabricaConexao.getConexao();
		  String sql = "select * from pessoas WHERE nome like ? ";
		  
		  System.out.println("Informa o valor da pesquisa: ");
		  String valor = entrada.nextLine();


		  PreparedStatement stmt = conexao.prepareStatement(sql);
	  	  stmt.setString(1, "%" + valor + "%");
	  	  ResultSet resultado = stmt.executeQuery();
	  	  
	  	  
	  	  
	  	  List<Pessoa> pessoas = new ArrayList<>();
	  	  
	  	  while(resultado.next()) {
	  		  int id = resultado.getInt("id");
	  		  String nome = resultado.getString("nome");
	  		 pessoas.add(new Pessoa(id, nome)); 
	  	  }
	  	  
	  	  for(Pessoa p: pessoas) {
	  		  System.out.println(p.getId() + " ==> " + p.getNome());
	  	  }
	  	  
	  	  
	  	  
	  	  stmt.close();
	  	  conexao.close();
	      entrada.close();
	} 	
}

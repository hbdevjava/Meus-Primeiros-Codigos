package Jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
public class ConsultarPessoas1 {
  public static void main(String[] args) throws SQLException {
	  
	  Connection conexao = FabricaConexao.getConexao();
	  String Sql = "select * from  pessoas";
  	  Statement stmt = conexao.createStatement();
  	  ResultSet resultado = stmt.executeQuery(Sql);
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
  	
  }
}

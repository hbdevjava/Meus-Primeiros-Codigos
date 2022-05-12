package Jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
		String sql = "CREATE TABLE pessoas("
				+ "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		System.out.println("Entidade OK");
		conexao.close();
	}
}
				

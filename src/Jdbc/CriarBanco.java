package Jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:?verifySeverCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "12111660";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		
		//Connection conexao = FabricaConexao.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("DATABASE OK");
		conexao.close();
		
		
	}
}

package Jdbc;

// AULA MUITO IMPORTANTE PQ AQUI APRENDO A ME CONECTAR AO DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost:?verifySeverCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "12111660";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		System.out.println("sua conexao efetuada com sucesso!!");
		conexao.close();

	}
}

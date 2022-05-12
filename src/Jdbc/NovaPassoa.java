package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NovaPassoa {
     public static void main(String[] args) throws SQLException {
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.print("Informe o nome: ");
    	String nome = entrada.nextLine();
    	
    	Connection conexao = FabricaConexao.getConexao();
    	/**
    	 * ********* DICA DE SEGURANÇA*******
    	 *  PreparedStatement stmt = conexao.prepareStatement(Sql);
    	    stmt.setString(1, nome );
    	    
    	    a partir dele vc passa parametros pra sua consulta
    	    ele estao sendo referenciados a partir das interrogaçoes
    	 * 
    	 * NUNCA CONCATENAR AS STRINGS NA HR DE MONTAR A CONSULTA SQL ISSO SERVE PRA TODAS AS
    	 * LINGUAGENS
    	 */
    	
    	String Sql = "insert into pessoas (nome) values (?)";
    	PreparedStatement stmt = conexao.prepareStatement(Sql);
    	stmt.setString(1, nome );
    	
    	stmt.execute();
    	System.out.println("Pessoa incluida com sucessoa!!!");
    	entrada.close();
     }
}
    	

    	
    	

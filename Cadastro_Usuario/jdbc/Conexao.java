package com.estudo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection obterConexao(){
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_aula","root","");
			System.out.println("Conex�o efetuada com sucesso!!!");
		} catch (SQLException e) {
			System.out.println("N�o foi poss�vel estabelecer uma conex�o segura!!!");
			e.printStackTrace();
		}
		return con;
		
	}
	

}

package com.estudo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection obterConexao(){
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_aula","root","");
			System.out.println("Conexão efetuada com sucesso!!!");
		} catch (SQLException e) {
			System.out.println("Não foi possível estabelecer uma conexão segura!!!");
			e.printStackTrace();
		}
		return con;
		
	}
	

}

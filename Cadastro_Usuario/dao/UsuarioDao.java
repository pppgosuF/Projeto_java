package com.estudo.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import com.estudo.entidade.Usuario;
	import com.estudo.jdbc.Conexao;

public class UsuarioDao {
	
	Connection con = Conexao.obterConexao();
	
	public void cadastrar(Usuario usuario){
	
		String sql = "INSERT INTO usuario(nome,login,senha) VALUES (?,?,?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Usuario cadastrado com sucesso!!!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}

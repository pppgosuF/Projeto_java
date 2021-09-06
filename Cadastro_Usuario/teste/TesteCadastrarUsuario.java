package com.estudo.teste;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;

public class TesteCadastrarUsuario {


	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.setNome("João Maria");
		usuario.setLogin("Jmaria");
		usuario.setSenha("1234");
		
		Usuario usuario01 = new Usuario();
		usuario.setNome("Maria João");
		usuario.setLogin("Mjoão");
		usuario.setSenha("1234");
				
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.cadastrar(usuario);
		
	}

}

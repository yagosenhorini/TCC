package br.com.sh.dao;

import java.util.List;

import br.com.sh.model.Usuario;
import br.com.sh.util.DAOFactory;

public class UsuarioRN {
	
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN(){
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	
	public Usuario carregar(Integer id){
		return this.usuarioDAO.carregar(id);
	}
	
	public Usuario buscarPorLogin(String login){
		return this.usuarioDAO.buscaPorLogin(login);
	}
	
	public void salvar(Usuario usuario){
		Integer id = usuario.getId();
		if(id==null || id==0){
			this.usuarioDAO.salvar(usuario);
		}else{
			this.usuarioDAO.atualizar(usuario);
		}
	}
	
	public void excluir(Usuario usuario){
		this.usuarioDAO.excluir(usuario);
	}
	
	public List<Usuario> listar(){
		return this.usuarioDAO.listar();
	}

}
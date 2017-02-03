package br.com.sh.dao;

import java.util.List;

import br.com.sh.model.Usuario;

public interface UsuarioDAO {

	public void salvar(Usuario usuario);
	public void atualizar(Usuario usuario);
	public void excluir(Usuario usuario);
	public Usuario carregar(Integer id);
	public Usuario buscaPorLogin(String login);
	public List<Usuario> listar();
	
}

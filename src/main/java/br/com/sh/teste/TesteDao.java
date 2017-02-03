package br.com.sh.teste;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class TesteDao {
	
	private Session sessao;

	public TesteDao(Session sessao) {
		this.sessao = sessao;

	}

	public void salvar(Hash insert) {
		sessao.save(insert);
	}
	
	public void atualizar(Hash insert){
		sessao.update(insert);
	}
	
	public void excluir(Hash insert){
		sessao.delete(insert);
	}
	
	@SuppressWarnings("unchecked")
	public List<TesteDao> listar(){
		Query consulta = sessao.createQuery("from Hash");
		return consulta.list();
	}
	
}

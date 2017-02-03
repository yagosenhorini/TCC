package br.com.sh.model;

import br.com.sh.model.Configuracao;
import br.com.sh.model.Usuario;

public class Menu {
	
	private Configuracao config;
	private Usuario usuario;
	
	public Configuracao getConfig() {
		return config;
	}
	public void setConfig(Configuracao config) {
		this.config = config;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
		
	@Override
	public String toString() {
		return "Menu [config=" + config + ", usuario=" + usuario + "]";
	}
	public void sair(){
		
	}

}

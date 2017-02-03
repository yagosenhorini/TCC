package br.com.sh.model;

import br.com.sh.model.Comodo;

public class Dashboard {
	
	private Comodo comodo;

	public Comodo getComodo() {
		return comodo;
	}

	public void setComodo(Comodo comodo) {
		this.comodo = comodo;
	}
	
	@Override
	public String toString() {
		return "Dashboard [comodo=" + comodo + "]";
	}

	public Comodo selecionaComodo(Comodo comodo){
		
		return comodo;
		
	}
	

}

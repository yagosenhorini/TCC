package br.com.sh.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ControleBean {
	
	public void print(){
		System.out.println("Evento aceito.");
	}
	

}

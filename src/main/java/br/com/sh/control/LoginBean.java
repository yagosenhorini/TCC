package br.com.sh.control;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.sh.model.Usuario;
	
@ManagedBean
@RequestScoped
public class LoginBean {

	Usuario us = new Usuario();

	public String doLogin() {
		if ("admin".equals(us.getLogin()) && "admin".equals(us.getSenha())) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Bem vindo, " + us.getLogin()));
			return "sistema.xhtml	?faces-redirect=true";
		}

		else {
                    
                        FacesMessage msg = new FacesMessage("Usuário ou senha inválido!");
                        FacesContext.getCurrentInstance().addMessage("erro", msg);
   			return "login.xhtml ?faces-redirect=true";
		}

	}

	public Usuario getUs() {
		return us;
	}

	public void setUs(Usuario us) {
		this.us = us;
	}

}

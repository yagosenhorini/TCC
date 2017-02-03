package br.com.sh.control;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.sh.dao.UsuarioRN;
import br.com.sh.model.Usuario;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class CadastroBean {

	private Usuario usuario = new Usuario();
	private String confirmarSenha;

	private List<Usuario> lista;
	private String destinoSalvar;

	public String editar() {
		this.confirmarSenha = this.usuario.getSenha();
		return "sistema";
	}

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();

		String senha = this.usuario.getSenha();
		if (!senha.equals(this.confirmarSenha)) {
			FacesMessage facesMessage = new FacesMessage("A senha não confere");
			context.addMessage(null, facesMessage);
			return null;
		}

		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(usuario);
		return this.destinoSalvar;
	}


	/*
	 * public String ativar(){ if(this.usuario.isAtivo())
	 * this.usuario.setAtivo(false); else this.usuario.setAtivo(true);
	 * 
	 * UsuarioRN usuarioRN = new UsuarioRN(); usuarioRN.salvar(this.usuario);
	 * return null; }
	 */

	public List<Usuario> getLista() {
		if (this.lista == null) {
			UsuarioRN usuarioRN = new UsuarioRN();
			this.lista = usuarioRN.listar();
		}

		return this.lista;
	}

	public void excluir() {
            FacesContext context = FacesContext.getCurrentInstance();
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.excluir(usuario);
                FacesMessage facesMessage = new FacesMessage("Usuário Excluído");
			context.addMessage(null, facesMessage);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}
}
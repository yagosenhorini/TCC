package br.com.sh.teste;

import javax.persistence.*;

@Entity
@Table(name = "hash")
public class Hash {


		@Id
		@GeneratedValue
	
		private Integer id;
	
		@Column(name="senha")
		private String senha;
		
		@Column(name="senha_criptografada")
		private String senha_criptografada;

		public String getSenha_criptografada() {
			return senha_criptografada;
		}

		public void setSenha_criptografada(String senha_criptografada) {
			this.senha_criptografada = senha_criptografada;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

}

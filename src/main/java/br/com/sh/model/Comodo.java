package br.com.sh.model;

public class Comodo {
	
	private int id;
	
	private boolean iluminacao;

	public boolean isIluminacao() {
		return iluminacao;
	}

	public void setIluminacao(boolean iluminacao) {
		this.iluminacao = iluminacao;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comodo other = (Comodo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Comodo [iluminacao=" + iluminacao + "]";
	}

	public void metodo(){
		
	}

}

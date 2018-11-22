package es.adama.spring.controladores.conversores;

import java.util.List;
import java.util.Map;

public class Anidado {

	private Integer numero;
	
	private List<Anidado> lista;
	
	private Map<String, Anidado> mapa;

	public List<Anidado> getLista() {
		return lista;
	}

	public void setLista(List<Anidado> lista) {
		this.lista = lista;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Anidado [" + (numero != null ? "numero=" + numero + ", " : "")
				+ (lista != null ? "lista=" + lista + ", " : "") + (mapa != null ? "mapa=" + mapa : "") + "]";
	}

	public Map<String, Anidado> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Anidado> mapa) {
		this.mapa = mapa;
	}
	
	
}

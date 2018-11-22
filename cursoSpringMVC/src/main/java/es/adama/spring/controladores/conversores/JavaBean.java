package es.adama.spring.controladores.conversores;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

public class JavaBean {
	
	//http://localhost:8080/cursoSpringMVC/conversor/objeto?anidado.mapa[Oli].lista[0].numero=120

	private Integer numero;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date fecha;
	
	private Collection<Integer> coleccion;
	
	private List<Integer> lista;
	
	private Map<Integer, String> mapa;
	
	private Anidado anidado;
	

	public Anidado getAnidado() {
		return anidado;
	}

	public void setAnidado(Anidado anidado) {
		this.anidado = anidado;
	}

	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}

	public Map<Integer, String> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Integer, String> mapa) {
		this.mapa = mapa;
	}

	public Collection<Integer> getColeccion() {
		return coleccion;
	}

	public void setColeccion(Collection<Integer> coleccion) {
		this.coleccion = coleccion;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "JavaBean [" + (numero != null ? "numero=" + numero + ", " : "")
				+ (fecha != null ? "fecha=" + fecha + ", " : "")
				+ (coleccion != null ? "coleccion=" + coleccion + ", " : "")
				+ (lista != null ? "lista=" + lista + ", " : "") + (mapa != null ? "mapa=" + mapa + ", " : "")
				+ (anidado != null ? "anidado=" + anidado : "") + "]";
	}

	

}

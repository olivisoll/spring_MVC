package es.adama.spring.controladores.conversores.mensajes;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JavaBean {
	
	
	private String fruta;
	private String coche;
	
	public String getFruta() {
		return fruta;
	}
	
	public void setFruta(String fruta) {
		this.fruta = fruta;
	}
	
	public String getCoche() {
		return coche;
	}
	
	public void setCoche(String coche) {
		this.coche = coche;
	}
	
	public JavaBean(String fruta, String coche) {
		super();
		this.fruta = fruta;
		this.coche = coche;
	}
	
	public JavaBean() {
		// TODO Auto-generated constructor stub
	}
}

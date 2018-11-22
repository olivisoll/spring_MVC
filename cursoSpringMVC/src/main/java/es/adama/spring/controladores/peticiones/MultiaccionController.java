package es.adama.spring.controladores.peticiones;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/multiaccion/*")
public class MultiaccionController {
	@RequestMapping("/path")
	public @ResponseBody String peticionPorPath() {
		return "Petición por path ";
	}
	
	@RequestMapping(value="/metodo", method=RequestMethod.GET)
	public @ResponseBody String peticionPorMetodo() {
		return "Petición por método";
	}
	
	@RequestMapping(value="/parametro", method=RequestMethod.GET,params="param1")
	public @ResponseBody String peticionPorParametro() {
		return "Petición por presencia de parámetro";
	}
	
	@RequestMapping(value="/parametro", method=RequestMethod.GET, params="!param1")
	public @ResponseBody String peticionPorAusenciaDeParametro() {
		return "Petición por ausencia de parametro";
	}
	
	@RequestMapping(value="/cabeceras", method=RequestMethod.GET,headers="Accept=text/plain")
	public @ResponseBody String peticionPorCabecera() {
		return "Petición por presencia de cabecera";
	}
	
	@RequestMapping(value="/produces", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorProduces() {
		return "Petición por produces application/json";
	}
	
	@RequestMapping(value="/*")
	public @ResponseBody String peticionPorExpresionRegular() {
		return "Petición por expresión regular";
	}
}

package es.adama.spring.controladores.conversores;

import java.util.Collection;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/conversor/*")
public class ConversorDatosController {
	
	@RequestMapping("/entero")
	public @ResponseBody String entero(@RequestParam Integer numero) {
		return "Dato numérico convertido "+ numero;
	}
	
	@RequestMapping("/fecha") // importar librería joda-time en el pom
	public @ResponseBody String entero(@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date fecha) {
		return "Dato fecha convertido "+ fecha;
	}
	
	@RequestMapping("/coleccion")
	public @ResponseBody String coleccion(@RequestParam Collection<Integer> coleccion) {
		return "Dato colección de números convertido "+ coleccion;
	}
	
	@RequestMapping("/coleccionfechas")
	public @ResponseBody String coleccionFechas(@RequestParam @DateTimeFormat(iso=ISO.DATE)Collection<Date> fechas) {
		return "Dato colección de fechas convertido "+ fechas;
	}
	
	@RequestMapping("/objeto")
	public @ResponseBody String objeto(JavaBean bean) {
		return "Datos del JavaBean " + bean;
	}
	
	
}

package es.adama.spring.controladores.vistas;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vistas/*")
public class VistasController {
	@RequestMapping("/hola")
	public ModelAndView modelandView() {
		String mensaje = "Oli";
		String mensaje2="Otro mensaje";
		Map<String, String> modelo = new HashMap<>();
		modelo.put("mensaje1", mensaje);
		modelo.put("mensaje2", mensaje2);
		return new ModelAndView("hello", "modelo", modelo);
	}
	
	@RequestMapping("/saludos") //llama a página hello, por la configuración del servlet-context
	public String vistaUno(Model modelo) {
		modelo.addAttribute("mensaje1", "Oli");
		modelo.addAttribute("mensaje2", "Nuevo mensaje");
		return "hello"; // esta cadena se convierte en la vista, y el modelo de entrada irá a la vista
	}
	
	@RequestMapping(value="/saludosDos/{mensaje1}/{mensaje2}") // asume que lo que viene por path variable es el modelo que se enviará a la página (vista)
	public String vistaDos(@PathVariable String mensaje1, @PathVariable String mensaje2) {
		return "hello"; 
	}
	
	@RequestMapping(value="/saludosTres/{mensaje1}/{mensaje2}") 
	public String vistaTres(JavaBean bean) {
		return "hello"; 
	}
	
	@RequestMapping("/vistaCuatro")
	public void vistaCuatro() {
		
	}
	
	@RequestMapping("/vistaCinco")
	public String vistaCinco() {
		return "vistas/vistaCuatro";
	}
	
	
}

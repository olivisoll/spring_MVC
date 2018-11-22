package es.adama.spring.controladores.datos;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/datos-estandar")
public class DatosEstandarController {
	
	@RequestMapping("/datos")
	public @ResponseBody String datosEstandar(HttpServletRequest request, Locale idioma) {
		String nombre=request.getParameter("name");
		String language = idioma.getDisplayLanguage();
		return "Name="+nombre+ " Language="+language;
	}

}

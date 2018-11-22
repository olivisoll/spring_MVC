package es.adama.spring.controladores.datos;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("datos/*")
public class DatosController {

	// con query-string
	@RequestMapping(value = "/parametro", method = RequestMethod.GET)
	public @ResponseBody String conParametro(@RequestParam String param1) {
		return "Valor obtenido del param1=" + param1;
	}

	// con path variable
	@RequestMapping(value = "/pathvariable/{param1}", method = RequestMethod.GET)
	public @ResponseBody String conPathVariable(@PathVariable String param1) {
		return "Valor obtenido del param1=" + param1;
	}

	// con matrix variable
	@RequestMapping(value = "/{param1}/cualquiercosa", method = RequestMethod.GET)
	public @ResponseBody String conMatrixVariable(@PathVariable String param1, @MatrixVariable String variableMatriz) {
		return "Valor obtenido de la matriz=" + variableMatriz + " del segmento param1=" + param1;
	}

	// con matrix variable
	@RequestMapping(value = "/{param1}/{param2}", method = RequestMethod.GET)
	public @ResponseBody String withMatrixVariablesMultiple(@PathVariable String param1,
			@MatrixVariable(value = "variableMatriz", pathVar = "param1") String matriz1, @PathVariable String param2,
			@MatrixVariable(value = "variableMatriz", pathVar = "param2") String matriz2) {
		return "Obtenida variableMatriz=" + matriz1 + " desde la ruta '" + param1 + "' y la variableMatriz=" + matriz2
				+ " desde la ruta '" + param2 + "'";
	}

	// con cabeceras
	@RequestMapping(value = "/cabeceras", method = RequestMethod.GET)
	public @ResponseBody String conCabeceras(@RequestHeader String Accept) {
		return "Valor obtenido de la cabecera=" + Accept;
	}

	@RequestMapping(value = "/cabecerasOtro", method = RequestMethod.GET)
	public @ResponseBody String conOtraCabeceras(@RequestHeader(value = "User-Agent") String userAgent) {
		return "Valor obtenido de la cabecera=" + userAgent;
	}

	// con cookies
	@RequestMapping(value = "/cookies", method = RequestMethod.GET)
	public @ResponseBody String conCookies(@CookieValue String JSESSIONID) {
		return "Valor obtenido de la cookie=" + JSESSIONID;
	}

	// con body post
	@RequestMapping(value = "/body", method = RequestMethod.POST)
	public @ResponseBody String conBody(@RequestBody String body) {
		return "Valor obtenido del body=" + body;
	}
	
	@RequestMapping(value = "/entity", method = RequestMethod.POST)
	public @ResponseBody String conEntity(HttpEntity<String> entity) {
		return "Valor obtenido del body '" + entity.getBody() + "'; headers=" + entity.getHeaders();
	}
}

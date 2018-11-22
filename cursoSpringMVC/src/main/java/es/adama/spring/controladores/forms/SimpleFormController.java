package es.adama.spring.controladores.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class SimpleFormController {
	
	@RequestMapping(value="/simpleform", method=RequestMethod.GET)
	public String loadForm(Model modelo) {
		modelo.addAttribute(new Usuario());
		return "simpleform";
	}
	
	@RequestMapping(value="/simpleform", method=RequestMethod.POST)
	public String captureDataForm(@ModelAttribute Usuario usuario, Model modelo) {
		modelo.addAttribute(usuario);
		return "responseform";
	}
}

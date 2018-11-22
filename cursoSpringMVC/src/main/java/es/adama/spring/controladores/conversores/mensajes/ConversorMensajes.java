package es.adama.spring.controladores.conversores.mensajes;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rometools.rome.feed.atom.Feed;
import com.rometools.rome.feed.rss.Channel;



@Controller
@RequestMapping("/conversor-mensajes/*")
public class ConversorMensajes {
	
	@RequestMapping(value="/xml", method=RequestMethod.GET)
	public @ResponseBody JavaBean xml() {
		return new JavaBean("manzanas", "renault");
	}
	
	@RequestMapping(value="/json", method=RequestMethod.GET)
	public @ResponseBody JavaBean json() {
		return new JavaBean("peras", "bmw");
	}
	
	@RequestMapping(value="/atom", method=RequestMethod.GET)
	public @ResponseBody Feed atom() {
		Feed feed = new Feed();
		feed.setFeedType("atom_1.0");
		feed.setTitle("Titulo de prueba");
		return feed;
	}
	
	@RequestMapping(value="/rss", method=RequestMethod.GET)
	public @ResponseBody Channel rss() {
		Channel channel = new Channel();
		channel.setFeedType("rss_2.0");
		channel.setTitle("Titulo del RSS");
		channel.setDescription("Cuerpo de la descripción");
		channel.setLink("http://www.dicotraining.com");
		return channel;
	}

}

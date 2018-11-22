package es.olitraining.rest;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import es.olitraining.weather.domains.Country;
import es.olitraining.weather.places.Places;
import es.olitraining.weather.weather.Query;
import es.olitraining.weather.weather.Weather;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final String WEATHER_SUFFIX = "%22&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
	private static final String WEATHER_PREFIX = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20WHERE%20woeid%3D%22";
	private static final String PLACES_SUFFIX = WEATHER_SUFFIX;
	private static final String PLACES_PREFIX = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20geo.places%20WHERE%20text%3D%22";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute(new Country());

		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String home(@ModelAttribute Country country, Model model)
			throws RestClientException, URISyntaxException, UnsupportedEncodingException {
		RestTemplate restTemplate = new RestTemplate(); // RestTemplate permite recuperar un objeto a partir de una
														// consulta http
		Places places = restTemplate.getForObject(
				new URI(PLACES_PREFIX + URLEncoder.encode(country.getCountry(), "UTF-8") + PLACES_SUFFIX),
				Places.class); // Codificamos en formato URI el valor recogido del formulario, puesto que hay
								// localidades que cuentan con espacios, y eso daría un error en la consulta, al
								// ser un carácter no admitido

		String woeid = places.getQuery().getResults().getPlace().get(0).getWoeid();

		Weather weather = restTemplate.getForObject(new URI(WEATHER_PREFIX + woeid + WEATHER_SUFFIX), Weather.class);

		Query query = weather.getQuery();

		model.addAttribute("forecast", query.getResults().getChannel().getItem().getDescription());

		return "result";
	}

}

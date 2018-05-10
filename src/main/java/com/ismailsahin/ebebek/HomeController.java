package com.ismailsahin.ebebek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "home";
	}

	@RequestMapping(value = "/profil", method = RequestMethod.GET)
	public String adminGiris(HttpServletRequest req) {
		return Utils.denetim(req, "profil");
	}

}

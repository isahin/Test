package com.ismailsahin.ebebek;

import javax.servlet.http.HttpServletRequest;

public class Utils {

	public static String denetim(HttpServletRequest req, String sayfa) {
		boolean oturumDurum = req.getSession().getAttribute("id") == null;
		if (oturumDurum) {
			return "redirect:/";
		} else {
			return sayfa;
		}
	}

}

package com.ismailsahin.ebebek;

import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.PreparedStatement;

@Controller
public class LoginController {

	DB db = new DB();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginDenetim(Properties pr, Model model, HttpServletRequest req) {

		if (pr.getEmail().equals("") || pr.getPassword().equals("")) {
			req.getSession().setAttribute("hata", " Kullanýcý adý yada Sifre Boþ Olamaz");
			return "redirect:/login";
		}

		try {

			String q = "select * from users where umail = ? and upassword = ?";
			PreparedStatement pre = db.preBaglan(q);

			pre.setString(1, pr.getEmail());
			pre.setString(2, pr.getPassword());

			ResultSet rs = pre.executeQuery();

			if (rs.next()) {
				pr.setEmail(rs.getString("umail"));
				pr.setPassword(rs.getString("upassword"));
				req.getSession().setAttribute("id", pr.getId());
				return "redirect:/profil";

			} else {
				model.addAttribute("hata", " Kullanýcý adý yada þifre hatalý");

			}

		} catch (Exception e) {
			System.err.println("Database Hatasý" + e);
		}

		return "login";

	}

	@RequestMapping(value = "/cikis", method = RequestMethod.GET)
	public String cikisYap(HttpServletRequest req) {

		req.getSession().removeAttribute("id");
		req.getSession().invalidate();

		return "redirect:/";
	}

}

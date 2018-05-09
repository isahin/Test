package com.ismailsahin.deneme;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

	DB db = new DB();

	@RequestMapping (value="/register", method=RequestMethod.GET)
	public String register () {
		
		return "register";
		
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	public String kayit(Properties adm) {
		
		try {
			String q = "insert into users values (null, ?, ? , ?)";
			PreparedStatement pre = db.preBaglan(q);
			pre.setString(1, adm.getName());
			pre.setString(2, adm.getEmail());
			pre.setString(3, adm.getPassword());
			pre.executeUpdate();

			
		} catch (Exception e) {
			System.err.println("Yazma hatasi " + e);
		
		}
		return "";
	}
	
	
	
	
	
	@RequestMapping(value = "/cikis", method = RequestMethod.GET)
	public String cikisYap(HttpServletRequest req) {
		
		// tekil oturum kapatma
		req.getSession().removeAttribute("id"); // sadece kid sessioný siler
		req.getSession().invalidate(); // tüm oturularý sil
		
		return "redirect:/login";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

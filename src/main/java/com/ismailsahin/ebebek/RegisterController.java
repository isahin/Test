package com.ismailsahin.ebebek;

import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

	DB db = new DB();

	@RequestMapping(value = "/registeropen", method = RequestMethod.GET)
	public String register() {

		return "register";

	}

	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	public String kayit(Properties adm, HttpServletRequest req) {
		
		if(adm.getName().equals("") || adm.getEmail().equals("") || adm.getPassword().equals("")) {
			req.getSession().setAttribute("hata", "Bütün Alanlar Dolu Olmalýdýr!");
			return "redirect:/register";
		} 
			try {
				String q = "insert into users values (null, ?, ? , ?)";
				PreparedStatement pre = db.preBaglan(q);
				pre.setString(1, adm.getName());
				pre.setString(2, adm.getEmail());
				pre.setString(3, adm.getPassword());
				pre.executeUpdate();
				
				return "redirect:/register";

				
			} catch (Exception e) {
				System.err.println("Yazma hatasi " + e);

			}
			
		

	
		return "register";
		
		
	}

}

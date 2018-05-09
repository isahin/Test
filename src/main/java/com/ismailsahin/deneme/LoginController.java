package com.ismailsahin.deneme;

import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.PreparedStatement;

@Controller
public class LoginController {
	
	DB db= new DB();
	
	
	@RequestMapping (value="/login", method=RequestMethod.GET)
	public String login () {
		
		return "login";
		
	}
	

	
	@RequestMapping (value="/login", method=RequestMethod.POST)
	public String loginDenetim (Properties pr,Model model, HttpServletRequest req) {
		
		System.out.println("email:"+pr.getEmail());
		System.out.println("password: " +pr.getPassword());
		
		if(pr.getEmail().equals("") || pr.getPassword().equals("")) {
			req.getSession().setAttribute("hata", "setAtt Kullanýcý adý yada Sifre Boþ Olamaz");
		//	model.addAttribute("hata", "Kullanýcý Adý ve Sifre Boþ Girilemez");
			return "redirect:/login";
		}
		
		Properties pro = null;
		
		
		try {
			
			String q = "select * from users where umail = ? and upassword = ?";
			PreparedStatement pre = db.preBaglan(q);
			
			System.out.println("giris yap");

			pre.setString(1, pr.getEmail());
			pre.setString(2, pr.getPassword());
			System.out.println("giris yapýldý");
			ResultSet rs = pre.executeQuery();
			
			
			while(rs.next()) {
				Properties proa = new Properties();
				String mail = rs.getString(3);
				String pass = rs.getString(4);
				System.out.println("m : " + mail);
				System.out.println("pass : " + pass);
				proa.setEmail(rs.getString("umail"));
				proa.setPassword(rs.getString("upassword"));
				req.getSession().setAttribute("id",proa.getId());
				 return "redirect:/profil";

			}

		} catch (Exception e) {
			System.err.println("Database Hatasý"+e);
		}
		
		req.getSession().setAttribute("hata", "setAtt Kullanýcý adý yada Sifre Hatalý");

//			model.addAttribute("hata", "Kullanýcý Adý veya Þifre Hatalý");
		return "login";
		

	}
	

	
	

}

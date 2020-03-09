package com.procheckup.xss;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DomStoredController {

// Controller for Client-side stored XSS
	
	@GetMapping("/xss_four")
	public String dom(Model model, @CookieValue(value = "security-level", defaultValue = "0") int level, HttpServletResponse response) {
		
		model.addAttribute("level", level);
		
		String XSS_level;
		
//		switch 1,2,3
		switch(level) {
		case 0:
			XSS_level = "0";
			break;
		case 1:
			XSS_level = "1";
			break;
		case 2:
			XSS_level = "1; mode=block";
			break;
		default:
			XSS_level = "0";
			break;
		}
		
		response.addHeader("X-XSS-Protection", XSS_level);
		
		
		return "dom_stored";
	}
}

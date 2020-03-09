package com.procheckup.xss;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

	// Controller for Server-side reflected XSS

	@GetMapping("/xss_one")
	public String greetingForm(Model model, @RequestParam(value="search", required=false) String search, @CookieValue(value = "security-level", defaultValue = "0") int level, HttpServletResponse response) {
		model.addAttribute("search", search);
		model.addAttribute("level", level);
		
		String XSS_level;
		
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
		
		return "search";
	}

	@GetMapping("/multiple_param")
	public String multiple_parms(Model model, @RequestParam(value="search", required=false) String search, @RequestParam(value="second_search", required = false) String second_search, @CookieValue(value = "security-level", defaultValue = "0") int level, HttpServletResponse response) {
		model.addAttribute("search", search);
		model.addAttribute("second_search", second_search);
		model.addAttribute("level", level);
		
		String XSS_level;
		
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
		
		return "multiple";
	}
	
}

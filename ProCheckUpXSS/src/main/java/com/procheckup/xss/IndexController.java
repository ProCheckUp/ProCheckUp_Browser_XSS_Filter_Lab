package com.procheckup.xss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model, @CookieValue(value = "security-level", defaultValue = "0") int level) {
		model.addAttribute("level", level);
		
		return "index";
	}
}

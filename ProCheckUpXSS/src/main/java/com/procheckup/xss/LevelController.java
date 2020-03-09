package com.procheckup.xss;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LevelController {

	@GetMapping("/level/{id}")
	public String level(@PathVariable("id") int id, HttpServletResponse response, HttpServletRequest request) {
		
		String level;
		
		
		switch(id) {
		case 0:
			level = "0";
			break;
		case 1:
			level = "1";
			break;
		case 2:
			level = "2";
			break;
		default:
			level = "0";
			break;
		}
		
		Cookie cookie = new Cookie("security-level", level);
		cookie.setHttpOnly(true);
		cookie.setPath("/");
		response.addCookie(cookie);
		
		
		return "redirect:" + request.getHeader("Referer"); // Insecure but meh
	}
}

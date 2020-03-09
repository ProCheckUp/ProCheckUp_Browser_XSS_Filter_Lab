package com.procheckup.xss;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {

	private CommentRepository commentRepo;
	
	// Controller for Server-side stored XSS
	
	@Autowired
	public CommentController(CommentRepository commentRepo) {
		super();
		this.commentRepo = commentRepo;
	}

	@GetMapping("/xss_two")
	public String comment(Model model, @CookieValue(value = "security-level", defaultValue = "0") int level, HttpServletResponse response) {
		
		List<Comment> comments = commentRepo.findAll();
		
		if(comments != null) {
			model.addAttribute("comment", comments);
		}
		
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
		
		return "comment";
	}
	
	@PostMapping("/xss_two")
	public String addComment(String name, String message, Comment comment) {
		comment.setName(name);
		comment.setMessage(message);
		commentRepo.save(comment);
		return "redirect:/xss_two";
	}
}

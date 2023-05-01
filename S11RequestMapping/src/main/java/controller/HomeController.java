package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//@RequestMapping("/home")
	@GetMapping("/home.do")
	public String home() {
		return "home"; // home.jsp
	}
	
	@RequestMapping("/")
	public String home2() {
		return "home"; // home.jsp
	}
}

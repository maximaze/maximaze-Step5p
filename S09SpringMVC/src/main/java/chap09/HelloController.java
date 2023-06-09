package chap09;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/hello")	// HTTP: GET 방식으로 요청을 받음
	public String hello(Model model,
			@RequestParam(value = "name", required = false) String name) {
		model.addAttribute("greeting", "안녕하세요, " + name);
		return "hello"; // 뷰이름 : hello.jsp
	}
	
	@GetMapping("/hello2")
	public String hello2(Model model, HttpServletRequest request) {
		String name = request.getParameter("name");
		model.addAttribute("greeting", "Welcome to " + name);
		return "hello";
	}
	
	@GetMapping("/hello3")
	public String hello3(Model model,
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "email", required = false) String email) {
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("email", email);                                                                                                                                                                                                                                                                                                                                                                                                                                      
		return "hello3";
	}
	
	@GetMapping("/hello4")
	public String hello4(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("email", email);                                                                                                                                                                                                                                                                                                                                                                                                                                      
		return "hello4";
	}
}

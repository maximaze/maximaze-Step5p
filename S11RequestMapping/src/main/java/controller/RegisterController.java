package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.DuplicateMemberException;
import spring.MemberRegisterService;
import spring.RegisterRequest;

@Controller
public class RegisterController {

	private MemberRegisterService memberRegisterService;

	public void setMemberRegisterService(
			MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}

	@RequestMapping("/register/step1")
	public String handleStep1() {
		return "register/step1";	// webapp/WEB-INF/view/register/step1
	}

	@PostMapping("/register/step2")
	public String handleStep2(
			@RequestParam(value = "agree", defaultValue = "false") Boolean agree,
			Model model) {
		if (!agree) {
			return "register/step1";	// step1.jsp
		}
		// model.addAttribute(...)은 내부적으로 request.setAttribute(...)을 처리한다.
		model.addAttribute("registerRequest", new RegisterRequest());
		return "register/step2"; // forward(step2.jsp)
	}
	
	@PostMapping("/register/step2EL")
	public String handleStep2EL(
			@RequestParam(value = "agree", defaultValue = "false") Boolean agree,
			Model model) {
		if (!agree) {
			return "register/step1";
		}
		
		// EL(Expression Language) 처리 테스트
		RegisterRequest registerRequest = new RegisterRequest();
		registerRequest.setName("홍길동");
		registerRequest.setEmail("hgd@abc.co.kr");
		model.addAttribute("registerRequest", registerRequest);
		return "register/step2EL";	// forward(step2EL.jsp)		
	}

	@GetMapping("/register/step2")
	public String handleStep2Get() {
		return "redirect:/register/step1";
	}

	@PostMapping("/register/step3")
	public String handleStep3(RegisterRequest regReq) {
		try {
			memberRegisterService.regist(regReq);
			return "register/step3";
		} catch (DuplicateMemberException ex) {
			return "register/step2";
		}
	}

}

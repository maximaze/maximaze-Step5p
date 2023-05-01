[스프링 웹 MVC]

(프로젝트 생성)
1. Maven Project
	- war(Web Application Archive)
2. Pom.xml
	- spring-webmvc
	- javax.servlet-api
	- javax.servlet.jsp-api
	- jstl
3. web.xml
	- 패스: src/main/webapp/WEB-INF
	- WEB-INF는 보안의 영역이라 접근불가
	  MvcConfig를 통해서 WEB-INF 휘하에 있는 파일을 접근가능
	  실행을 위해서는 WEB-INF를 지우고 해당 파일명 url입력시 접속가능
4. 빈등록 설정 : MvcConfig.java
	- @Configuration
	- @EnableWebMvc

(pom.xml)
	 <dependencies>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.servlet.jsp</groupId>
			<artifactId>javax.servlet.jsp-api</artifactId>
			<version>2.3.2-b02</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
		
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>5.0.2.RELEASE</version>
		</dependency>
	</dependencies>
	
-------------------------------------------------------------------
(실행)
http://localhost:8584/S09SpringMVC/index.html
http://localhost:8584/S09SpringMVC/hello
http://localhost:8584/S09SpringMVC/hello?name=kim

(실행불가)
http://localhost:8584/S09SpringMVC/hello.jsp
http://localhost:8584/S09SpringMVC/WEB-INF/view/hello.jsp

(요청처리)
1. @Controller
	- 웹브라우저를 통해서 전송되는 요청을 처리
2. @GetMapping
	- HTTP : GET 방식으로 요청을 받음
3. @RequestParam
	- 웹브라우저 전송한 데이터를 수신 방식
	- request.getParameter("...")
	- required는 파라미터의 필수 유무 : true, false
4. HelloController.java
	- 요청 : http://localhost:8584/S09SpringMVC/hello?name=kim
	- 결과 : hello.jsp
	- 소스 :
	@Controller
	public class HelloController {
		@GetMapping("/hello")	// HTTP: GET 방식으로 요청을 받음
		public String hello(Model model,
				@RequestParam(value = "name", required = false) String name) {
			model.addAttribute("greeting", "안녕하세요, " + name);
			return "hello"; // 뷰이름 : hello.jsp
		}
	}
-----------------------------------------------------------------
(MvcConfig.java)
1. configureDefaultServletHandling(...)
	- DispatcherServlet의 매핑 경로를 "/"로 주었을 때,
	  JSP/HTML/CSS 등을 올바르게 처리하기 위한 설정을 추가한다.
	- 코드 :
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	





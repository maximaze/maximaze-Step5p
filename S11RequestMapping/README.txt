[요청 매핑, 커맨드 객체, 리다이렉트, 폼 태그, 모델]

1. @RequestMapping 설정
2. 요청 파라미터 접근
3. 리다이렉트
4. 개바환경구축
5. 스프링 폼 태그
6. 모델 처리



-----------------------------------------------------------------------

(실행)
1. 컨트롤러 구현 없는 경로 매필
	- 컨트롤러가 없어도 /main/으로 요청하면 뷰(main.jsp)를 보여준다.
2. 예: http://localhost:8584/S11RequestMapping/main
3. 코드 : MvcConfig.java
	@Configuration
	@EnableWebMvc
	public class MvcConfig implements WebMvcConfigurer {
		@Override
		public void addViewControllers(ViewControllerRegistry registry) {
			registry.addViewController("/main").setViewName("main");
		}
	}
4. 컨트롤러를 통한 매핑
	- http://localhost:8584/S11RequestMapping/Home
	- Homeontroller.java
	- 뷰(Home.jsp)로 연결
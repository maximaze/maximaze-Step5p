[Spring Form Tag]

1. HTML의 <form> 태그를 위한 커스텀 태그 : <form:form>
2. <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
3. method 속성을 지정하지 않으면 : "POST"
4. action 속성을 지정하지 않으면 : 현재 요청 URL
5. <input> 커스터 태그
	- <form:input>
	- <form:password>
	- <form:hidden>
6. <select> 커스텀 태그
	- <form:select>
	- <form:options>
	- <form:potion>
7. <checkbox> 커스텀 태그
	- <form:checkboxes>
	- <form:checkbox>
8. <radio> 커스텀 태그
	- <form:radiobuttons>
	- <form:radiobutton>
9. <textarea> 커스텀 태그
	- <form:textarea>
10. <form:form> 커스텀 태그와 HTML 일반 태그 혼용 가능

-----------------------------------------------------------------------------------
(실행)
1. http://localhost:8584/S11SpringFormTag/form
2. 요청: FormController.java
	- @modelAttirbute("formCommand") public FormCommand createCommand() 실행
	  요청 처리 메소드인 form(...)에 FormCommand 피라미드
	- @GetMapping
	  public String form(Model model,FormCommand formCmd)
	   
3. 로그인 뷰:
	- WEB-INF/view/form.jsp	  



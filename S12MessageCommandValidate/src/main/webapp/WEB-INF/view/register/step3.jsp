<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="member.register" /></title>
</head>
<body>
    <p>
    	<!-- 한개씩 할때느 argument로 하나씩 개입
        <spring:message code="register.done">
        	<spring:argument value="${registerRequest.name}" />
        	<spring:argument value="${registerRequest.email}" />
        </spring:message>
        -->
        <!-- 한꺼번에 할땐 arguments로 쉼표구분해서 개입 -->
        <spring:message code="register.done"
        	arguments="${registerRequest.name}, ${registerRequest.email}"/>
    </p>
    <p>
        <a href="<c:url value='/'/>"> <!-- main.jsp -->
            [<spring:message code="go.main" />]
        </a>
    </p>
</body>
</html>

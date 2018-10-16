<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="errorPage.jsp"%>
    <%
    	String s=null;
    	s.length();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 테스트 4</title>
</head>
<body>
	<h1>서블릿과 통신하기</h1>
	<h3><%@ include file="today.jsp" %> 오늘의 메뉴</h3>
	<form action="/jsp/menuOrder.do" method="get">
		<select name="menuSelect">
			<option value="낙지죽">낙지죽</option>
			<option value="닭갈비">닭갈비</option>
			<option value="김치볶음밥">김치볶음밥</option>
			<option value="나쵸">나쵸</option>
			<option value="김치찌개">김치찌개</option>
		</select>
	
		<button type="submit">선택완료</button>
	</form>
</body>
</html>
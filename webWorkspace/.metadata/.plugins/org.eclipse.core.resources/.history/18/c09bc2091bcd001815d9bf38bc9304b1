<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 서블릿에서 전달한 내용 확인하기
	String name=(String)request.getAttribute("name");
	String color=(String)request.getAttribute("color");
	String animal=(String)request.getAttribute("animal");
	String[] food=(String[])request.getAttribute("food");
%> 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>개인 취향 테스트 결과 (JSP)</title>
<style>
	span:nth-of-type(0){
		color:blue;
		font-weight:bold;
	}
	span:nth-of-type(1){
		color:green;
	}
	span:nth-of-type(2){
		color:yellowgreen;
	}
</style>
</head>
<body>
	<h1>개인 취향 테스트 결과 확인(JSP)</h1>
	<h2 style='color:blue;'>개인 취향 테스트 결과</h2>
	<span><%=name %></span>의 개인 취향은 <br>
	<span><%=color %></span>색을 좋아함<br>
	<span><%=animal %></span> 애호가<br>
	조와하는 식품은 <%for(String s:food){%> 
	<%=s%>
	<%} %>
	
</body>
</html>
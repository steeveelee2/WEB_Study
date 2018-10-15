<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
	// Date now=new Date();
	// String today=String.format("%tY년 %tm월 %td일 %tA",now,now,now,now);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 테스트 3</title>
</head>
<body>
	<h1>include</h1>
	
	<h2>오늘 점심 뭐먹?
		<%-- <span style="color:magenta;"><%=today %></span> --%>
		<%@ include file="today.jsp" %>
	</h2>
	<select>
		<option value="산낙지">산낙지</option>
		<option value="춘천식닭갈비">춘천식닭갈비</option>
		<option value="김치리조또">김치리조또</option>
		<option value="트래디셔널멕시칸나쵸">트래디셔널멕시칸나쵸</option>
		<option value="돼지고기김치찌개">돼지고기김치찌개</option>
	</select>
</body>
</html>
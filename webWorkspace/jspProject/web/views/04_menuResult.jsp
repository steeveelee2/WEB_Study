<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="errorPage.jsp"%>
<%
	String menu=(String)request.getAttribute("menu");
	int price=(Integer)request.getAttribute("price");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선택 결과 확인</title>
</head>
<body>
	<h2>주문 내역</h2>
	<p>
		메뉴 : <%=menu %>, 가격 : <%=price %>
	</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 페이지</title>
</head>
<body>
	<h1>에러 발생</h1>
	<p>관리자에게 문의하시오</p>
	<%=exception.getMessage() %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>
	<%@ include file="common/header.jsp" %>
	
	<h3>로그인 폼</h3>
	
	<form action="/jdbc1/login.do" method="post">
	
		ID : <input type="text" name="userId"/><br>
		PWD : <input type="password" name="userPwd"/><br>
		
		<input type="submit" value="로그인"/>
		
	</form>
	
	<%@ include file="common/footer.jsp" %>
</body>
</html>
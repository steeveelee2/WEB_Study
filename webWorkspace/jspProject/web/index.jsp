<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
	<h1>JSP 연습 페이지</h1>
	<h3>JSP?</h3>
	<p>JSP(Java Server Page)란, 1997년도에 개발된 Servlet을 사용하던 개발자들이 불편을 겪어 항의하여 1998년 개발된 기술<br>
	이로 인해 Servlet의 코드 중 화면 구현 코드를 별도의 페이지 파일로 쪼개서 비즈니스(서비스)로직과 화면구현로직을 분리할 수 있게 됨</p>
	
	<ol>
		<li>
			<a href="views/01_sum.jsp">테스트 1</a>
		</li>
		<li>
			<a href="views/02_date.jsp">테스트 2</a>
		</li>
		<li>
			<a href="views/03_lunchMenu.jsp">테스트 3</a>
		</li>
		<li>
			<a href="views/04_lunchMenuSelect.jsp">테스트 4</a>
		</li>
		<li>
			<a href="views/myHome.jsp">include 테스트</a>
		</li>
	</ol>
</body>
</html>
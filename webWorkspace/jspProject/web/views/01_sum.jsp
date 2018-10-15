<%-- Directive tag : 지시자 태그 --%>
<%-- 사용하는 페이지의 설정 등을 명시하는 태그 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- Declaration tag : 선언자 태그 --%>
<%!
	// 자바주석 가능
	// 선언자 태그는 해당 페이지에서 사용하고자 하는 변수를 등록할 때 사용한다
	int num1=100;
	int num2=200;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 테스트 1</title>
</head>
<body>
	<%-- Comments tag : JSP 주석 태그 --%>
	<!-- 일반 HTML 태그 -->
	<%-- JSP 주석은 사용자에게 전달되지 않는다 컴파일시 자바 서블릿의 주석으로 처리된다는 뜻 --%>
	
	<%-- Scriptlet tag : 스크립트 태그 --%>
	<%-- 자바의 소스코드를 입력하는 영역을 설정할 때 사용한다 --%>
	<%
		int total=0;
		
		for(int i=1;i<11;i++) total+=i;
	%>
	
	<%-- Expression tag : 포현 태그 --%>
	<%-- 자바로 생성된 코드의 값을 출력하는 태그 (out.println();) 표현 태그는 내부에서 out.println(); 으로 변하기 때문에 만약 ;을 붙이게 되면 out.println(value;)의 형태가 되어 에러가 발생한다--%>
	<%-- 아무튼 표현태그에는 세미콜론 붙이면 안됨 아무튼 그럼 --%>
	<h4>1부터 10까지의 합은 <%=total%></h4>
	<h4>1부터 10까지의 합은 <%out.println(total);%></h4>
</body>
</html>
<%-- 지시자 태그는 크게 page, include, taglib로 나뉜다
	그 중 page는 해당 jsp 페이지 관련된 설정을 적용할 때 사용한다
	또한 선언의 중복, 혼용, 충돌 막기 위해서 page 지시자는 한 번만 사용하는 것이 원칙이다 
	단, 예외적으로 import는 별도 추가 선언이 가능하다. 여러개 쓸 경우 구분은 콤마--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 테스트 2</title>
</head>
<body>
	<%
		// jsp 역시 java.lang.* 안에 들어있는 소스코드는 사용가능하지만, 다른 곳에서 참조하기 위한 클래스들은 import 선언을 해 주어야 한다.
		Date now=new Date();
	
		String date=String.format("%tF",now);
		String time=String.format("%tp %tT",now,now);
		String today=String.format("%tY년 %tm월 %td일 %tA",now,now,now,now);
		
	    /*
	           날짜  타입  format  ||               설명
	      ------------------------------------------------
	      %tF                     날짜를 yyyy-mm-dd 형식으로 포맷
	      %tT                     날짜의 시각을 HH:MM:SS 형식으로 포맷.
	      ------------------------------------------------------
	      %tY                     4자리 년도만 출력 
	      %ty                     2자리 년도
	      %tB                     월의 이름(January, February, March...)
	      %tm                     월을 01,02,03 ~12 로 출력
	      %td                     일수를 1~31 로 출력
	      %te                     %td 와 같음.
	      %tA                     요일명 출력
	      ---------------------------------------------------
	      %tp                     오전, 오후를 출력
	      %tk                     시간을 0~23 으로 출력.
	      %tl                     시간을 1~12 로 출력.
	      %tM                     분을 00 ~59 로 출력.
	      %tS                     초를 00 ~ 59 로 출력.
	      -----------------------------------------------------
	      %tZ                     타임존을 출력 (한국은 KST)
	      ---------------------------------------------------
	      */
	%>
	
	<ul style="list-style:decimal;">
		<li>오늘 날짜 : <%=date %></li>
		<li>현재 시각 : <%=time %></li>
		<li>오늘은 <%=today %>이다</li>
	</ul>
</body>
</html>
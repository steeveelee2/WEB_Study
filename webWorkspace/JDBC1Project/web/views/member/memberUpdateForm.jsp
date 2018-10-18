<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.kh.jdbc.model.vo.*" %>
<%
	Member m=(Member)session.getAttribute("m");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 페이지</title>
<script src="/jdbc1/resources/js/jquery-3.3.1.min.js"></script>
</head>
<body>
	<%@ include file="../common/header.jsp" %>
	
	<h1>회원 정보 수정 페이지</h1>
	
	<form action="/jdbc1/mUpdate.do" method="post" id="mUpdate">
		<table>
		
			<tr>
				<td>ID : </td>
				<td><%=m.getUserId() %></td>
			</tr>
			<tr>
				<td>변경할 PWD : </td>
				<td><input type="password" name="userPwd" id="userPwd"/></td>
				<td></td>
			</tr>
			<tr>
				<td>변경할 PWD 확인 : </td>
				<td><input type="password" name="userPwd2" id="userPwd2"/></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3" id="result"></td>
			</tr>
			<tr>
				<td>이름 : </td>
				<td><%=m.getUserName() %></td>
			</tr>
			<tr>
				<td>성별 : </td>
				<td>
					<input type="radio" name="gender" value="M"/>남성
					<input type="radio" name="gender" value="F"/>여성
				</td>
				<td></td>
			</tr>
			<tr>
				<td>나이 : </td>
				<td><input type="number" name="age" min="10" max="100" value="<%=m.getAge()%>"/></td>
				<td></td>
			</tr>
			<tr>
				<td>이메일 : </td>
				<td><input type="email" name="email" value="<%=m.getEmail()%>"/></td>
				<td></td>
			</tr>
			<tr>
				<td>연락처 : </td>
				<td><input type="tel" name="phone" value="<%=m.getPhone()%>"/></td>
				<td></td>
			</tr>
			<tr>
				<td>주소 : </td>
				<td><input type="text" name="address" value="<%=m.getAddress()%>"/></td>
				<td></td>
			</tr>
			<tr>
				<td>취미 : </td>
				<td>
					<input type="checkbox" name="hobby" value="자전거"/>자전거 &nbsp;&nbsp;
					<input type="checkbox" name="hobby" value="독서"/>독서 &nbsp;&nbsp;
					<input type="checkbox" name="hobby" value="산책"/>산책 <br>
					<input type="checkbox" name="hobby" value="음악감상"/>음악감상 &nbsp;&nbsp;
					<input type="checkbox" name="hobby" value="낚시"/>낚시 &nbsp;&nbsp;
					<input type="checkbox" name="hobby" value="여행"/>여행 
				</td>
			</tr>
			<tr>
				<td></td>
				<td colspan="2">
					<input type="submit" value="회원 정보 수정"/>
					&nbsp;&nbsp;
					<input type="button" onclick="memberDel();" value="회원 탈퇴"/>
				</td>
			</tr>
		
		</table>
	</form>
	
	<br><br>
	
	<a href="/jdbc1/index.jsp">처음으로 돌아가기</a>
	
	<%@ include file="../common/footer.jsp" %>
	
	<script>
		// 일반적으로 script 작성 구간은 어디가 되든 큰 문제는 없으나 HTML과 CSS가 웹 문서에 로드되는 시점을 고려한다면 head영역이나 body의 최하단에 작성하여 로드된 이후, 로드 시점에 동작함으로써 웹 문서 표현의 속도를 높이는 방식을 권장한다
		$(function(){
			// 성별 radio 선택하기
			$('input:radio').each(function(){
				if($(this).val()=='<%=m.getGender()%>') {
					$(this).prop('checked',true);
				}else{
					$(this).prop('checked',false);
				}
				
				$(this).prop('disabled',true);
			});
			
			// 취미 checkbox 선택하기
			var array='<%=m.getHobby()%>'.split(', ');
			
			console.log(array);
			
			$('input:checkbox').each(function(){
				if($.inArray($(this).val(),array)>-1){
					$(this).prop('checked',true);
				}else{
					$(this).prop('checked',false);
				}
			});
			
			// 변경 비밀번호 일치 여부 확인하기
			$('#mUpdate').submit(function(){
				// 비밀번호가 일치하지 않을 때
				if($('#userPwd').val()!=$('#userPwd2').val()){
					$('#result').text('비밀번호가 일치하지 않다').show().fadeOut(1000);
				} // 비밀번호를 입력하지 않았을 때
				else if($('#userPwd').val()==""){
					$('#result').text('비밀번호를 입력하라').show().fadeOut(1000);
				} // 정상 입력 시
				else{
					return;
				}
				
				event.preventDefault();
			});
			
		});
		
		// '회원 탈퇴' 버튼을 누를 경우 mDelete.do로 이동시키기
		function memberDel(){
			location.href="/jdbc1/mDelete.do";
		}
	</script>
</body>
</html>
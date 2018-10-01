/*
	실습 문제 2: javascript 파일
	작성자 : OOO 
           // 본인 이름 적어주세요
	작성일 : yyyy-mm-dd 
           // 오늘 날짜를 적어 주세요.
	스크립트 설명 :
	   실습2 에 해당하는 자바스크립트 파일입니다.
*/
//요구한 내용을 변수, 연산자, 제어문 등을 사용하여 실행되게 하세요.
//제목 체크시, titleBox 만 보여지게
//날짜 체크시, dateBox 만 보여지게
//작성자 체크시, writerBox 만 보여지게 함
	function showDiv(element){
		var clsList = document.getElementsByClassName("box");
		for(var i= 0; i < clsList.length ; i++) clsList[i].style.display = "none";
		
		if(element.checked == true && element.value == "title"){
			document.getElementById("titleBox").style.display = "block";	
			// document.getElementById("dateBox").style.display = "none";
			// document.getElementById("writerBox").style.display = "none";
		}
		if(element.checked == true && element.value == "date"){
			// document.getElementById("titleBox").style.display = "none";	
			document.getElementById("dateBox").style.display = "block";
			// document.getElementById("writerBox").style.display = "none";
		}
		if(element.checked == true && element.value == "writer"){
			// document.getElementById("titleBox").style.display = "none";	
			// document.getElementById("dateBox").style.display = "none";
			document.getElementById("writerBox").style.display = "block";
		}
	}

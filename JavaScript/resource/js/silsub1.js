// 1. 실습 문제
function changeQuery(){
    // 함수의 실행 내용(로직)을 작성해 주세요.
    var input=document.getElementById("result1");
    var answer="INSERT INTO EMPLOYEE VALUES ('100', '홍길동', 'HR부서', 2000000, 0.1);";
    input.value=answer;
}

function checkOddEven() {
    //함수의 로직을 작성하세요.
    var num=parseInt(window.prompt("내용 입력"));
    var resultP=document.getElementById("silsub2");
    
    if(num%2==0){
        resultP.innerHTML="짝수다";
    }else if(num%2==1){
        resultP.innerHTML="홀수다";
    }else {
        resultP.innerHTML="숫자가 아니다.";
    }
}

function changeImage(){
   // 함수의 로직을 작성하세요.
   // hint : setAttribute('속성명', '속성값');
    var image=document.getElementById("image1");
    image.setAttribute("src","../resource/images/Android.gif");
}

function changeCSS(){
    //함수의 로직을 작성하세요.
    var color=document.getElementById("silsub3");
    color.setAttribute("style","color:navy;");
}

function calculator(op){
    //함수의 로직을 작성하세요.
   var num1=Number(document.getElementById("num1").value);
   var num2=Number(document.getElementById("num2").value);
   var result="";
    switch(op){
        case "+":
            result=num1+num2;
            break;
        case "-":
            result=num1-num2;
            break;
        case "x":
            result=num1*num2;
            break;
        case "/":
            result=num1/num2;
            break;
        case "%":
            result=num1%num2;
    }
    calc.innerHTML+=result;
}
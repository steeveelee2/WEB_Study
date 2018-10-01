function execute() {
    /// num1과 num2의 결과를 합쳐서 result에 보여주기
    var num1 = document.getElementById('num1');
    var num2 = document.getElementById('num2');
    

// 계산 결과가 숫자이면 계산 결과를 출력하고,
// 계산 결과가 숫자가 아니면 "숫자가 아닙니다."라고 출력하세요.

    // 1. 문자 --> 숫자를 사용한 방법
    // 문자-> 숫자 : parseInt(), Number() (실수 : parseFloat())
    
    // 2. 정규식을 사용한 방법
   
    // 정규식 이용한 숫자 검사
    // validation : 유효성 체크
    /*
    정규식 작성법
    1. var re = /정규식/;
    2. var re = new RegExp("정규식");
    */
   var re=/\d/;
   var res=document.getElementById("result");
   if(re.test(num1.value)&&re.test(num2.value)) res.innerHTML = Number(num1.value) + Number(num2.value);
   else res.innerHTML='숫자가 아닙니다.';

}

function validate() {
    // hint : 현재 구현되어 있는 chk() 함수를 사용해 보세요.
    var id = document.getElementById('userid');
    var pass = document.getElementById('pass');
    var pass1 = document.getElementById('pass1');
    var name = document.getElementById('name');
    var email = document.getElementById('email');
    var tel1 = document.getElementById('tel1');
    var tel2 = document.getElementById('tel2');
    var tel3 = document.getElementById('tel3');

    // 이메일 검사
    // 4글자 이상(\w = [a-zA-Z0-9_], [\w-\.]) @가 나오고
    // 1글자 이상(주소). 글자 가 1~3번 반복됨
    var reEmail=/\w{4,}@[a-z]+.[a-z]{1,3}/
    chk(reEmail,email,'이메일이 잘못되었습니다.');

    // 아이디 검사
    // 첫 글자는 반드시 영문 소문자, 4~12자로 이루어지고, 숫자가
    // 하나 이상 포함되어야 한다. 영문소문자와 숫자로만 이루어져야한다.
    // \d : [0-9]와 같다.       {n,m} : n에서 m까지 글자수
    var reId=/^[a-z]\d+{4,12}/;
    chk(reId,id,'아이디가 잘못되었습니다.');

    // 비밀번호 확인 검사
    if(pass.value.length>0&&pass.value==pass1.value) return true;
    else {
        alert('비밀번호가 잘못되었습니다.');
        pass.focus();
        return false;
    }
   
    // 이름 검사
    // 2글자 이상, 한글만
    // 통과하지 못하면 한글로 2글자 이상을 넣으세요~ alert 출력!
    var reNmae=/[가-힣]{2,}/;
    chk(reName,name,'한글로 2글자 이상을 넣으세요.');

    // 전화번호 검사

    // 전화번호 앞자리는 2~3자리 숫자, 두번째 자리는 3~4자리 숫자
    // 세번째 자리는 4자리 숫자
    var reTel1=/\d{2,3}/;
    var reTel2=/\d{3,4}/;
    var reTel3=/\d{4}/;
    chk(reTel1,tel1,'전화번호가 잘못되었습니다.');
    chk(reTel2,tel2,'전화번호가 잘못되었습니다.');
    chk(reTel3,tel3,'전화번호가 잘못되었습니다.');

    function chk(re, e, msg) {
        
        if (re.test(e.value)) {
            return true;
        }else{
            alert(msg);
            e.value = "";
            e.focus();
            return false;
        }
    }
}
function regTestFn() {
// 현재 이 메소드는 완성되어 있습니다.
// 필요한 정규표현식을 화면에서 적어 확인해 보세요.
var regTest = new RegExp(document.getElementById('regTest').value,'gim');
var fileArray = ["umzzal.gif", ".git", ".gitignore", "homework.doc",
                "index.html", "img0419.jpg", "img0419.jpg.tmp", "icon.png", "img0419.jpg1"];
var regResult = document.getElementById('regResult');
regResult.innerHTML = "";

for(var i in fileArray){
    var file = fileArray[i];
    if(regTest.test(file)) regResult.innerHTML += file+"<br>";
}
}

function comma(obj) {

var commaNum = obj.value;
var regResult = document.getElementById('regResult2');
// hint
// \B'ABC' : 'ABC'로 시작하지 않는 것을 찾는다.
// (?='ABC') : Positive lookahead (긍정형 전방 탐색)
//   'ABC'를 찾되 'ABC' 전까지만 찾아라 라는 뜻이다.
// (?!'ABC') : Nagative lookahead (부정형 전방 탐색)
//   'ABC'가 아닌 것을 찾되 앞의 특수한 형식을 맞춰서 찾아라 라는 뜻이다.

regResult.innerHTML
= commaNum.replace(/\B(?=(\d{3})+(?!\d))/g,function(val){ 
    return val+",";
});
}
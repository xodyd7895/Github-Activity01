//JS 추가적인 설정 중 
/*
let age_of_retirement=prompt("대한민국 법적 은퇴 연령은 몇살인가요?");

if(age_of_retirement==55){
  alert("맞아");
}
else{
  alert("아냐");

}
*/

let answer=57;
let age=prompt("은퇴 연령 예상 문제 기록","");

if(age==57){
  document.write("맞아여");
}
else if(age <= 56){
  document.write("좀더 위");
}

var id = prompt('아이디 입력');
if(id==="xodyd7895"){
  var password = prompt('비번입력');
  if(password==='123456');
  alert('로그인 성공');
  alert(id+"님"+"안녕하세요");
  else if(password!='123456'){
    alert('비밀번호 다시 확인요망');
  }

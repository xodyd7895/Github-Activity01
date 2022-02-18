//alert(3+6);
/*
바구니1 = 3;
바구니2 = 6;
result= 바구니1 + 바구니2

alert(result);

alert(result*3);
*/

//var, let, const 키워드들로 선언된 변수들의 특징 및 차이점

//[1] : let
//변수를 만들 대 변수명 앞에 적는 키워드중 하나.
//전통적인 프로그래밍 언어들은 일반적으로 블록 레벨 스코프를 가진다.==> 그런데, 자바스크립트는 함수레벨 스코프였다.
// let, const --> 블록 레벨 스코프
// var --> 함수 레벨 스코프

//[2] : 함수 레벨 스코프(var)
// 함수 내에서 선언된 변수는 함수 내에서만 유효하다. --> 즉, 함수 밖에서는 참조할 수 없다.
// 함수 내부에서 선언된 변수 --> 지역변수
// 함수 외부에서 선언된 변수 --> 전역변수

//[3] : 블록 레벨 스코프(let, const)
// function, if, for, while 문 등에서 선언된 변수
//코드 블록 내부에서 선언된 변수 --> 지역변수

//[4] : 변수 선언 및 값 셋팅(할당)
// let name;  name이라는 이름을 가진 변수를 생성한다. --> 선언 --> 선언만 했을 뿐 아직 값을 셋팅한 것은 아니다 --> error
// alert(name);  --> error --> undefined 정의되어 있지 않다.

/*
ex1)
let name;
name="홍길동";
alert(name);
*/

/*
ex2)
let name="홍길동";
alert(name);
*/

//[6] : 다양한 변수 선언 및 값 셋팅 방법들
/*
ex3)
let name= "강감찬";
let age = 30;
let email="xodyd7895@gmail.com";

alert(name);
alert(age);
alert(email);

alert(name+""+age+""+email);
*/

//블록단위(중괄호로 구분되는 코드의 범위) 스코프인 let 변수와 var 변수 차이점
// 이번 강의에서는 블록 스코프인 let과 함수 스코프인 var로 변수를 생성했을 때의 차이점을 학습

//[1] : remember pls --> let 키워드를 사용하여 변수를 만들면 의도치않게 전역변수가 되어지는 것을 막을 수 있다.
/*
if(true){
  var name="홍길동";
}
alert(name);
console.log(name);*/
// var = {} 범위 밖에서도 호출이 가능함 --> 그래서 함수 내에서는 var 대신 let으로 쓰는게 함수 외에서 호출되는 부분을 차단할 수 있음
/*
if(true){
  let name="홍길동";
}

alert(name);
*/
/*
if(true){
  const name="홍길동";
}

alert(name);
*/

//상수와 변수 값의 변화에 대해 실습
// 이번 강좌에서는 const(상수) 키워드를 사용한 상수와 변수 값 변화에 대해 학습

//[1] : const --> 불변
//할당한 값이 변경되지 않도록 변수를 만들고자 한다면 const를 사용하여 만든다.
//상수는 재할당할 수 없다. --?> so, 변경시에는 error
/*
let name="홍길동";
    name="이순신";

    alert(name);
*/

const name="홍길동";
      name="인순이";
      //--> error --> const 상수값이잖아 복수 할당 x
      alert(name);

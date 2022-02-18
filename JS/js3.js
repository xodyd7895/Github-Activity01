//[1] 자료형 (data type)
//변수의 종류 또는 변수의 저장되는 값의 형태(종류)

//[2] : 자바스크립트 자료형 종류
// 원시타입 vs 참조타입
// 기본형 vs 참조형

//[3] : 기본형 타입(primitive Type) --> 값을 그대로 셋팅(할당)
/*
1)  숫자형(number)
2)  문자(열)형(string)
3)  boolean
4)  null
5)  undefined
6) symbol
*/


//[4] : 참조형 타입(Reference Type) --> 값이 저장된 주소값을 셋팅(할당 or참조)
/*
1) 객체(object)
2) 배열(array)
3) 함수(function)
4) 맵(map)
5) 셋 (set)
*/


//다양한 자료형 실습

//[1] : typeof 연산자
// 피연산자(typeof 연산자 뒤에 오는거 --> 변수의 값 또는 그냥 값이나 변수) 가 어떤 자료형(data type) 인지 반환
// 보통은 셋팅(할당) 된 값을 통해서 어느정도 해당 변수의 데이터타입을 유추할 수 있다.
/*
let name="홍길동";

alert(typeof name);//해당 값의 타입을 출력한다.

let isThisReal= false;
alert(typeof isThisReal);
*/

//undefined 는 변수값을 선언만 해놔도 자동적으로 할당되는 값임 예) let name; 이런식으로 하고 typeof 로 출력하면 undefined로 나옴

//[2] : typeof()
/*
let eng_score=90;
console.log("당신의 영어점수는="+eng_score+"점이네 그리고 타입은"+typeof(eng_score));
*/

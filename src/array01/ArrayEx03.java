package array01;

import java.util.Arrays;//Arrays 클래스 사용 시, 필요
                        //단축키 : Arrays. + ctrl +shift + o

public class ArrayEx03 {

	public static void main(String[] args) {

		//40바이트가 힙에 생성되었다.
		//arr1 = 주소값을 지니고 있는 참조변수이다.
		int[]arr1 = new int[10];
		
		//6바이트가 힙에 생성되었다.
		char[] chArr = new char[] {'a','b','c'};
		
		//arr1배열에 난수를 10개 대입하고 있따...
		for(int i =0; i<arr1.length; i++) {
			// 범위 : 1~10까지의 난수를 대입
			arr1[i] = (int)(Math.random()*10)+1;
		}
		//배열의 값들을 출력(배열의 값들을 보기좋게 출력
		for(int i =0; i<arr1.length; i++) {
//			if(i ==9) {
//				System.out.print(arr1[i]);
//			}
//			else {
//				System.out.print(arr1[i]+",");
//			}
		}
		//Arrays 클래스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(chArr));
		
		//주소값 출력
		//출력 스트림에다가 참조변수를 넣으면, 자동으로 참조변수명.toString()메서드가 
		//호출이 된다.
		System.out.println(arr1);
		System.out.println(arr1.toString()); //타입@16진수
		//char형은 주소값 출력 형태가 다르다.
		//char 타입은 주소 출력 시, toString() 을 호출해야된다. 
		System.out.println(chArr);
		System.out.println(chArr.toString()); //타입@16진수 
	}

}

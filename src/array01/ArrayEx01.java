package array01;

public class ArrayEx01 {

	public static void main(String[] args) {

		//int []score; ->4바이트를 가진 주소만 생긴다.
		
		//score는 참조변수이다 뭐를? -> int[]이다.
		int[]score = null;
		//방도 만들지 않았는데, 값을 대입하고 있다(문법 에러)
		//score = {100,20);
		
		//socre는 5개의 방을 힙에다가 생성하고 있다.(총 20바이트가 생성됨)
		score = new int[5];
		
		//score의 주소값 출력(배열명이 곧 주소임)
		System.out.println("score의 주소값 :"+score);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"]=" +score[i]);
		}
		
		System.out.println();
		//score[0]는 변수와 동일하다고 보면 된다.
		//score는 주소다. []안에 들어가는 숫자를 인덱스 혹은 첨자라고한다.
		
		
		//score[0]에 100을 생성하였어도 
		//배열에다가 반복문을 사용하여 값을 대입시키고 있는 형태
		score[0] = 100;
		
		for(int i=0; i<score.length; i++) {
			score[i] = i + 10;
			System.out.println("score["+i+"] = " +score[i]);
		}
		System.out.println();
		
		//배열의 각각의 방에 있는 값을 출력하는 형태 
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"] = " +score[i]);
		}
		
//		score[0] = 20;
//		System.out.println(score);
//		for(int i=0; i<score.length; i++) {
//			System.out.println("score["+i+"]=" +score[i]);
//		}
	}

}

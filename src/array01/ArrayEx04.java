package array01;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		//ball= 참조변수(주소값을 가지고 있따)
		//총 20바이트
		int[] ball = new int[5];
		for(int i=0; i<ball.length; i++) {
			ball[i] = (int)(Math.random()*20)+1;
		}
		
		System.out.println("정렬 전");
		for(int i=0; i<ball.length; i++) {
			System.out.println(ball[i]);
		}
		System.out.println();
		//버블소팅을 위해서는 반드시 1차원 배열이라도 반복문이
		//더블루프가 필요하고 조건문이 하나 들어와야된다.
//		for(int i =0; i<ball.length;i++) {
//			for(int j=0; j<ball.length-1;j++) {
//				//버블정렬(내림차순)
//				if(ball[j] < ball[j+1]) {
//					int a = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = a;
//				}
				//버블정렬(오름차순) 
				//차이점 : 아래 <,> 이 차이 
//				if(ball[j] > ball[j+1]) {
//					int a = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = a;
//			}
//		}
//	
		Arrays.sort(ball);// 위 버블소팅을 기반으로 만들어진 메서드임
		System.out.println("정렬 후");
		for(int i=0; i<ball.length;i++) {
			System.out.println(ball[i]);
		}
	}

}

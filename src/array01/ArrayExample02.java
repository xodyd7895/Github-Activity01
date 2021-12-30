package array01;

public class ArrayExample02 {

	public static void main(String[] args) {
			//예제는 배열, 반복문, 조건문을 이용하여 정렬(소팅)하는 예제이다.
		
		int []ball = new int[5];
		for(int i=0; i<ball.length; i++) {
			ball[i] = (int)(Math.random()*45)+1;
		}
		System.out.println("정렬 전");
		for(int i=0; i<ball.length;i++) {
			for(int j=0; j<ball.length-1;j++) {
				
				//버블 소팅(정렬)
				if(ball[j]<ball[j+1]) {
					int temp = ball[j];
					ball[j] = ball[j+1];
					ball[j+1] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int i=0; i<ball.length;i++) {
			System.out.println(ball[i]);
			
		}
	}

}

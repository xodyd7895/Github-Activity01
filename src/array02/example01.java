package array02;

public class example01 {

	public static void main(String[] args) {
		//[]대괄호의 갯수가 곧 차원을 의미한다.
		//실무에서는 다르게 사용되니 개념만 알아두자
		
		int[][] score = new int[][] {
										{100,100,100},
										{50,50,50},
										{10,20,30},
										{60,20,40}
													};

	//2차원 배열의 값을 읽고 쓰기위해서는 더블루프가 반드시 필요하다.
													
	for(int i = 0; i<score.length;i++) {//score = 주소값
		for(int j = 0; j<score[i].length; j++) {//score[i] = 주소값
			System.out.println(score[i][j]); // score[i][j] = 변수값
		}
	}
	System.out.println("2차원 배열의 크기 : " + score.length);
	System.out.println("2차원 배열의 주소 : " + score); //[[I@22a71081
	//System.out.println(score[j].length);		//	[[는 2차원의 뜻 
	//2차원 배열에서는 2차원 배열명도 주소, 1차원 배열명도 주소가 된다. (중요)
	for(int i = 0; i<score.length;i++) {//score = 주소값
				System.out.println("1차원 배열의 주소 : " + score[i]); // score[i][j] = 변수값
			System.out.println("1차원 배열의 크기 : " + score[i].length);
	}
	//2차원 배열에서는 배열명[][]이 곧 변수와 동일하다.
	score[0][0] = 999;
	System.out.println(score[0][0]);
	
	
	//향상된 for문(JDK 1.5 이상 버전부터)
	//collection framework 객체에 접근할 때, 자주 사용되는 방법
	//for( 가져올 타입 : 가져올 장소(주소)) 
	int sum = 0;
	for(int[]temp : score) {//한번에 1차원밖에 안됨 그래서 더블루프를 돌려야되는거임
		for(int i : temp) {
			sum+= i;
			
		}
	}
	
	System.out.println("합계 : " + sum);
}
}

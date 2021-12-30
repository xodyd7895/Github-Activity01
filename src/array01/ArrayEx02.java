package array01;

public class ArrayEx02 {

	public static void main(String[] args) {

		int sum = 0; //총점
		double avg = 0.0; //평균
		
		//int[] score= {100,200,300}; -> 아래랑 동일하게 쓰임(웬만하면 밑에것처럼 써라)
		int[] score= new int[]{100,90,70,50,80};
		
		System.out.println("배열의 크기 : "+ score.length);
				
		for(int i=0; i<score.length;i++) {
			//배열 각각의 요소들을 전부 더하고 있다.
			sum += score[i];
			//평균을 구하고 있따.
			avg = sum/score.length;
		}
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}

}

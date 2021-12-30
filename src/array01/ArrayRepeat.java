package array01;

import java.util.Arrays;

public class ArrayRepeat {

	public static void main(String[] args) {

		
		int []arr1 = new int[10];
		for(int i =0; i<arr1.length;i++) {
			arr1[i] = (int)(Math.random()*10)+1;
			System.out.println("정렬 전 : " + arr1[i]);
		}
		
		
		
		for(int i = 0; i<arr1.length;i++) {
			for (int j=0; j<arr1.length-1;j++){
				//왜 length - 1일까?
				//총 10칸의 숫자가 정해져있다면 0~9까지 잖아
				//근데 같은 칸에 있는 숫자들을 비교할 수 없으니 -1을 해서
				// 비교할 대상을 만든다. 
				//예) 10칸에서 (10-1) 9칸을 비교해라 뭐 이런거? 

				if(arr1[j] < arr1[j+1]) {
					int a = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = a;
					
				}
				
			}
			
		}
		System.out.println("정렬 후(오름차순)");
		for(int i =0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

		
				System.out.println();
		//위에 있는 애들을 보완하기 위해 만든 메서드는 아래와 같다
		Arrays.sort(arr1); 
		System.out.println("메서드로 정렬 후");
		System.out.println(Arrays.toString(arr1));
		
}

}

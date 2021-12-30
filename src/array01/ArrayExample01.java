package array01;

public class ArrayExample01 {

	public static void main(String[] args) {

		
//		int[]score;
//		String[]name; -> 배열 선언만 했다고, 저장할 수 있는 공간이 생성되는 것이 아니다.
		
//		int[]arr=null; ->통상적으로 null로 초기화를 많이한다.
//		arr= new int[5]; -> arr[0], arr[1],arr[2], arr[3], arr[4]
		
		//1차원 배열 : 싱글루프
		//2차원 배열 : 더블루프
		//3차원 배열 : 트리플루프(3차원은 많이 쓰이지 않음)
		
		//4*3=12바이트 생성, 0으로 초기화
		int[]arr1 = new int[3];
		//4*3=12바이트 생성 후 바로 100,20,30 으로 초기화함.
		int[]arr2 = new int[] {100,20,30};
		//arr1,arr2 = 배열의 주소 즉, 메모리의 주소 값을 지니고 있다.
		// -> 즉, 배열명은 곧 주소인 것임(중요)
		
		//참조변수만 선언해놓고, 방도 만들지 않았는데 값을 대입하고 있 어서 초기화 문법 에러 발생
//		int[]arr3 = null;
//		arr3 = {100,50,30}
		
	}

}

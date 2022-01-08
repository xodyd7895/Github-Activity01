package second_Lesson_Array_220108;

public class example02 {

	public static void main(String[] args) {

		int[]arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum="+sum);
	}

}

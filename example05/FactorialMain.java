package example05;

public class FactorialMain {

	public static void main(String[]args) {

		
		long result = FactorialMain.factorial(5L);
		System.out.println("5!(팩토리얼)의 값 : " + result);
	}
	
	public static long factorial(long n ) {
		
		long result = 0L;
		
		//빠져나갈 구멍을 만들어 놓는다.
		if(n == 1) {
			result = 1; //n = 1일때, 재귀호출이 더이상 이루어지지않는다. f(1) = 1이니까.
		}
		else {
			System.out.println("result 값 :" + result +" n값 :" + n);
			result = n * factorial(n-1); //재귀호출이 직접적으로 이루어지는 곳 
		}
	
		
		return result;
	}
}


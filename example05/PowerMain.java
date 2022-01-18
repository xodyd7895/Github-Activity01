package example05;

import java.util.Scanner;

public class PowerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int n = 0;
		long result = 0L;
		
		System.out.println("제곱까지의 합을 계산함");
		System.out.println("ex)2의3승 : 2의1승 + 2의 2승 + 2의3승 : 14" );
		
		System.out.print("제곱하고 싶은 숫자");
		x = sc.nextInt();
		
		System.out.print("몇승을 더할까요?");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			result += power(x,i); //3,2라면 
		}
		System.out.printf("%d의 %d승까지의 합은 %d입니다.", x, n, result);
		sc.close();
	}

	public static long power(int x, int n) {
		
		if(n == 1) {
			return x;
		}
		else {
			return x*power(x,n-1);
		}
	}
}

package ex1;

import java.util.Scanner;

//Scanner로 정수를 10개 입력받아서 배열에저장하고
//이 정수중에 3의 배수인 수만 골라 출력하는 프로그램을 작성하시오

public class Ex3 {
	public static void main(String[]args) {
		
	
	
	Scanner sc = new Scanner(System.in);

	int[] a = new int[10];
	System.out.print("10개 입력");
	
	for(int i = 0; i <a.length; i++) {
		a[i] = sc.nextInt();
	} 
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]%3==0) {
			System.out.println("3의 배수 :" + a[i]);
		}
		
		}
	sc.close();
	}
}

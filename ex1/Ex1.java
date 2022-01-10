package ex1;

import java.util.Scanner;

/*대소문자 변환 프로그램을 작성하시오
예 ) abc ——> ABC   ABC -----> abc
*/

public class Ex1 {
	public static void main(String[]args) {
		String b = "";
		String c = "";
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력a");
		b = sc.next();
		b = b.toUpperCase();// 대-> 소 메소드
		System.out.println(b);
		
		System.out.println();
		
		
		System.out.println("입력c");
		c = sc.next();
		c = c.toLowerCase(); // 소 -> 대 메소드
		System.out.println(c);
		
		sc.close();
	}
	

}

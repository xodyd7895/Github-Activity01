package ex1;

import java.util.Scanner;

/* Scanner로 입력받은 금액을 5만원,만원,천원,오백원,백원 
 * 단위로 잔돈을 환산해 주는 프로그램
 * 작성 
 */

public class Ex2 {
	public static void main(String[]args) {
		
	
	
	
	int[] a = {50000,10000,1000,500,100};
	Scanner sc = new Scanner(System.in);
	System.out.println("금액 입력");
	int b = sc.nextInt();
	for(int i = 0; i<a.length;i++) {
		System.out.println(a[i] + "원"+ "\t" + b/a[i]+ "개");
		b %= a[i];
	}
	sc.close();

}
}
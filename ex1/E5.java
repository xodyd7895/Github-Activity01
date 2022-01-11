package exam1;

/*
	GuGuDan클래스에   void guguDan(int i, int k) 메서드를 작성하여
	i * 1  ~~~  i * k까지 출력하는 프로그램을 작성하시오.


*/


class GuGuDan{
	
	public static void guguDan(int i, int k) {
		
		for(int a = 1; a<=k; a++) { 
				System.out.println(i+"x"+a+"="+(i*a));
		}
	}
}
public class E5 {
	public static void main(String args[]) {
		GuGuDan.guguDan(2,4);
	}
}
package example04;

//class A{
//	
//	int data;
//}
public class ReferenceParamMain {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출 전, main()내의 값 : " + a.data);
		//누구한테 "시계가 어딨니?" 라고 묻는 형태 --> 값을 읽고 수정도 할 수 있다.
		//Call by Reference(주소에 의한 호출)
		
		ReferenceParamMain.dataChange(a);
		System.out.println("dataChange() 호출 후");
		System.out.println("메서드 호출 후 main()내의 값 :" + a.data);
	}
	
	

	
	public static void dataChange(A a) {
		//a라는 주소값은 매개변수로 넘어왔기 때문에 주소를 공유한다.
		//a라는 주소를 공유하게 되면 호출한 곳에서 영향을 무조건 받는다.
		a.data = 44;
		System.out.println("dataChange()내의 값 : " + a.data);
		return; // return 지워도 상관은 없음
	}
}

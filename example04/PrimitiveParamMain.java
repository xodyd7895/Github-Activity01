package example04;

class A{
	
	int data;
}
public class PrimitiveParamMain {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출 전, main()내의 값 : " + a.data);
		//누구한테 "몇시냐?" 라고 묻는 형태 --> 값만 읽을 수가 있다.
		//Call by Value(값의 의한 복사)
		
		PrimitiveParamMain.dataChange(a.data);
		System.out.println("dataChange() 호출 후");
		System.out.println("메서드 호출 후 main()내의 값 :" + a.data);
	}
	
	

	
	public static void dataChange(int data) {
		//지역변수 data라는 값은 main에서 호출할때 값 복사가 이루어졌기 때문에
		//호출한 곳에서 아무런 영향을 받지 않는다.
		data = 44;
		System.out.println("dataChange()내의 값 : " + data);
		return; // return 지워도 상관은 없음
	}
}

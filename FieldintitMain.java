package example01;

public class FieldintitMain {

	public static void main(String[] args) {

		//설계도에 있는 객체(붕어빵) 을 찍고 있는 과정임.
		Fieldintit fi = new Fieldintit();
		//        fi = 리모컨과 같은 개념임
		//fi. -> dot을 했을때 나오는 변수들이 모두 멤버변수들임
		
		
		//new연산자 때문에 모두 초기화가 되어서 출력되는 것임.
		
		//new연산자가 클래스에 있는 멤버들의 바이트 크기만큼 힙에다가 메모리 할당을 하며
		//동시에 초기화를 시켜주는 역할을 한다.
		System.out.println(fi.byteField); //0
		System.out.println(fi.strField);//null
		System.out.println(fi.boolField); //false
		System.out.println(fi.arrField); //null
		System.out.println(fi.floatField); //0.0
		
		System.out.println(fi); //출력에 멤버변수 없이 참조변수 (fi)만 있는것은 주소값을 출력함
		System.out.println(fi.toString());
	}

}

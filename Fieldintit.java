package example01;
//object 클래스는 모든 클래스의 조상격
public class Fieldintit {

	//필드(data)멤버변수 = 설계도(붕어빵틀 등) 을 만드는 작업 
	
	//기본형 변수
	byte byteField; //1byte
	short shortField; //2byte
	int intField; //4byte 
	long longField; //8byte
	
	boolean boolField; //1byte
	
	char charField; //2byte 
	
	float floatField; //4byte
	double doubleField; //8byte
	
	//참조형 변수
	int[]arrField; //4byte
	String strField; //4byte
	
	
	//@Override = annotation
	//annotation : 컴파일러에게 강한 컴파일을 요구하는 것임
	//toString(): 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할때나,
	//  		  원하는 포맷으로 멤버변수들을 출력하고자 할때 사용을 많이 함.
	@Override
	public String toString() {
		//return super.toString();
		//this : 객체자기 자신의 주소를 의미
		//super : 조상 혹은 부모 객체의 주소를 의미  
		String str = " bytefield : " + byteField;
		return str; 
	}
	
	
}

package example02;

public class PersonEx {

	public static void main(String[]args) {
		//Person제네릭 클래스에 T를 String만 들어올 수 있게끔 만들었다. 
		Person<String> person = new Person<>();
		person.setT("홍길동"); 
		String str = (String)person.getT(); 
		System.out.println(str);
		
		
		//현업에서는 데이터의 통일화, 타입변환제거, 컴파일시 예외 발생
		Person<Integer> person2 = new Person<>();
		//person2.setT(new Integer(100)); 원래는 이렇게해야 정상인데
		person2.setT(100); //자동 박싱
		int str2 = person2.getT(); //자동언박싱코드 
		System.out.println(str2);
		
		Person<Apple> person3 = new Person<>();
		person3.setT(new Apple());  //자동박싱
		Apple str3 = person3.getT();  //자동 언박싱코드
		System.out.println(str3);
		
	}
}

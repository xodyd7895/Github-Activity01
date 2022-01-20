package example01;


//인터페이스의 본질은 추상메서드 , static final은 부수적 개념
public interface A {
	
	int MAX = 10; //static final 생략가능
				  // 컴파일시에 컴파일러가 붙여준다.

	void method(); // public abstract 생략가능
					//컴파일시에 컴파일러가 붙여준다.
	
}

package exampleForCh12 ;

public class A {

	//�ʵ�
	
	A a1 = new A(true); //(o)
	A a2 = new A(1); //(o)
	A a3 = new A("���ڿ�"); //(o)
	
	//������
	public A(boolean b) {} // <-- public ��������
	A(int b){}			   // <-- default ��������
	private A (String s) {}// <-- private ��������
	
}

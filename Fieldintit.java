package example01;
//object Ŭ������ ��� Ŭ������ �����
public class Fieldintit {

	//�ʵ�(data)������� = ���赵(�ؾƲ ��) �� ����� �۾� 
	
	//�⺻�� ����
	byte byteField; //1byte
	short shortField; //2byte
	int intField; //4byte 
	long longField; //8byte
	
	boolean boolField; //1byte
	
	char charField; //2byte 
	
	float floatField; //4byte
	double doubleField; //8byte
	
	//������ ����
	int[]arrField; //4byte
	String strField; //4byte
	
	
	//@Override = annotation
	//annotation : �����Ϸ����� ���� �������� �䱸�ϴ� ����
	//toString(): Ŭ������ �������(�ʵ�)�� ������ ���÷� Ȯ���ϰ��� �Ҷ���,
	//  		  ���ϴ� �������� ����������� ����ϰ��� �Ҷ� ����� ���� ��.
	@Override
	public String toString() {
		//return super.toString();
		//this : ��ü�ڱ� �ڽ��� �ּҸ� �ǹ�
		//super : ���� Ȥ�� �θ� ��ü�� �ּҸ� �ǹ�  
		String str = " bytefield : " + byteField;
		return str; 
	}
	
	
}

package example01;

public class FieldintitMain {

	public static void main(String[] args) {

		//���赵�� �ִ� ��ü(�ؾ) �� ��� �ִ� ������.
		Fieldintit fi = new Fieldintit();
		//        fi = �������� ���� ������
		//fi. -> dot�� ������ ������ �������� ��� �����������
		
		
		//new������ ������ ��� �ʱ�ȭ�� �Ǿ ��µǴ� ����.
		
		//new�����ڰ� Ŭ������ �ִ� ������� ����Ʈ ũ�⸸ŭ �����ٰ� �޸� �Ҵ��� �ϸ�
		//���ÿ� �ʱ�ȭ�� �����ִ� ������ �Ѵ�.
		System.out.println(fi.byteField); //0
		System.out.println(fi.strField);//null
		System.out.println(fi.boolField); //false
		System.out.println(fi.arrField); //null
		System.out.println(fi.floatField); //0.0
		
		System.out.println(fi); //��¿� ������� ���� �������� (fi)�� �ִ°��� �ּҰ��� �����
		System.out.println(fi.toString());
	}

}

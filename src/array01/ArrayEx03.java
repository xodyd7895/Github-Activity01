package array01;

import java.util.Arrays;//Arrays Ŭ���� ��� ��, �ʿ�
                        //����Ű : Arrays. + ctrl +shift + o

public class ArrayEx03 {

	public static void main(String[] args) {

		//40����Ʈ�� ���� �����Ǿ���.
		//arr1 = �ּҰ��� ���ϰ� �ִ� ���������̴�.
		int[]arr1 = new int[10];
		
		//6����Ʈ�� ���� �����Ǿ���.
		char[] chArr = new char[] {'a','b','c'};
		
		//arr1�迭�� ������ 10�� �����ϰ� �ֵ�...
		for(int i =0; i<arr1.length; i++) {
			// ���� : 1~10������ ������ ����
			arr1[i] = (int)(Math.random()*10)+1;
		}
		//�迭�� ������ ���(�迭�� ������ �������� ���
		for(int i =0; i<arr1.length; i++) {
//			if(i ==9) {
//				System.out.print(arr1[i]);
//			}
//			else {
//				System.out.print(arr1[i]+",");
//			}
		}
		//Arrays Ŭ������ �迭�� �����ϱ� ���� ����� ���� ��ƿ��Ƽ Ŭ����
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(chArr));
		
		//�ּҰ� ���
		//��� ��Ʈ�����ٰ� ���������� ������, �ڵ����� ����������.toString()�޼��尡 
		//ȣ���� �ȴ�.
		System.out.println(arr1);
		System.out.println(arr1.toString()); //Ÿ��@16����
		//char���� �ּҰ� ��� ���°� �ٸ���.
		//char Ÿ���� �ּ� ��� ��, toString() �� ȣ���ؾߵȴ�. 
		System.out.println(chArr);
		System.out.println(chArr.toString()); //Ÿ��@16���� 
	}

}

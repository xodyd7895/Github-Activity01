package array01;

import java.util.Arrays;

public class ArrayRepeat {

	public static void main(String[] args) {

		
		int []arr1 = new int[10];
		for(int i =0; i<arr1.length;i++) {
			arr1[i] = (int)(Math.random()*10)+1;
			System.out.println("���� �� : " + arr1[i]);
		}
		
		
		
		for(int i = 0; i<arr1.length;i++) {
			for (int j=0; j<arr1.length-1;j++){
				//�� length - 1�ϱ�?
				//�� 10ĭ�� ���ڰ� �������ִٸ� 0~9���� �ݾ�
				//�ٵ� ���� ĭ�� �ִ� ���ڵ��� ���� �� ������ -1�� �ؼ�
				// ���� ����� �����. 
				//��) 10ĭ���� (10-1) 9ĭ�� ���ض� �� �̷���? 

				if(arr1[j] < arr1[j+1]) {
					int a = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = a;
					
				}
				
			}
			
		}
		System.out.println("���� ��(��������)");
		for(int i =0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

		
				System.out.println();
		//���� �ִ� �ֵ��� �����ϱ� ���� ���� �޼���� �Ʒ��� ����
		Arrays.sort(arr1); 
		System.out.println("�޼���� ���� ��");
		System.out.println(Arrays.toString(arr1));
		
}

}

package array01;

public class ArrayEx02 {

	public static void main(String[] args) {

		int sum = 0; //����
		double avg = 0.0; //���
		
		//int[] score= {100,200,300}; -> �Ʒ��� �����ϰ� ����(�����ϸ� �ؿ���ó�� ���)
		int[] score= new int[]{100,90,70,50,80};
		
		System.out.println("�迭�� ũ�� : "+ score.length);
				
		for(int i=0; i<score.length;i++) {
			//�迭 ������ ��ҵ��� ���� ���ϰ� �ִ�.
			sum += score[i];
			//����� ���ϰ� �ֵ�.
			avg = sum/score.length;
		}
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
	}

}

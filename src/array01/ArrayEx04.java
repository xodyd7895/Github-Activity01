package array01;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		//ball= ��������(�ּҰ��� ������ �ֵ�)
		//�� 20����Ʈ
		int[] ball = new int[5];
		for(int i=0; i<ball.length; i++) {
			ball[i] = (int)(Math.random()*20)+1;
		}
		
		System.out.println("���� ��");
		for(int i=0; i<ball.length; i++) {
			System.out.println(ball[i]);
		}
		System.out.println();
		//��������� ���ؼ��� �ݵ�� 1���� �迭�̶� �ݺ�����
		//��������� �ʿ��ϰ� ���ǹ��� �ϳ� ���;ߵȴ�.
//		for(int i =0; i<ball.length;i++) {
//			for(int j=0; j<ball.length-1;j++) {
//				//��������(��������)
//				if(ball[j] < ball[j+1]) {
//					int a = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = a;
//				}
				//��������(��������) 
				//������ : �Ʒ� <,> �� ���� 
//				if(ball[j] > ball[j+1]) {
//					int a = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = a;
//			}
//		}
//	
		Arrays.sort(ball);// �� ��������� ������� ������� �޼�����
		System.out.println("���� ��");
		for(int i=0; i<ball.length;i++) {
			System.out.println(ball[i]);
		}
	}

}

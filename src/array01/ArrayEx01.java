package array01;

public class ArrayEx01 {

	public static void main(String[] args) {

		//int []score; ->4����Ʈ�� ���� �ּҸ� �����.
		
		//score�� ���������̴� ����? -> int[]�̴�.
		int[]score = null;
		//�浵 ������ �ʾҴµ�, ���� �����ϰ� �ִ�(���� ����)
		//score = {100,20);
		
		//socre�� 5���� ���� �����ٰ� �����ϰ� �ִ�.(�� 20����Ʈ�� ������)
		score = new int[5];
		
		//score�� �ּҰ� ���(�迭���� �� �ּ���)
		System.out.println("score�� �ּҰ� :"+score);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"]=" +score[i]);
		}
		
		System.out.println();
		//score[0]�� ������ �����ϴٰ� ���� �ȴ�.
		//score�� �ּҴ�. []�ȿ� ���� ���ڸ� �ε��� Ȥ�� ÷�ڶ���Ѵ�.
		
		
		//score[0]�� 100�� �����Ͽ�� 
		//�迭���ٰ� �ݺ����� ����Ͽ� ���� ���Խ�Ű�� �ִ� ����
		score[0] = 100;
		
		for(int i=0; i<score.length; i++) {
			score[i] = i + 10;
			System.out.println("score["+i+"] = " +score[i]);
		}
		System.out.println();
		
		//�迭�� ������ �濡 �ִ� ���� ����ϴ� ���� 
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"] = " +score[i]);
		}
		
//		score[0] = 20;
//		System.out.println(score);
//		for(int i=0; i<score.length; i++) {
//			System.out.println("score["+i+"]=" +score[i]);
//		}
	}

}

package array02;

public class example01 {

	public static void main(String[] args) {
		//[]���ȣ�� ������ �� ������ �ǹ��Ѵ�.
		
		int[][] score = new int[][] {
										{100,100,100},
										{50,50,50},
										{10,20,30},
										{60,20,40}
													};

	//2���� �迭�� ���� �а� �������ؼ��� ��������� �ݵ�� �ʿ��ϴ�.
													
	for(int i = 0; i<score.length;i++) {//score = �ּҰ�
		for(int j = 0; j<score[i].length; j++) {//score[i] = �ּҰ�
			System.out.println(score[i][j]); // score[i][j] = ������
		}
	}
	System.out.println("2���� �迭�� ũ�� : " + score.length);
	System.out.println("2���� �迭�� �ּ� : " + score); //[[I@22a71081
	//System.out.println(score[j].length);		//	[[�� 2������ �� 
	//2���� �迭������ 2���� �迭�� �ּ�, 1���� �迭�� �ּҰ� �ȴ�. (�߿�)
	for(int i = 0; i<score.length;i++) {//score = �ּҰ�
				System.out.println("1���� �迭�� �ּ� : " + score[i]); // score[i][j] = ������
			System.out.println("1���� �迭�� ũ�� : " + score[i].length);
	}
	//2���� �迭������ �迭��[][]�� �� ������ �����ϴ�.
	score[0][0] = 999;
	System.out.println(score[0][0]);
	
	
	//���� for��(JDK 1.5 �̻� ��������)
	//collection framework ��ü�� ������ ��, ���� ���Ǵ� ���
	//for( ������ Ÿ�� : ������ ���(�ּ�)) 
	int sum = 0;
	for(int[]temp : score) {//�ѹ��� 1�����ۿ� �ȵ� �׷��� ��������� �����ߵǴ°���
		for(int i : temp) {
			sum+= i;
			
		}
	}
	
	System.out.println("�հ� : " + sum);
}
}

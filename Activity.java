package array02;

public class Activity {

	public static void main(String[] args) {

		int[][] score = new int [][] { 
									{100,80,90},
									{100,100,100},
									{90,90,90}
												};
					
		//���� ����
		int korean = 0;
		int math = 0;
		int eng = 0;
		
		int totalsum = 0;
		double totalavg = 0;
		
		int sum = 0; //���κ� ����
		double avg = 0; //���κ� ���
		
		System.out.println("�л���ȣ\t����\t����\t����\t����\t���");
		System.out.println("===============================================");
		
		for(int i=0; i<score.length; i++) {
			sum = 0; //������
			avg = 0;//������
			System.out.print(i+1); 
			for(int j=0; j<score[i].length;j++) {
				
				korean += score[i][0];
				math += score[i][1];
				eng += score[i][2];
				
				sum+=score[i][j];
				avg = (double)sum/score[i].length;
				System.out.print("\t"+score[i][j]);
			}
System.out.print("\t"+sum+"\t"+avg);
System.out.println();
			
			
		}
		
		
		}
		
	}



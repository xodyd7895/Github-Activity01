package second_Lesson_Array_220108;

public class example03 {

	public static void main(String[] args) {

//		int wow[][] = new int[][] { 
//			{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
//			
//System.out.println(wow[0][0]+","+wow[0][1]+","+wow[0][2]+","+wow[0][3]+","+ wow[0][4]);
//System.out.println(wow[1][0]+","+wow[1][1]+","+wow[1][2]+","+wow[1][3]+","+ wow[1][4]);
//System.out.println(wow[2][0]+","+wow[2][1]+","+wow[2][2]+","+wow[2][3]+","+ wow[2][4]);
//System.out.println(wow[3][0]+","+wow[3][1]+","+wow[3][2]+","+wow[3][3]+","+ wow[3][4]);

		
		String wow[][] = new String[][] {
					{"@","@","@"},
					{"@","@"},
					{"@","@","@","@","@"},
					{"@","@","@","@","@","@"},
					{"@"}};
					
					
					
					for(int i = 0; i<wow.length;i++) {
						System.out.println();
						for(int j = 0; j<wow[i].length;j++) {
						System.out.print(wow[i][j]);
						}
					}
					
	}
	
}

				/*	 int num[]=new int[]{3,2,5,6,1};
					 
				      for(int i=0;i<num.length;i++)  { 
				         for(int j=1;j<=num[i];j++) { 
				        	 [0][1] = 
				        	System.out.print('@'); 
				            } 
				         
				         System.out.println();
		}
		
		
	}

}*/

package example04;

public class TimeMain {

	public static void main(String[] args) {

		
		Time t1 = new Time();
		System.out.println(t1);
		
		//시 설정
		t1.setHour(23);
		//분 설정
		t1.setMinute(60);
		//초 설정
		t1.setSecond(60);
		System.out.println(t1);
	}
		
}

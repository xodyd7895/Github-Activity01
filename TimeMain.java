package example04;

public class TimeMain {

	public static void main(String[] args) {

		
		Time t1 = new Time();
		System.out.println(t1);
		
		//�� ����
		t1.setHour(23);
		//�� ����
		t1.setMinute(60);
		//�� ����
		t1.setSecond(60);
		System.out.println(t1);
	}
		
}

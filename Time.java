package example04;

public class Time {
	
	//���������� (Access Modifier)�� ����
	// private : ���� Ŭ������������ ���� ������.
	// protected : ���� ��Ű�� �׸��� �ڼ�Ŭ���������� ������ ������.
	// default : ���� ��Ű�������� ������ ������.
	// ex) int hour; �̷������� �����ϰԵǸ� �ڵ����� default�� �ٴ´ٰ� �����ϸ��
	// public : ������ �� ������ ������. 
	
	private int hour;
	private int minute;
	private int second;

	//getter()
	//public int getHour() {
		//return this.hour;
	
	
	//source �� -> Generate getter and setter Ŭ�� �� 
	//���ϴ� ������� üũ�� �Ŀ� getter, setter�޼��带 �ڵ��ϼ��ϸ� �ȴ�. 
	
	
	//getter() : ��������� ���� �о�� �޼���
	//setter() : ��������� ���� �����ϴ� �޼��� 
	public int getHour() {
		return this.hour;
	}
	public void setHour(int hour) {
		//�ÿ� ���� ����ó�� �ڵ带 �ۼ�
		if(hour<0 || hour >=24 ) {
			System.out.println("�ð��� �߸� �Է���");
			return;
		}
		this.hour = hour;
		
	}
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int minute) {
		//�п� ���� ����ó�� �ڵ带 �ۼ�
				if(minute<0 || minute >=60 ) {
					System.out.println("���� �߸� �Է���");
					return;
				}
		this.minute = minute;
	}
	public int getSecond() {
		return this.second;
	}
	public void setSecond(int second) {
		//�ʿ� ���� ����ó�� �ڵ带 �ۼ�
				if(second<0 || second >=60 ) {
					System.out.println("�ʸ� �߸� �Է���");
					return;}
				
		this.second = second;
	}
	@Override
	public String toString() {
	return this.getHour() +"��" + this.getMinute() + "��" +
	       this.getSecond() +"��";
	
	}
	
}

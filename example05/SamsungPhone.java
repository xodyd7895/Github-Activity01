package example05;

public class SamsungPhone {

	
	private String company;
	private String model;
	private String color;
	private int release;
	
	
	//getter, setter  ���� 
	public String getCom() {
		return company;
	}
	public void setCom(String company) {
		//����ó���ڵ�
		if(!company.equals("�Ｚ")) {
			System.out.println("�Ｚ���� �ƴ�");
		 return;
		}
		this.company = company;
	}
	
	public String getMod() {
		return model;
	}
	public void setMod(String model) {
		
		//����ó���ڵ�
		if(!model.equals("������")) {
			System.out.println("�Ｚ�� �ƴ�");
			return;
		}
		this.model = model;
	}
	
	public String getCol() {
		return color;
	}
	public void setCol(String color) {
		this.color = color;
	}
	
	public int getrel() {
		return release;
	}
	public void setrel(int release) {
		this.release = release;
	}
	@Override
	public String toString() {
		return this.getCom() + "ȸ���� " + this.getMod() + " ���̸�, �������" + 
				this.getrel() + "�� �̰� "+ "������ " + this.getCol() + "�Դϴ�";
	}
}


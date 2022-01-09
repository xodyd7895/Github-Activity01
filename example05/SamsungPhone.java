package example05;

public class SamsungPhone {

	
	private String company;
	private String model;
	private String color;
	private int release;
	
	
	//getter, setter  구현 
	public String getCom() {
		return company;
	}
	public void setCom(String company) {
		//예외처리코드
		if(!company.equals("삼성")) {
			System.out.println("삼성폰이 아님");
		 return;
		}
		this.company = company;
	}
	
	public String getMod() {
		return model;
	}
	public void setMod(String model) {
		
		//예외처리코드
		if(!model.equals("갤럭시")) {
			System.out.println("삼성꺼 아님");
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
		return this.getCom() + "회사의 " + this.getMod() + " 모델이며, 출시일은" + 
				this.getrel() + "년 이고 "+ "색상은 " + this.getCol() + "입니다";
	}
}


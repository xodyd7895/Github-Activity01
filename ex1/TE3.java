package quiz;

class Refr {
	
	int height;
	int limit_temp;
	int cur_temp;
	String color;
	Boolean power;
	
	Refr(){
		
		height = 150;
		limit_temp = 30;
		cur_temp = 5;
		color = "Black";
		power = true;
	}
	
	public void setCurTemp(int temp) {
		
		if(temp >= 30) {
			cur_temp = temp;
			power = false;
			System.out.println("현재온도: " + cur_temp + "도, 제한온도 초과로 인해 냉장고가 꺼졌습니다.");
			System.out.println();
		}else{
			cur_temp = temp;
			power = true;
			System.out.println("현재온도: " + cur_temp + "도, 전원이 켜져있습니다.");
			System.out.println();
		}
	}
	
	public void getRefr() {
		System.out.println("높이는 " + height + "cm, 색상은 " + color + ", 현재온도는 " + cur_temp+ "도, 제한온도는 " + limit_temp + "도 입니다.");
		if(power) {
			System.out.println("전원은 켜져있습니다.");
		} else {
			System.out.println("전원은 꺼져있습니다.");
		}
		System.out.println();
	}
	
	public void refrTempUp(int temp) {
		
		cur_temp = cur_temp + temp;
		
		if(cur_temp >= 30) {
			power = false;
			System.out.println("현재온도: " + cur_temp + "도, 제한온도로 인해 전원이 꺼졌습니다.");
			System.out.println();
		}else{
			System.out.println("현재온도: " + cur_temp + "도, 전원이 켜져있습니다.");
			power = true;
		}
		
	}
	public void refrTempDown(int temp) {
		
		cur_temp = cur_temp - temp;
		
		if(cur_temp >= 30) {
			power = false;
			System.out.println("현재온도: " + cur_temp + "도, 전원이 꺼져있습니다.");
			System.out.println();
		}else{
			power = true;
			System.out.println("현재온도: " + cur_temp + "도, 전원이 켜졌습니다.");
			System.out.println();
		}
		
	}
	
}

public class TE3 {

	public static void main(String[] args) {
		
		Refr r1 = new Refr();
		r1.setCurTemp(40);
		r1.getRefr();
		
		r1.refrTempDown(10);
		r1.refrTempDown(2);
		
		r1.refrTempUp(11);
	}

}

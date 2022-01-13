package exam1;


/*
					<<interface>>
					   Shape
					     |
          -------------------------------
          |				 |				|
         Circle			Oval		   Rect
         
        r*r*3.14      w*h*3.14		   w*h 

*/

interface Shape{
	
	final double PI = 3.14;
	void draw();
	double getArea();
	
	default public void redraw() {
		System.out.println("---다시 그립니다.");
		draw();
	}
	
}
class Circle implements Shape{
	private double r;
	
	Circle(double r){
		this.r = r;
	}
	public void draw() {
		System.out.println("반지름이"+r+"인 원입니다");
	}
	@Override
	public double getArea() {
		return PI*r*r;
	}
}
class Oval implements Shape{
	private double w, h;
	
	Oval(double w, double h){
		this.w = w;
		this.h = h;
	}
	@Override
	public void draw() {
		System.out.println(w + "x" + h+"에 내접하는 타원입니다");
	}
	public double getArea() {
		return PI*w*h;
	}
}
class Rect implements Shape{
	private double w, h;
	
	Rect(double w, double h){
		this.w = w;
		this.h = h;
	}
	@Override
	public void draw() {
		System.out.println(w + "x" + "크기의 사각형입니다");
	}
	public double getArea() {
		return w*h;
	}
	
}

public class E7 {
	public static void main(String[] args) {
		
		Shape[]list = new Shape[3];
		
		list[0]  = new Circle(10);
		list[1]    = new Oval(20,30);
		list[2]    = new Rect(10,40);
		
		for(int i=0; i<list.length;i++) {
			//배열에 저장된 객체의 redraw()실행
			list[i].redraw();
		}
		for(int i=0; i<list.length;i++) {
			System.out.println("면적은 "+ list[i].getArea());
		}
	}
}
//출력폼
/*
  ---다시 그립니다.반지름이 10.0인 원입니다. 
  ---다시 그립니다.20.0x30.0에 내접하는 타원입니다. 
  ---다시 그립니다.10.0x40.0크기의 사각형 입니다. 
  면적은 314.0 
  면적은 1884.0000000000002 
  면적은 400.0
  
 */







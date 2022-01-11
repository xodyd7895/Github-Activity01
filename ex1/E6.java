package exam1;

import java.util.Scanner;

abstract class Calculator{
		int a;
		int b;
	   
	   abstract void setValue(int a, int b);
	   abstract int calculate();
	   
	}

class Add extends Calculator{
	

	@Override
 void setValue(int a, int b) {
Add.this.a = a;
Add.this.b = b; //재정의
 }

	@Override
 int calculate() {
 
	return (a+b);//재정의
	   }
	   
	}
class Sub extends Calculator{
@Override
void setValue(int a, int b) {   
Sub.this.a = a;
Sub.this.b = b;
//재정의
}

@Override
int calculate() {
return (a-b);
//재정의
}
}
class Mul extends Calculator {

 @Override
void setValue(int a, int b) {
 Mul.this.a = a;
 Mul.this.b = b;
	   }

 @Override
 int calculate() {
 return (a*b); 
//재정의
	   }
	}


class Div extends Calculator {


	   @Override
	   void setValue(int a, int b) {
	      Div.this.a = a;
	      Div.this.b = b;
	   }

	   @Override
	   int calculate() {
	      return (a/b);
		
	   }
	


public class E6 {
	   public static void main(String [] args) {
	      
		   Calculator a =  new Add(); //더하기
		   Calculator s =  new Sub(); //빼기
		   Calculator m =  new Mul(); //곱하기
		   Calculator d =   new Div(); //나누기
	      
	Scanner sc = new Scanner(System.in);
	      
	      while(true) {
	         int x = 0;
	         int y = 0;
	         int result = 0;
	         
	         System.out.print("계산하고 싶은 연사자를 선택해주세요(+(1),-(2),*(3),/(4),종료(5) >> ");
	         int num = sc.nextInt();
	         
	         if(num == 5) {
	        	 System.out.println("종료합니다....");
	            break;
	         }else {
	            System.out.println("계산할 두개의 수를 입력해 주세요>> ");
	            x = sc.nextInt();
	            y = sc.nextInt();
	            
	            switch (num) {
	               case 1: 
	                    a.setValue(x, y);// 값을 설정 구현
	                    result = a.calculate(); // 값을 계산결과 
	                    System.out.println(x+"+"+y+"="+result);
	                    break;
	               case 2:
	                    s.setValue(x, y);// 값을 설정 구현
	                    result = s.calculate(); // 값을 계산결과 
	                    System.out.println(x+"-"+y+"="+result);
	                    break;
	               case 3:
	                    m.setValue(x, y);// 값을 설정 구현
	                    result = m.calculate(); // 값을 계산결과 
	                    System.out.println(x+"*"+y+"="+result);
	                    break;
	               case 4:
	                    d.setValue(x, y);// 값을 설정 구현
	                    result = d.calculate(); // 값을 계산결과 
	                    System.out.println(x+"/"+y+"="+result);
	                    break;
	               }
	         }
	      }
		sc.close();
	      
	   }
}
}
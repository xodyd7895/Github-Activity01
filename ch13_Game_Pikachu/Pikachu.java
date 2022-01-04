package ch13_Game_Pikachu;

public class Pikachu extends Character{

	public Pikachu() {
		hp = 30;
		energy = 50;
		System.out.println("피카츄가 생성되었습니다");
		printInfo();
	}
	@Override
	public void eat() {
		energy +=10;
	}
	@Override
	public void sleep() {
	energy += 5;	
	}
	@Override
	public boolean play() {
	energy -= 20;
	hp += 5;
	levelUp();
	return checkEnergy();
	}
	@Override
	public boolean train() {
	energy -= 15;
	hp+=20;
	levelUp();
	return checkEnergy();
	}
	@Override
	public void levelUp() {
	if(40<=hp) {
		level++;
		hp-=40;
	}
	}
}

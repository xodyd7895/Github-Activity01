package ch13_Game_Pikachu;

public class Lee extends Character {

	public Lee() {
		hp = 20;
		energy = 30;
		System.out.println("�̻��ؾ��� �����Ǿ����ϴ�.");
		printInfo();
	}
	@Override
	public void eat() {
	energy +=5;	
	}
	@Override
	public void sleep() {
	energy += 20;	
	}
	@Override
	public boolean play() {
		energy -= 10;
		hp += 15;
		levelUp();
		return checkEnergy();
	}
	@Override
	public boolean train() {
	energy -= 10;
	hp += 20;
	levelUp();
	return checkEnergy();
	}
	@Override
	public void levelUp() {
	if(35 <= hp) {
		level++;
		hp-= 35;
	}
	}
}

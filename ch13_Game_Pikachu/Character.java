package ch13_Game_Pikachu;
//using java skill n making Game 
public abstract class Character {
	
	protected int hp;
	protected int level = 0;
	protected int energy;
	
	public abstract void eat();
	
	public abstract void sleep();
	
	public abstract boolean play();
	
	public abstract boolean train();
	
	public abstract void levelUp();
	
	public boolean checkEnergy() {
		if(energy <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void printInfo() {
		System.out.println("ÇöÀç Ä³¸¯ÅÍÀÇ Á¤º¸Ãâ·Â");
		System.out.println("hp = " + hp);
		System.out.println("energy = " +energy);
		System.out.println("level = " + level);
	}
	
}

package ch13_Game_Pikachu;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Character character = null;
		PlayGame pg = null;
		System.out.println("원하는 캐릭터를 선택하시오. Wn1.피카츄 2.꼬북이 3.이상해씨");
		
		int x = sc.nextInt();
		switch(x) {
		case 1: 
			character = new Pikachu();
			break;
		case 2:
			character = new Kkobook();
			break;
		case 3:
			character = new Lee();
			break;
		default:
				System.out.println("잘못 선택함요");
		}
		if(character == null) {
			System.out.println("게임 끝");
			return;
		}
		else {
			pg = new PlayGame(character);
		}
		while(true) {
			pg.printMenu(sc);
			if(pg.isExit()) {
				System.out.println("게임 끝");
				break;
			}
		}
		
	}

}

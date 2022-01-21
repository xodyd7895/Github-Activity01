package example02;

public class TvEx {

	public static void main(String[]args) {
		Tv<String> tv1 = new Tv<String>();
		tv1.setE("LG OLED TV");
		String str = tv1.getE();
		System.out.println(str);
	}
}

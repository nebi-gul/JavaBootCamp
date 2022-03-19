package methodsOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplam = dortIslem.Topla(2, 3);
		System.out.println(toplam);
		int cokluToplama = dortIslem.Topla(2,3,4,5,6,7);
		System.out.println(cokluToplama);
	}

}

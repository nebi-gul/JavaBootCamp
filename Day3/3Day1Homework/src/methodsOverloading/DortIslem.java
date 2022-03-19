package methodsOverloading;

public class DortIslem {
	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public int Topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}

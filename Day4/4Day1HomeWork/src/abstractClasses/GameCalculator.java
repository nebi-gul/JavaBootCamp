package abstractClasses;

public abstract class GameCalculator {//Bir s�n�f�n abstract olabilmesi i�in abstract imzas�yla beslenmesi gerekiyor buradaki gibi
	public abstract void hesapla();//Bu metot zorunlu import edilecek ve herkez metodu kendisine g�re yazacak abstract o i�e yar�yor
	
	public final void gameOver() {//final yazarsak bu metot di�er class'larda override edilemez
		System.out.println("Oyun bitti");
	}
}
/*abstract bir s�n�fta abstract metot olmak zorunda de�il.
  abtract s�n�flar tek ba��na new'lenip kullan�lmaz. Kullan�l�rsa i�indeki abstract metotlar� implement edip doldurmak gerekir. 
  O y�zden new'lenip kullanmak do�ru de�ildir.
  Ama kendini extends etmi� s�n�flar�n referans�n� tutabilir.
  
  Di�er classlardan fark� : 
   New'leyemiyoruz newlersek zorunlu metotlar� doldurmal�y�z. 
   Zorunlu metotlar yazabiliyoruz. Her extends eden class zorunlu metotlar� kendi doldurmak zorunda override edecek.
  */
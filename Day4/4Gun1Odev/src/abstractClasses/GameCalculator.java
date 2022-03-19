package abstractClasses;

public abstract class GameCalculator {//Bir sýnýfýn abstract olabilmesi için abstract imzasýyla beslenmesi gerekiyor buradaki gibi
	public abstract void hesapla();//Bu metot zorunlu import edilecek ve herkez metodu kendisine göre yazacak abstract o iþe yarýyor
	
	public final void gameOver() {//final yazarsak bu metot diðer class'larda override edilemez
		System.out.println("Oyun bitti");
	}
}
/*abstract bir sýnýfta abstract metot olmak zorunda deðil.
  abtract sýnýflar tek baþýna new'lenip kullanýlmaz. Kullanýlýrsa içindeki abstract metotlarý implement edip doldurmak gerekir. 
  O yüzden new'lenip kullanmak doðru deðildir.
  Ama kendini extends etmiþ sýnýflarýn referansýný tutabilir.
  
  Diðer classlardan farký : 
   New'leyemiyoruz newlersek zorunlu metotlarý doldurmalýyýz. 
   Zorunlu metotlar yazabiliyoruz. Her extends eden class zorunlu metotlarý kendi doldurmak zorunda override edecek.
  */
package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {/*Bu metotda double dan önce final yazarsak diðer sýnýflarda 
	override edilemek yani ezilemez */
		return tutar * 1.18;
	}
}

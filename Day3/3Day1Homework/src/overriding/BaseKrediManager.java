package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {/*Bu metotda double dan �nce final yazarsak di�er s�n�flarda 
	override edilemek yani ezilemez */
		return tutar * 1.18;
	}
}

package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	/*Burada hesapla metodunu ezdik.C# da virtual metotlarla yapýlýr. Java da override olarak geçer.
	 * Java da bir class'ýn herhangi bir metodu siz aksini belirtmedikçe üzerine yazýlabilir yani ezebilir. 
	 * Java da bir metodun override(ezmek) edilmesini istemiyorsan Base class da o metodun önüne final
	 * yazmalýsýn.*/
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}

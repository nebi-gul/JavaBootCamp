package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	/*Burada hesapla metodunu ezdik.C# da virtual metotlarla yap�l�r. Java da override olarak ge�er.
	 * Java da bir class'�n herhangi bir metodu siz aksini belirtmedik�e �zerine yaz�labilir yani ezebilir. 
	 * Java da bir metodun override(ezmek) edilmesini istemiyorsan Base class da o metodun �n�ne final
	 * yazmal�s�n.*/
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}

package staticDemo;

public class ProductValidator {/*Ana class static olamaz Javada C# da olur. Ama bu class i�inde ba�ka class olu�turup onu static 
yapabiliriz.Buna Inner class denir. */
	
	static {
		System.out.println("Static yap�c� blok �al��t�");
	}
	
	public ProductValidator() { /* Yap�c� blok static metot kullan�ld���nda �al��maz s�n�f newlendi�inde �al���r.
	Javan�n C# dan fark�d�r bu.C# da yap�c� blok staticde de �al���r. 
	Java da staticde �al��t�rmak i�in static yap�c� metor olu�turmak gerekir. Yukar�daki statci yap�c� metoduna bak */
		System.out.println("Yap�c� blok �al��t�");
	}
	
	public static boolean isValid(Product product) {/*Static uygulama duruncaya kadar bellekte durur. new lersek i�lem bitince 
	bellekten at�l�r. Manager s�n�flar� static yap�laz ��nk� static oldu�u gibi durur ve herkez onu kullan�r. Validator gibi
	yard�mc� s�n�flar yap�alabilir.*/
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {//static metodun oldu�u yerde static olmayan metot olabilir. Bunun kullanmak i�in s�n�f� newleriz.
		
	}
	
}

package staticDemo;

public class ProductValidator {/*Ana class static olamaz Javada C# da olur. Ama bu class içinde baþka class oluþturup onu static 
yapabiliriz.Buna Inner class denir. */
	
	static {
		System.out.println("Static yapýcý blok çalýþtý");
	}
	
	public ProductValidator() { /* Yapýcý blok static metot kullanýldýðýnda çalýþmaz sýnýf newlendiðinde çalýþýr.
	Javanýn C# dan farkýdýr bu.C# da yapýcý blok staticde de çalýþýr. 
	Java da staticde çalýþtýrmak için static yapýcý metor oluþturmak gerekir. Yukarýdaki statci yapýcý metoduna bak */
		System.out.println("Yapýcý blok çalýþtý");
	}
	
	public static boolean isValid(Product product) {/*Static uygulama duruncaya kadar bellekte durur. new lersek iþlem bitince 
	bellekten atýlýr. Manager sýnýflarý static yapýlaz çünkü static olduðu gibi durur ve herkez onu kullanýr. Validator gibi
	yardýmcý sýnýflar yapýalabilir.*/
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {//static metodun olduðu yerde static olmayan metot olabilir. Bunun kullanmak için sýnýfý newleriz.
		
	}
	
}

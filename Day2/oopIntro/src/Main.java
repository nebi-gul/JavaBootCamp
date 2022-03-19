
public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo V14",13000,"16 GB RAM");// örnek oluşturma,referans oluşturma,instance
		

		Product product2 = new Product();//ykardaki gibi de yazılır
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 14000;
		product2.details = "8 gb RAM";

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Lenovo V20";
		product3.unitPrice = 19000;
		product3.details = "32 gb RAM";

		Product product4 = new Product();
		product4.id = 4;
		product4.name = "Hp5";
		product4.unitPrice = 17000;
		product4.details = "6 gb RAM";

		Product[] products = { product1, product2, product3, product4 };

		for (Product product : products) {
			System.out.println(product.name+product.details);
		}
		
		Category category1 =new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 =new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		productManager.addToCart(product4);
		
		
		
		
		
	}

}

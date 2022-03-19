
public class Product {
	
	public Product() {//yapıcı class
		System.out.println("Ben Çalıştım");
	}
public Product(int id,String name,double unitPrice,String details) {
	this();
	this.id=id;
	this.name=name;
	this.unitPrice=unitPrice;
	this.details=details;
		
	}
	int id;
	String name;
	double unitPrice;
	String details;
	 
}

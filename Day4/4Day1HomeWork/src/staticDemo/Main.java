package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager= new ProductManager();
		Product product = new Product();
		product.price=10;
		product.name="Mouse";
		
		manager.add(product);
		
		DatabaseHelper.Crud.Delete();/*static class bu þekilde kullanýlabilr.Inner classlarla ilgili bir kullanýmdýr.
		Ama bu þekilde kullanýmlarý Bes Practice'ler önermiyor. SOLID- S prensibi buna izin vermez tek class tek iþ yapmalý.
		Günümüzde çok kullanýlmýyor */
	}

}

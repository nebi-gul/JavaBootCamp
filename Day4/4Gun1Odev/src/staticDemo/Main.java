package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager= new ProductManager();
		Product product = new Product();
		product.price=10;
		product.name="Mouse";
		
		manager.add(product);
		
		DatabaseHelper.Crud.Delete();/*static class bu �ekilde kullan�labilr.Inner classlarla ilgili bir kullan�md�r.
		Ama bu �ekilde kullan�mlar� Bes Practice'ler �nermiyor. SOLID- S prensibi buna izin vermez tek class tek i� yapmal�.
		G�n�m�zde �ok kullan�lm�yor */
	}

}

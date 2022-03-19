package interfaces;

public class CustomerManager {
	
	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void add() {
		// i� kodlar�. M��teri ad� girilmi�mi, tc do�rumu bunlar burada yaz�l�r.
		customerDao.add();
	}
}

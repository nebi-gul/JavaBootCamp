package interfaces;

public class Main {

	public static void main(String[] args) {
		//CustomerDao customerDao= new MySqlCustomerDao();
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDao());
		customerManager.add();
	}

}

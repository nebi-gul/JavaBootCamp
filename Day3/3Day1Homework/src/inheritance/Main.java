package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.firstName = "Engin";
		employee.firstName = "Veli";
		
		EmployeeManager employeeManager= new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
	}

}

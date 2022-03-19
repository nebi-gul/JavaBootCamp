package interfaceAbstractDemo.Concretes;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		
		/*if(customer.firstName!="ali"){
			System.out.println("isim hatalý");
		}*/
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Mernis doðrulandý");
			super.save(customer);
		}else {
			throw new Exception("Not a valid person");
		}

	}

}

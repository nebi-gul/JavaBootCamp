package interfaceAbstractDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Adapter.MernisServisAdapter;
import interfaceAbstractDemo.Concretes.CustomerCheckManager;
import interfaceAbstractDemo.Concretes.NeroCustomerManager;
import interfaceAbstractDemo.Concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		Customer customer= new Customer();
		customer.id=1;
		customer.firstName="Engin";
		customer.lastName="Demiroð";
		customer.dateOfBirth = LocalDate.parse("1985-01-06");//Mernis kontrol ederken doðum yýlýný alýyor. 1986 yap hata verir mernis
		customer.nationalityId="28861499108";
		//System.out.println(customer.dateOfBirth);
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServisAdapter());
		customerManager.save(customer);
		
	}

}

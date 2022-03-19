package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

/*' firmada ayný veri tabaný tablosuna kaydetmek istiyor o yüzden BaseCustomerManageroluþturup CustomerService'i buraya implement
 * edip  BaseCustomerManager i Nero ve Starbucks'ýn Manager'lerine extends ettik. Ayný kodlar olacak iki Managerdede o yüzden 
 * böyle yaptýk*/
public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to db : " + customer.firstName);
	}

}

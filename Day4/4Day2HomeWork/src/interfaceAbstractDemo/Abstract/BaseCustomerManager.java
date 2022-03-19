package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

/*' firmada ayn� veri taban� tablosuna kaydetmek istiyor o y�zden BaseCustomerManagerolu�turup CustomerService'i buraya implement
 * edip  BaseCustomerManager i Nero ve Starbucks'�n Manager'lerine extends ettik. Ayn� kodlar olacak iki Managerdede o y�zden 
 * b�yle yapt�k*/
public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to db : " + customer.firstName);
	}

}

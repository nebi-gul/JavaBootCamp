package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

public interface CustomerService {//CustomerService temel bir interface g�revi g�recek.Nesnelerin temel bir CustomerService'i vard�r
	void save(Customer customer) throws Exception;
}

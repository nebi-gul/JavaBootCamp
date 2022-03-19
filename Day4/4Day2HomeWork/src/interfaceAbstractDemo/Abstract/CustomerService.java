package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

public interface CustomerService {//CustomerService temel bir interface görevi görecek.Nesnelerin temel bir CustomerService'i vardýr
	void save(Customer customer) throws Exception;
}
